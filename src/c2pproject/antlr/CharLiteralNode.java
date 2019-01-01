package c2pproject.antlr;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.*;

public class CharLiteralNode extends ASTNode{
	String value;
	CharTypeDescriptor typeRef;
	
	CharLiteralNode(){
		typeRef = new CharTypeDescriptor();
		this.nodeType = "CharLiteralNode";
		this.nodeAttributes.variableType = typeRef;
	}
	
	CharLiteralNode(Token inputToken){
		//value = inputToken.getText().charAt(0);
		value = inputToken.getText();
		typeRef = new CharTypeDescriptor();
		this.nodeType = "CharLiteralNode";
		this.nodeAttributes.variableType = typeRef;
	}
	
	CharLiteralNode(String inputValue){
		value = inputValue;
		typeRef = new CharTypeDescriptor();
		this.nodeAttributes.variableType = typeRef;
	}
	
	public CharTypeDescriptor ExprSemantics(SymbolTableSet tableSet){
		return typeRef;
	}
	
	public TypeDescriptor LvalueSemantics(SymbolTableSet tableSet){
		return new ErrorType();
	}
	
	//load the value to the top of the stack
	public void GenLoadLiteral(TypeDescriptor inputType, String inputValue, FileWriter fileWriter, SymbolTableSet tableSet){
		String generatedCode = "ldc " + inputType.abbreviateTypeName + " " + this.value + this.lineCarret;
		
		
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
	}
	
	public void CodeGen(FileWriter fileWriter, SymbolTableSet tableSet){
		this.GenLoadLiteral(this.typeRef, this.value, fileWriter, tableSet);
	}
	
	
}
