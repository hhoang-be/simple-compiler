package c2pproject.antlr;

import java.io.FileWriter;
import java.io.IOException;

public class returnNode extends ASTNode {
	ASTNode returnVal;
	
	returnNode(ASTNode inputExpr){
		this.nodeType = "returnNode";
		returnVal = inputExpr;
		
		if(returnVal != null){
			returnVal.parent = this;
		}
	}
	
	protected funcDefNode getCurrentFunction(){
		
		ASTNode tempNode = this.parent;
		
		while(tempNode != null){
			if(tempNode.nodeType.equals("funcDefNode")){
				return ((funcDefNode)tempNode);
			}
			
			tempNode = tempNode.parent;
		}
		
		return null;
		
	}
	
	public void Semantics(SymbolTableSet tableSet){
		TypeDescriptor tempType = null;
		if(this.returnVal != null){
			this.returnVal.Semantics(tableSet);
			tempType = this.returnVal.ExprSemantics(tableSet);
		}
		
		funcDefNode tempNode = this.getCurrentFunction();
		
		if(tempNode == null){
			new GenerateError("Error. Illegal return statement.<returnNode.Semantics>");
		} else{
			TypeDescriptor returnType = ((methodDefItem)tempNode.nodeAttributes.variableType).returnType;
			if(returnType.typeName.equals("void") == true){
				if(tempType != null){
					new GenerateError("Error. Illegal return statement - This function does not return a value.<returnNode.Semantics>");
				}
			} else{
				if((tempType != null) && (tempType.typeName.equals(returnType.typeName))){
					return;
				}
				
				new GenerateError("Error. Illegal return statement - return type is not compatible.<returnNode.Semantics>");
			}
		}
	}
	
	public void CodeGen(FileWriter fileWriter, SymbolTableSet tableSet){
		String generatedCode;
		if (returnVal != null){
			this.returnVal.CodeGen(fileWriter, tableSet);
			generatedCode = "retf" + this.lineCarret;
			/*if(this.returnVal.isArrayVariable){
				generatedCode = "ret" + ((ArrayTypeDescriptor)this.returnVal.nodeAttributes.variableType).elementType.abbreviateTypeName + this.lineCarret;
			} else{
				generatedCode = "ret" + this.returnVal.nodeAttributes.variableType.abbreviateTypeName + this.lineCarret;
			}*/
		} else {
			generatedCode = "retp" + this.lineCarret;
		}
		
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
	}
}
