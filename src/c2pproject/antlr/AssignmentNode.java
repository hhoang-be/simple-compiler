package c2pproject.antlr;

import java.io.FileWriter;
import java.io.IOException;

public class AssignmentNode extends ASTNode {
	TypeDescriptor assignmentType;
	ASTNode targetName;
	ASTNode valueExpr;
	
	AssignmentNode(ASTNode decl, ASTNode expr){
		this.nodeType = "AssignmentNode";
		if(decl != null){
			targetName = decl;
			targetName.parent = this;
			
		} else{
			new GenerateError("Illegal assigment statement. Target variable is null <AssignmentNode.Constructor>");
		}
		
		if(expr != null){
			valueExpr = expr;
			valueExpr.parent = this;
		} else {
			new GenerateError("Illegal assigment statement. Right value expression is null <AssignmentNode.Constructor>");
		}
	}
	
	protected TypeDescriptor isAssignable(TypeDescriptor iLeftType, TypeDescriptor iRightType){
		if((iLeftType.typeName.equals("error")) || (iRightType.typeName.equals("error"))){
			return new ErrorType();
		}
		
		TypeDescriptor tempType = iLeftType;
		
		if(iLeftType.typeName.equals("array")){
			tempType = ((ArrayTypeDescriptor)iLeftType).elementType;
		}
		
		if((iRightType.typeName.equals("float")) && (!tempType.typeName.equals("float"))){
			return new ErrorType();
		} else if((iRightType.typeName.equals("int")) && (tempType.typeName.equals("char"))){
			return new ErrorType();
		}
		return tempType;
	}
	
	public void Semantics(SymbolTableSet tableSet){

		if(this.targetName == null){
			new GenerateError("Error. Illegal assigment statement.<AssignmentNode.Semantics>");
		} else {
			this.targetName.Semantics(tableSet);
		}
	
		if(this.valueExpr ==null){
			new GenerateError("Error. Illegal assigment statement.<AssignmentNode.Semantics>");
		} else {
			this.valueExpr.Semantics(tableSet);
		}
		
		TypeDescriptor leftType = targetName.LvalueSemantics(tableSet);
		TypeDescriptor rightType = valueExpr.ExprSemantics(tableSet);
		this.assignmentType = isAssignable(leftType, rightType);
		
		if(this.assignmentType.typeName.equals("error")){
			String errorMess = "Illegal assignment statement. Can not assign " + rightType.typeName + " value to " + leftType.typeName + " variable. <AssignmentNode.Semantics>";
			new GenerateError(errorMess);
		}
	}
	
	
	public void CodeGen(FileWriter fileWriter, SymbolTableSet tableSet){
		String generatedCode = "";
		
		int Lvalue = ((declaratorNode)this.targetName).address.offset;


		if(((declaratorNode)this.targetName).isArrayVariable) {
			//compute the array index and put on the top of the stack
			((declaratorNode)this.targetName).arrayExpr.CodeGen(fileWriter, tableSet);
			
			//compute the distance from this element to the first element = index * size of array element
			generatedCode = generatedCode + "ldc i " + ((ArrayTypeDescriptor)this.targetName.nodeAttributes.variableType).elementType.typeSize + this.lineCarret;

			generatedCode = generatedCode + "mul i" + this.lineCarret;
			
			//load the address of array variable
			generatedCode = generatedCode + "ldc i " + this.targetName.address.offset + this.lineCarret;
							
			//==> the offset of array element;
			generatedCode = generatedCode + "add i" + this.lineCarret;
			
			//convert to address type
			generatedCode = generatedCode + "conv i a" + this.lineCarret;
	
			
		} else {
			//put the address of variable on the top of the stack
			generatedCode = generatedCode + "ldc a " + Integer.toString(Lvalue) + this.lineCarret;
			
		}
		
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}

		
		//put the value of right expression on top of the stack
		this.valueExpr.CodeGen(fileWriter, tableSet);
		
		//convert right value to the same format as left
		if(this.valueExpr.isArrayVariable){
			generatedCode = "conv " + ((ArrayTypeDescriptor)valueExpr.nodeAttributes.variableType).elementType.abbreviateTypeName + " " + this.assignmentType.abbreviateTypeName + this.lineCarret;
		} else{
			if(valueExpr.nodeType.equals("callNode")){
				generatedCode = "conv " + ((methodDefItem)valueExpr.nodeAttributes.variableType).returnType.abbreviateTypeName + " " + this.assignmentType.abbreviateTypeName + this.lineCarret;
				
			} else{
			
				//generatedCode = "conv " + valueExpr.nodeAttributes.variableType.abbreviateTypeName + " " + this.assignmentType.abbreviateTypeName + this.lineCarret;
				generatedCode = "conv " + valueExpr.nodeAttributes.variableType.abbreviateTypeName + " " + this.assignmentType.abbreviateTypeName + this.lineCarret;
			}
		}
			
		
		if(((declaratorNode)this.targetName).funcLevel < tableSet.funcLevel){
			//khong biet doan nay xu li the nao day??????????????????????????
			generatedCode = generatedCode + "str 0 " + this.assignmentType.abbreviateTypeName + this.lineCarret;
		} else {

			generatedCode = generatedCode + "sto " + this.assignmentType.abbreviateTypeName + this.lineCarret;
		}
		
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
	}

}
