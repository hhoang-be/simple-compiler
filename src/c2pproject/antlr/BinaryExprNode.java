package c2pproject.antlr;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.*;

import org.antlr.runtime.Token;

public class BinaryExprNode extends ASTNode {
	public TypeDescriptor nodeTypeRef;
	public Token operator;
	public ASTNode leftNode, rightNode;
	
	BinaryExprNode(Token inputOperator, ASTNode sign_1, ASTNode sign_2){
		this.nodeType = "BinaryExprNode";
		this.nameASTNode = "BinaryExprNode";
		if(inputOperator != null){
			operator = new CommonToken(inputOperator);
			leftNode = sign_1;
			rightNode = sign_2;
			
			if(sign_1 != null){
				sign_1.parent = this;
			}
			
			if(sign_2 != null){
				sign_2.parent = this;
			}
			
		} else{
			System.out.println("Error in BinaryExprNode. inputOperator == null");
		}
	}
	
	protected TypeDescriptor AutomaticCastingType(TypeDescriptor leftType, TypeDescriptor rightType){
		TypeDescriptor tempType;
		
		if((leftType.typeName.equals("error")) || (rightType.typeName.equals("error"))){
			return new ErrorType();
		}
		
		if(leftType.typeName.equals("char")){
			tempType = rightType;
		} else if(rightType.typeName.equals("char")){
			tempType = leftType;
		} else if((leftType.typeName.equals("int")) && (rightType.typeName.equals("float"))){
			tempType = rightType;
		} else if ((leftType.typeName.equals("float")) && (rightType.typeName.equals("int"))){
			tempType = leftType;
		} else{
			tempType = leftType; // or tempType = rightType;
		}
		
		return tempType;
	}
	
	public TypeDescriptor ExprSemantics(SymbolTableSet tableSet){
		TypeDescriptor leftType = leftNode.ExprSemantics(tableSet);
		TypeDescriptor rightType = rightNode.ExprSemantics(tableSet);
		
		if((leftNode != null) && (leftNode.nodeAttributes.variableType.typeName.equals("array"))){
			leftType = ((ArrayTypeDescriptor)leftNode.nodeAttributes.variableType).elementType;
		}
		
		if ((rightNode != null) && (rightNode.nodeAttributes.variableType.typeName.equals("array"))){
			rightType = ((ArrayTypeDescriptor)rightNode.nodeAttributes.variableType).elementType;
		}
		
		TypeDescriptor tempType = this.AutomaticCastingType(leftType, rightType);
		
		this.nodeTypeRef = tempType;
		return this.nodeTypeRef;
	}
	
	public TypeDescriptor LvalueSemantics(SymbolTableSet tableSet){
		return new ErrorType();
	}
	
	public void CodeGen(FileWriter fileWriter, SymbolTableSet tableSet){
		String generatedCode = "";
		
		//convert left node and right node to the same number format as node type
		this.leftNode.CodeGen(fileWriter, tableSet);
		
		if(this.leftNode.isArrayVariable){
			generatedCode = "conv " + ((ArrayTypeDescriptor)leftNode.nodeAttributes.variableType).elementType.abbreviateTypeName + " " + this.nodeTypeRef.abbreviateTypeName + this.lineCarret;
		} else {	
			generatedCode = "conv " + leftNode.nodeAttributes.variableType.abbreviateTypeName + " " + this.nodeTypeRef.abbreviateTypeName + this.lineCarret;
		}
		
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
		
		this.rightNode.CodeGen(fileWriter, tableSet);
		if(this.rightNode.isArrayVariable){
			generatedCode = "conv " + ((ArrayTypeDescriptor)rightNode.nodeAttributes.variableType).elementType.abbreviateTypeName + " " + this.nodeTypeRef.abbreviateTypeName + this.lineCarret;
		} else {	
			generatedCode = "conv " + rightNode.nodeAttributes.variableType.abbreviateTypeName + " " + this.nodeTypeRef.abbreviateTypeName + this.lineCarret;
		}
		
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
		
		
		if(this.operator.getText().equals("+")){
			generatedCode = "add " + this.nodeTypeRef.abbreviateTypeName + this.lineCarret;
			
		} else if(this.operator.getText().equals("-")){
			generatedCode = "sub " + this.nodeTypeRef.abbreviateTypeName + this.lineCarret;
			
		} else if(this.operator.getText().equals("*")){
			generatedCode = "mul " + this.nodeTypeRef.abbreviateTypeName + this.lineCarret;
			
		} else if(this.operator.getText().equals("/")){
			generatedCode = "div " + this.nodeTypeRef.abbreviateTypeName + this.lineCarret;
			
		} else if(this.operator.getText().equals("mod")){
			
			
		} else if(this.operator.getText().equals(">")){
			generatedCode = "grt " + this.nodeTypeRef.abbreviateTypeName + this.lineCarret;			
			
		} else if(this.operator.getText().equals(">=")){
			generatedCode = "geq " + this.nodeTypeRef.abbreviateTypeName + this.lineCarret;
			
		} else if(this.operator.getText().equals("<")){
			generatedCode = "les " + this.nodeTypeRef.abbreviateTypeName + this.lineCarret;
			
		} else if(this.operator.getText().equals("<=")){
			generatedCode = "leq " + this.nodeTypeRef.abbreviateTypeName + this.lineCarret;
			
		} else if(this.operator.getText().equals("==")){
			generatedCode = "equ " + this.nodeTypeRef.abbreviateTypeName + this.lineCarret;
			
		} else if(this.operator.getText().equals("!=")){
			generatedCode = "equ " + this.nodeTypeRef.abbreviateTypeName + this.lineCarret;
			generatedCode = "not" + this.lineCarret;
			
		} else if(this.operator.getText().equals("&&")){
			generatedCode = "and" + this.lineCarret;
			
		} else if(this.operator.getText().equals("||")){
			generatedCode = "or" + this.lineCarret;
		}
		
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
	}
	
	public void Semantics(SymbolTableSet tableSet){
		this.leftNode.Semantics(tableSet);
		this.rightNode.Semantics(tableSet);
		this.nodeAttributes.variableType = this.ExprSemantics(tableSet);
	}

}
