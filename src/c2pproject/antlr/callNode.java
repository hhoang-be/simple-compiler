package c2pproject.antlr;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.*;

public class callNode extends ASTNode{
	exprsNode args;
	
	callNode(Token inputFuncName, ASTNode inputPara){
		this.nodeType = "callNode";
		if(inputFuncName != null){
			this.nameASTNode = inputFuncName.getText();
		}
		
		if(inputPara != null){
			args = (exprsNode)inputPara;
		} else{
			args = null;
			System.out.println("Function without input parameters. <callNode.callNode>");
		}
	}
	
	callNode(){
		this.nodeType = "callNode";
		args = null;
	}
	
	public boolean isParameterCompatible(exprsNode inputPara, typeItem defPara, SymbolTableSet tableSet){
		exprsNode tempNode = inputPara;
		typeItem tempType = defPara;

		while(tempNode != null){
			if(tempType == null){
				return false;
			}
			
			if (!(tempNode.expr.ExprSemantics(tableSet).typeName.equals(tempType.type.typeName))){
				return false;
			}
			
			tempNode = tempNode.more;
			tempType = tempType.next;
		}
		
		if(tempType != null){
			return false;
		} else {
			return true;
		}
	}
	
	public void Semantics(SymbolTableSet tableSet){
		exprsNode exprsTempNode = this.args;
		
		tableSet.IncrFuncLevel();
		
		while(exprsTempNode != null){
			exprsTempNode.Semantics(tableSet);
			exprsTempNode = exprsTempNode.more;
		}
		
		tableSet.DecrFuncLevel();
		
		ASTNode tempNode = tableSet.isDeclaredGlobal(this.nameASTNode);

		if(tempNode == null){
			String errMess = "Error. Function " + this.nameASTNode + " has not been declared yet.<callNode.Semantics>";
			new GenerateError(errMess);
		}
		
		TypeDescriptor tempTypeDescriptor = tempNode.nodeAttributes.variableType;
		methodDefItem tempMethodType = (methodDefItem)tempTypeDescriptor;
		
		typeItem tempType = tempMethodType.argTypes;
		exprsNode tempExprsNode = args;
		if(!this.isParameterCompatible(tempExprsNode, tempType, tableSet)){
			String errMess = ("Error in calling function " + this.nameASTNode + ". Input parameters are not compatible." );
			new GenerateError(errMess);
		} else{
			this.nodeAttributes = tempNode.nodeAttributes;
		}
		

	}
	
	public TypeDescriptor ExprSemantics(SymbolTableSet tableSet){
		ASTNode tempNode = tableSet.isDeclaredGlobal(this.nameASTNode);
		
		if(tempNode == null){ 
			System.out.println("Error. Function " + this.nameASTNode + " has not been declared yet.<callNode.Semantics>");
			return new ErrorType();
		}
		methodDefItem tempMethodType = (methodDefItem)(tempNode.nodeAttributes.variableType);
		typeItem tempType = tempMethodType.argTypes;
		exprsNode tempExprsNode = args;
		
		if(!this.isParameterCompatible(tempExprsNode, tempType, tableSet)){
			System.out.println("Error in calling function " + this.nameASTNode + ". Input parameter is not compatible." );
			return new ErrorType();
		} else{
			this.nodeAttributes = tempNode.nodeAttributes;
			//return the return value of function. Do not care about types of parameters
			return tempMethodType.returnType;
		}
		
	}
	
	public void CodeGen(FileWriter fileWriter, SymbolTableSet tableSet){
		tableSet.IncrFuncLevel();
		
		String generatedCode = "";
		generatedCode = "mst 0" + this.lineCarret;
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
		
		//generate code to load parameters
		//point to the beginning of parameter lists
		exprsNode exprsTempNode = this.args;
		
		int i = 0; // the number of input parameters
		while(exprsTempNode != null){
			i++;
			exprsTempNode.CodeGen(fileWriter, tableSet);
			exprsTempNode = exprsTempNode.more;
		}
		
		
		generatedCode = "cup " + Integer.toString(i) + " $func_" + this.nameASTNode + this.lineCarret;
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
		
		tableSet.DecrFuncLevel();
	}

}
