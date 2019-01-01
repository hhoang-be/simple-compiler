package c2pproject.antlr;

import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.Token;

public class IntLiteralNode extends ASTNode {
	int value;
	IntTypeDescriptor typeRef;
	
	IntLiteralNode(){
		this.nodeType = "IntLiteralNode";
		typeRef = new IntTypeDescriptor();
		this.nodeAttributes.variableType = typeRef;
	}
	
	IntLiteralNode(Token inputToken){
		this.nodeType = "IntLiteralNode";
		value = Integer.parseInt(inputToken.getText());
		typeRef = new IntTypeDescriptor();
		this.nodeAttributes.variableType = typeRef;
	}
	
	IntLiteralNode(int inputValue){
		this.nodeType = "IntLiteralNode";
		value = inputValue;
		typeRef = new IntTypeDescriptor();
		this.nodeAttributes.variableType = typeRef;
	}
	
	public IntTypeDescriptor ExprSemantics(SymbolTableSet tableSet){
		return typeRef;
	}
	
	public TypeDescriptor LvalueSemantics(SymbolTableSet tableSet){
		return new ErrorType();
	}
	
	public void GenLoadLiteral(TypeDescriptor inputType, int inputValue, FileWriter fileWriter, SymbolTableSet tableSet){

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
