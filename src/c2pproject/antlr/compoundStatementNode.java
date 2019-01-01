package c2pproject.antlr;

import java.io.FileWriter;

public class compoundStatementNode extends ASTNode {
	
	compoundStatementNode(){
		this.nodeType = "compoundStatement";
	}
	
	public void Semantics(SymbolTableSet tableSet){
		
		//Will not increase the nest level for main function
		ASTNode compoundParent = this.parent;

		if (!((compoundParent.nodeType.equals("funcDefNode")) && (compoundParent.nameASTNode.equals("main")))){
			tableSet.IncrNestLevel();
		}
		
		
		//Enter input parameter to symbol table if function has input parameters
		if((this.parent != null) && (this.parent.nodeType.equals("funcDefNode"))){
			funcDefNode temp = ((funcDefNode)this.parent);
			methodDefItem functionDef = (methodDefItem)(temp.nodeAttributes.variableType);
			if(functionDef.argTypes != null){
				tableSet.EnterSymbol(functionDef.argTypes);
			}
		}
		
		
		ASTNode tempNode = this.left_most_child;
		if(tempNode == null){
			System.out.println("Warning. There is no statement in this compound block. <compoundStatement.Semantics>");
			return;
		} else{
			while (tempNode != null){
				tempNode.Semantics(tableSet);
				tempNode = tempNode.right_sibling;
			}
		}
		

		if (!((compoundParent.nodeType.equals("funcDefNode")) && (compoundParent.nameASTNode.equals("main")))){
			tableSet.DecrNestLevel();
		}
	}
	
	
	public TypeDescriptor ExprSemantics(SymbolTableSet tableSet){
		return new ErrorType();
	}
	
	public TypeDescriptor LvalueSemantics(SymbolTableSet tableSet){
		return new ErrorType();
	}
	
	public void CodeGen(FileWriter fileWriter, SymbolTableSet tableSet){
		ASTNode tempNode = this.left_most_child;
		
		if(tempNode == null){
			System.out.println("Warning. There is no statement in this compound block. <compoundStatement.CodeGen>");
			return;
		} else{
			while (tempNode != null){
				tempNode.CodeGen(fileWriter, tableSet);
				tempNode = tempNode.right_sibling;
			}
		}
	}
	

}
