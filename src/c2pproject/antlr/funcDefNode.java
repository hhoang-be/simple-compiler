package c2pproject.antlr;

import java.io.FileWriter;
import java.io.IOException;

public class funcDefNode extends ASTNode {
	
	public boolean isFuncDefinition;
	boolean hasReturnStmt = false;

	funcDefNode(){
		this.nodeType = "funcDefNode";
		isFuncDefinition = false;
		this.nodeAttributes = new NodeAttributes();
		this.nodeAttributes.variableType = new methodDefItem();
	}
	
	funcDefNode(typeItem inputArgs){
		this.nodeType = "funcDefNode";
		isFuncDefinition = false;
		this.nodeAttributes = new NodeAttributes();
		if(inputArgs != null){
			this.nodeAttributes.variableType = new methodDefItem(inputArgs);
		} else {
			this.nodeAttributes.variableType = new methodDefItem();
		}
		
	}
	
	public void setReturnType(TypeDescriptor inputType){
		if(inputType != null){
			((methodDefItem)this.nodeAttributes.variableType).returnType = inputType;
		} else{
			System.out.println("Error in funcDefNode. inputType = null.<funcDefNode.setReturnType>");
		}
	}
	
	public void EnterParementer2SymbolTable(SymbolTableSet tableSet){
		methodDefItem tempDef = (methodDefItem)this.nodeAttributes.variableType;
		typeItem tempTypeItem = tempDef.argTypes;
		tableSet.EnterSymbol(tempTypeItem);
	}
	
	public boolean isInputParameterCompatible(typeItem funcDecl, typeItem funcDef){
		if((funcDecl == null) && (funcDef == null)){
			return true;
		}
		typeItem nextFuncDecl, nextFuncDef;
		nextFuncDecl = funcDecl;
		nextFuncDef = funcDef;
		
		while(nextFuncDecl != null){
			if(nextFuncDef == null){
				return false;
			}
			
			if (!(nextFuncDecl.type.typeName.equals(nextFuncDef.type.typeName))){
				return false;
			}
			nextFuncDecl = nextFuncDecl.next;
			nextFuncDef = nextFuncDef.next;
		}
		
		if(nextFuncDef != null){
			return false;
		} else {
			return true;
		}
	}
	
	public void Semantics(SymbolTableSet tableSet){
		
		//function definition
		if(this.isFuncDefinition == true){
			//dont increase function level with main function
			if(this.nameASTNode.equals("main") == false){
				tableSet.IncrFuncLevel();

				ResetAddressForNewCall(tableSet);
			}
			
			//reset the list of valid labels in function.
			tableSet.labelList = null;
			
			ASTNode tempNode = tableSet.isDeclaredGlobal(this.nameASTNode);
			
			//call compoundStatementSemantics
			if (this.left_most_child != null){
				(this.left_most_child).parent = this;
				this.left_most_child.Semantics(tableSet);
			}
			
			if(tempNode == null){
				String messErr = "Function " + this.nameASTNode + " has not been declared yet.<funcDefNode.Semantics>";
				new GenerateError(messErr);
			} else{

				//check the input parameter compatibility between definition and declaration
				typeItem functionDecl = ((methodDefItem)tempNode.nodeAttributes.variableType).argTypes;
				typeItem functionDef = ((methodDefItem)this.nodeAttributes.variableType).argTypes;
				if(!this.isInputParameterCompatible(functionDecl, functionDef)){
					String errMess = "The definition of function " + this.nameASTNode + " and its declaration are not compatible.";
					new GenerateError(errMess);
				}
				
				TypeDescriptor typeFuncDecl = ((methodDefItem)tempNode.nodeAttributes.variableType).returnType;
				TypeDescriptor typeFuncDef = ((methodDefItem)this.nodeAttributes.variableType).returnType;

				// check the compatibility of return type
				if(typeFuncDecl.typeName.equals(typeFuncDef.typeName) == false){
					String errMess = "The return type of function " + this.nameASTNode + " and its declaration are not compatible.";
					new GenerateError(errMess);
				}
				
				this.findReturnStatement(this);
				if(this.hasReturnStmt){
					if(typeFuncDef.typeName.equals("void")){
						System.out.println("Warning. Void function " + this.nameASTNode + " has return statement.<funcDefNode.Semantics>");
					}
				} else{
					if(typeFuncDef.typeName.equals("void") == false){
						System.out.println("Warning. Function " + this.nameASTNode + " does not have return statement.<funcDefNode.Semantics>");
					}
				}
			}
			


			
			//Dont decrease function level with main function
			if(this.nameASTNode.equals("main") == false){
				tableSet.DecrFuncLevel();
			}
		}
	}
	
	public TypeDescriptor LvalueSemantics(SymbolTableSet tableSet){
		Semantics(tableSet);
		return new ErrorType();
	}
	
	public TypeDescriptor ExprSemantics(SymbolTableSet tableSet){
		Semantics(tableSet);
		return ((methodDefItem)this.nodeAttributes.variableType).returnType;
	}
	
	
	public void CodeGen(FileWriter fileWriter, SymbolTableSet tableSet){
		String generatedCode = "";
		String funcLabel = "$func_" + this.nameASTNode;
		int i = 5, j =1000; //http://en.wikipedia.org/wiki/P-code_machine
		
		if(this.isFuncDefinition == true){
			generatedCode = funcLabel + ":" + this.lineCarret;
			
			if(this.nameASTNode.equals("main") == false){
				tableSet.IncrFuncLevel();
			} else {
			
						
				//set SP to MP + i;
				generatedCode = generatedCode + "ent 1 " + Integer.toString(i) + this.lineCarret;
			
				//Set EP to SP + j;
				generatedCode = generatedCode + "ent 2 " + Integer.toString(j) + this.lineCarret;
			}
			
			try{
				fileWriter.write(generatedCode);
				fileWriter.flush();
			} catch(IOException e1){
				e1.printStackTrace();
			}
			
			
			if(this.left_most_child != null){
				this.left_most_child.CodeGen(fileWriter, tableSet);
			}
			
			if(this.nameASTNode.equals("main") == false){
				//generatedCode = "ret" + ((methodDefItem)this.nodeAttributes.variableType).returnType.abbreviateTypeName + this.lineCarret;
				tableSet.DecrFuncLevel();
			} else { // if this function is main function then halt
				generatedCode = "hlt" + this.lineCarret;

			}
			
			try{
				fileWriter.write(generatedCode);
				fileWriter.flush();
			} catch(IOException e1){
				e1.printStackTrace();
			}
		}
		
	}
	
	
	//prepares stack allocation before calling other function in new stack frame
	public void ResetAddressForNewCall(SymbolTableSet tableSet){

		int tempAddress = 0;
		//stack allocation for return value
		tempAddress = tempAddress + ((methodDefItem)this.nodeAttributes.variableType).returnType.typeSize;
		typeItem tempInputParaType = ((methodDefItem)this.nodeAttributes.variableType).argTypes;
		
		//stack allocation for other fields of mark stack
		tempAddress = tempAddress + 4;

		//stack allocation for input parameters (if present)
		while(tempInputParaType != null){
			tempAddress = tempAddress + tempInputParaType.type.typeSize;
			tempInputParaType = tempInputParaType.next;
		}
		tableSet.address = tableSet.address + tempAddress;

	}
	
	protected void findReturnStatement(ASTNode sub_root){
		sub_root.isVisisted = true;
		ASTNode tempNode = sub_root.left_most_child;
		
		while(tempNode != null){
			if(tempNode.isVisisted == false){
				if(tempNode.nodeType.equals("returnNode")){
					this.hasReturnStmt = true;
					return;
				}
				
				findReturnStatement(tempNode);
			}
			tempNode = tempNode.right_sibling;
		}
	}
}
