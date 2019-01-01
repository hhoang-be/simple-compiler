package c2pproject.antlr;
import org.antlr.runtime.*;
import java.io.*;

public class VarDeclNode extends ASTNode {
	ASTNode varName;
	TypeDescriptor varType;
	ASTNode initialization;
	VarDeclNode(){
	
	}
	
	VarDeclNode(ASTNode declName, ASTNode exprValue){
	
		this.nodeType = "VarDeclNode";
		if (declName != null){
			varName = declName;
			varName.parent = this;
		} else{
			System.out.println("Error varName == null in VarDeclNode");
		}
		
		
		if (exprValue != null){
			initialization = exprValue;
			initialization.parent = this;
		}
		
	}
	
	public VarDeclNode assignAttributes(Token modifier, TypeDescriptor inputType){
		String constPara = "const";
		boolean constantVariable = false;
		if((modifier != null) && (modifier.getText().equals(constPara))){
			constantVariable = true;
		}
		this.nodeAttributes.isConstant = constantVariable;
		VarDeclNode tempNode;
		tempNode = (VarDeclNode)this.left_most_child;
		while(tempNode != null){
			tempNode.varName.nodeAttributes.isConstant = constantVariable;
			tempNode.varType = inputType;
			tempNode = (VarDeclNode)tempNode.right_sibling;
		}
		
		return this;
	}
	
	public void displayNode(){
		if((varName != null)&&(varType != null)){
			System.out.println(this.nodeType + "-->" + varName.nameASTNode + ":" + varType.typeName + ":address:" + Integer.toString(varName.address.offset));
		} else{
			System.out.println(this.nodeType +  "  " + this.nameASTNode);
		}
	}
	
	public void Semantics(SymbolTableSet tableSet){

		if ((tableSet.isDeclaredLocal(varName.nameASTNode)) != null){
			System.out.println("Duplicate variable " + varName.nameASTNode + " declaration.<VarDeclNode.Semantics>");
			return;
		}
		
		if(this.initialization != null){
			this.initialization.Semantics(tableSet);
		} 

		//normal variable declaration
		if(this.varName.nodeType.equals("declaratorNode")){
			//array variable
			if (((declaratorNode)varName).isArrayVariable){
				((ArrayTypeDescriptor)varName.nodeAttributes.variableType).elementType = varType;
				ASTNode tempNode = ((declaratorNode)this.varName).arrayExpr;
				
				if(tempNode != null){
					tempNode.Semantics(tableSet);	
				}

				if((tempNode == null) || (tempNode.nodeType.equals("IntLiteralNode")) == false){
					new GenerateError("Illegal array variable declaration. Array index must be a valid integer number.<VarDeclNode.Semantics>");
				}
				
				((ArrayTypeDescriptor)varName.nodeAttributes.variableType).typeSize = (((IntLiteralNode)tempNode).value) * (varType.typeSize);
			} else {
				//normal variable
				varName.nodeAttributes.variableType = varType;
				
				//Variables without initializer are automatically initialized to 0
				if(this.initialization == null){
					if(varType.typeName.equals("int")){
						this.initialization = new IntLiteralNode(0);
					} else if(varType.typeName.equals("float")){
						this.initialization = new FloatLiteralNode(0);
					} else if(varType.typeName.equals("char")){
						this.initialization = new CharLiteralNode("0");
					}
				}
			}
			tableSet.EnterSymbol(varName);
			
		} else{
			//if it is function declaration
			if(this.varName.nodeType.equals("funcDefNode")){
				//Enter function name into table symbol
				((funcDefNode)varName).setReturnType(varType);
				tableSet.EnterSymbol(varName);
			}
		}
	}
	
	public void CodeGen(FileWriter fileWriter, SymbolTableSet tableSet){
		String generatedCode;
		
		//declaratorNode
		if(this.varName.nodeType.equals("declaratorNode")){
			if(this.initialization != null){
				//load the init value into the top of the stack
				this.initialization.CodeGen(fileWriter, tableSet);
				
				//store the init value in the variable address
				generatedCode = "sro " + this.varType.abbreviateTypeName + " " + ((declaratorNode)varName).address.offset + this.lineCarret;
		    	try{
		    		BufferedWriter buffered = new BufferedWriter(fileWriter);
		    		buffered.write(generatedCode);
		    		buffered.flush();
		    	} catch (IOException e1){
		    		e1.printStackTrace();
		    	}
				
			}
		}
		//funcDefNode
		
		
	}
	
	public int GenLocalDecl(TypeDescriptor inputType){
		if(this.varName.nodeType.equals("declaratorNode")){
			return ((declaratorNode)this.varName).address.offset;
		}
		
		return 0;
	}
}
