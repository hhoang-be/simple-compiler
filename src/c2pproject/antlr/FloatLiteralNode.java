package c2pproject.antlr;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.*;

public class FloatLiteralNode extends ASTNode {
	float value;
	FloatTypeDescriptor typeRef;
	
	FloatLiteralNode(){
		typeRef = new FloatTypeDescriptor();
		this.nodeType = "FloatLiteralNode";
		this.nodeAttributes.variableType = typeRef;
	}
	
	FloatLiteralNode(Token inputToken){
		value = Float.parseFloat(inputToken.getText());
		typeRef = new FloatTypeDescriptor();
		this.nodeType = "FloatLiteralNode";
		this.nodeAttributes.variableType = typeRef;
	}
	
	FloatLiteralNode(float inputValue){
		value = inputValue;
		typeRef = new FloatTypeDescriptor();
		this.nodeAttributes.variableType = typeRef;
	}
	
	public FloatTypeDescriptor ExprSemantics(SymbolTableSet tableSet){
		return typeRef;
	}
	
	public TypeDescriptor LvalueSemantics(SymbolTableSet tableSet){
		return new ErrorType();
	}
	
	public void GenLoadLiteral(TypeDescriptor inputType, float inputValue, FileWriter fileWriter, SymbolTableSet tableSet){
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
