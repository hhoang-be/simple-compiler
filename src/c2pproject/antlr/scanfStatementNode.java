package c2pproject.antlr;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.*;

public class scanfStatementNode extends ASTNode {
	String fmtString;
	declaratorNode inVariable;
	TypeDescriptor inType = null;
	
	scanfStatementNode(Token inputString, ASTNode tempVariable){
		this.nodeType = "scanfStatementNode";
		if(inputString != null){
			this.fmtString = inputString.getText();

			if(fmtString.matches("(?i).*%d*.")){
				inType = new IntTypeDescriptor();
				this.fmtString = this.fmtString.replaceAll("%d", "");
				
			} else if(fmtString.matches("(?i).*%c.*")){
				inType = new CharTypeDescriptor();
				this.fmtString = this.fmtString.replaceAll("%c", "");
				
			} else if(fmtString.matches("(?i).*%f.*")){
				inType = new FloatTypeDescriptor();
				this.fmtString = this.fmtString.replaceAll("%f", "");
				
			} else {
				System.out.println("Error. Illegal scanf statement. No format string for input variable. scanfStatement.Constructor");
			}

		} else {
			System.out.println("Error. Illegal scanf statement. No format string for input variable. scanfStatement.Constructor");
		}
		
		if(tempVariable != null){
			this.inVariable = (declaratorNode)tempVariable;
			this.inVariable.parent = this;
		}
	}
	
	public void Semantics(SymbolTableSet tableSet){
		if(inVariable != null){
			inVariable.Semantics(tableSet);
			if(inType == null){
				new GenerateError("Error. Illegal scanf statement. No format string assigned.<scanfStatementNode.Semantics>");
			} else {
				
				if(inType.typeName.equals("array")){
					if (((ArrayTypeDescriptor)inVariable.nodeAttributes.variableType).elementType.typeName.equals(inType.typeName) == false){
						new GenerateError("Error. Illegal scanf statement. The format string is not compatible with variable.<scanfStatementNode.Semantics>");
					}
				} else{
					if ((inVariable.nodeAttributes.variableType.typeName.equals(inType.typeName) == false)){
						new GenerateError("Error. Illegal scanf statement. The format string is not compatible with variable.<scanfStatementNode.Semantics>");
					}
				}
			}
		} else {
			new GenerateError("Error. Illegal scanf statement. No input variable assigned.<scanfStatementNode.Semantics>");
		}
	}
	
	public void CodeGen(FileWriter fileWriter, SymbolTableSet tableSet){
		//this.fmtString.replaceAll("%d", "");
		String generatedCode = "";
		//print out the text
		for(int i=1; i < fmtString.length()-1; i++){
			generatedCode = generatedCode + "ldc c " + "'" + fmtString.charAt(i) + "'" + this.lineCarret;
			generatedCode = generatedCode + "out c" + this.lineCarret;
		}
		//load the value from stdin
		generatedCode = generatedCode + "in " + this.inType.abbreviateTypeName + this.lineCarret;
		
		if(this.inVariable.funcLevel < tableSet.funcLevel){
			generatedCode = generatedCode + "str " + this.inType.abbreviateTypeName + " 0 " + Integer.toString(this.inVariable.address.offset) + this.lineCarret;
		} else {
			generatedCode = generatedCode + "sro " + this.inType.abbreviateTypeName + " " + Integer.toString(this.inVariable.address.offset) + this.lineCarret;
		}
		
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}

	}

}
