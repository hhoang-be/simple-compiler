package c2pproject.antlr;

import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.*;

public class UnaryExprNode extends ASTNode {
	public TypeDescriptor nodeTypeRef;
	public Token operator;
	public ASTNode subExpr;
	
	UnaryExprNode(Token inputOperator, ASTNode primitive){
		this.nodeType = "UnaryExprNode";
		this.nameASTNode = "UnaryExprNode";
		
		if(inputOperator != null){
			operator = new CommonToken(inputOperator);
			if(primitive != null){
				subExpr = primitive;
				primitive.parent = this;
			} else {
				System.out.println("Error in UnaryExprNode. primitive == null");
			}
		} else{
			System.out.println("Error in UnaryExprNode. inputOperator == null");
		}
	}
	
	public TypeDescriptor ExprSemantics(SymbolTableSet tableSet){
		TypeDescriptor tempType = subExpr.ExprSemantics(tableSet);
		if(tempType.typeName.endsWith("error")){
			System.out.println("Warning. Error in sub expression of unary expression node.");
		}
		
		this.nodeTypeRef = tempType;
		return this.nodeTypeRef;
	}
	
	public TypeDescriptor LvalueSemantics(SymbolTableSet tableSet){
		return new ErrorType();
	}
	
	
	public void CodeGen(FileWriter fileWriter, SymbolTableSet tableSet){
		String generatedCode = "";
		this.subExpr.CodeGen(fileWriter, tableSet);
		
		if(this.operator.getText().equals("!")){
			generatedCode = "not" + this.lineCarret;
			
		} else if(this.operator.getText().equals("-")){
			generatedCode = "neg " + this.nodeTypeRef.abbreviateTypeName + this.lineCarret;

		}  else if(this.operator.getText().equals("+")){
			//Do nothing
		}
		
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
	}
	
	public void Semantics(SymbolTableSet tableSet){
		this.subExpr.Semantics(tableSet);
		
	}


}
