package c2pproject.antlr;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.*;

public class printfStatementNode extends ASTNode{
	String formatString;
	ASTNode outputExpr;
	TypeDescriptor outputType;

	
	printfStatementNode(Token inputString, ASTNode inputExpr){
		this.nodeType = "printfStatementNode";
		if(inputString != null){
			this.formatString = inputString.getText();

			if(formatString.matches("(?i).*%d*.")){
				outputType = new IntTypeDescriptor();
				this.formatString = this.formatString.replaceAll("%d", "");
			} else if(formatString.matches("(?i).*%c.*")){
				outputType = new CharTypeDescriptor();
				this.formatString = this.formatString.replaceAll("%c", "");
			} else if(formatString.matches("(?i).*%f.*")){
				outputType = new FloatTypeDescriptor();
				this.formatString = this.formatString.replaceAll("%f", "");
			}

			
			
		} else {
			this.formatString = "";
		}
		
		if(inputExpr != null){
			this.outputExpr = inputExpr;
			this.outputExpr.parent = this;
		}
	}
	
	public void Semantics(SymbolTableSet tableSet){
		if(outputExpr != null){
			outputExpr.Semantics(tableSet);
			
			if(outputType != null){
				if(outputType.typeName.equals("array")){
					if (((ArrayTypeDescriptor)outputExpr.nodeAttributes.variableType).elementType.typeName.equals(outputType.typeName) == false){
						new GenerateError("Error. Illegal printf statement. The format string is not compatible with variable.<scanfStatementNode.Semantics>");
					}
					
				} else{
					if (outputExpr.nodeAttributes.variableType.typeName.equals(outputType.typeName) == false){
						new GenerateError("Error. Illegal printf statement. The format string is not compatible with variable.<scanfStatementNode.Semantics>");
					}
				}
			}
		} 
	}
	
	
	public void CodeGen(FileWriter fileWriter, SymbolTableSet tableSet){

		String generatedCode = "";
		//print out the text
		for(int i=1; i < formatString.length()-1; i++){
			generatedCode = generatedCode + "ldc c " + "'" + formatString.charAt(i) + "'" + this.lineCarret;
			generatedCode = generatedCode + "out c" + this.lineCarret;
		}

		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
		
		
		generatedCode = "";
		if(this.outputExpr != null){
			this.outputExpr.CodeGen(fileWriter, tableSet);
			generatedCode = "out " + this.outputType.abbreviateTypeName + this.lineCarret;
		}
		
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
	}

}
