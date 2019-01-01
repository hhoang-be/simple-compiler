package c2pproject.antlr;
import java.util.Stack;

public class SymbolTableSet {
	static Stack scope_tables = new Stack();
	int nestLevel = 0;
	int funcLevel = 0;
	
	int address = 5;
	
	labelListNode labelList = null;
	
	SymbolTableSet(){
	}
	
	public void IncrNestLevel(){
		
		nestLevel++;
		
		
		//creat a new node being head of the new table and push it to stack
		ASTNode tableHead = new ASTNode();
		tableHead.right_sibling = null;
		tableHead.nameASTNode = Integer.toString(nestLevel);
		scope_tables.push(tableHead);
	}
	
	public ASTNode DecrNestLevel(){
		nestLevel--;
		ASTNode removedTable = (ASTNode)scope_tables.pop();
		return removedTable;
	}
	
	
	public void IncrFuncLevel(){
		funcLevel++;
	}
	
	public void DecrFuncLevel(){
		funcLevel--;
	}
	
	public ASTNode isDeclaredGlobal(String variableName){
		ASTNode nextNode;
		for(int i=scope_tables.size() - 1; i>=0; i--){
			nextNode = (ASTNode)scope_tables.get(i);
			nextNode = nextNode.right_sibling;
			while(nextNode != null){
				if(nextNode.nameASTNode.equals(variableName)){
					return nextNode;
				}
				
				nextNode = nextNode.right_sibling;
			}
		}

		return null;
	}
	
	public ASTNode isDeclaredLocal(String variableName){
		ASTNode nextNode = (ASTNode)scope_tables.peek();

		nextNode = nextNode.right_sibling;
		while(nextNode != null){

			if(nextNode.nameASTNode.equals(variableName)){
				//System.out.println("Error. Duplicate variable " + nextNode.nameASTNode + " declaration.<SymbolTableSet.isDeclaredLocal>");
				return nextNode;
			}
			nextNode = nextNode.right_sibling;
		}
		
		return null;
		
	}
	
	
	//Enter new symbol into current table
	public boolean EnterSymbol(ASTNode inputNode){

		if((isDeclaredLocal(inputNode.nameASTNode)) != null){
			System.out.println("Duplicate variable " + inputNode.nameASTNode + " declaration.<SymbolTableSet.EnterSymbol>");
			return false;
		}
		ASTNode tableHead = (ASTNode)scope_tables.peek(); //point to head of table

		//Add new symbol to the beginning of the table
		tableHead = (ASTNode)scope_tables.peek();
		ASTNode temp = new ASTNode();
		temp.nestLevel = this.nestLevel;
		temp.funcLevel = this.funcLevel;
		
		temp.nameASTNode = inputNode.nameASTNode;
		temp.nodeType = inputNode.nodeType;
		temp.nodeAttributes = inputNode.nodeAttributes;

		//add relative address to this variable
		if(temp.nodeType.equals("declaratorNode")){
			temp.isArrayVariable = inputNode.isArrayVariable;
			inputNode.address.offset = this.address;
			temp.address.offset = this.address;
			this.address = this.address + temp.nodeAttributes.variableType.typeSize;
		}
		
		temp.right_sibling = tableHead.right_sibling;
		tableHead.right_sibling = temp;
		
		//System.out.println("Scope level: " + Integer.toString(nestLevel) + "   Variable name: " + inputNode.nameASTNode);
		return true;
		
	}
	
	
	public boolean EnterSymbol(typeItem inputNode){

		ASTNode tableHead = (ASTNode)scope_tables.peek(); //point to head of table

		//Add new symbol to the beginning of the table
		tableHead = (ASTNode)scope_tables.peek();

		ASTNode temp;
		while(inputNode != null){
			if((isDeclaredLocal(inputNode.inputVarName)) != null){
				System.out.println("Duplicate variable " + inputNode.inputVarName + " declaration.<SymbolTableSet.EnterSymbol>");
				return false;
			}
			
			temp = new ASTNode();
			temp.nameASTNode = inputNode.inputVarName;
			temp.nodeAttributes = new NodeAttributes();
			temp.nodeAttributes.variableType = inputNode.type;
			temp.funcLevel = this.funcLevel;
			
			temp.nodeType = "declaratorNode";
			temp.address.offset = this.address;
			this.address = this.address + temp.nodeAttributes.variableType.typeSize;
			
			temp.right_sibling = tableHead.right_sibling;
			tableHead.right_sibling = temp;
			//System.out.println("Scope level: " + Integer.toString(nestLevel) + "   Variable name: " + inputNode.inputVarName);
			inputNode = inputNode.next;
		}
		
		return true;
	}
	
	public void EnterLabel(ASTNode inputNode){
		labelListNode tempNode = new labelListNode(inputNode.nameASTNode);
		if(this.labelList == null){
			this.labelList = tempNode; 
			
		} else{
			tempNode.next = this.labelList.next;
			this.labelList = tempNode;
		}
	}
	
	public labelListNode isLabelValid(String inputLabel){
		labelListNode tempNode = this.labelList;
		
		while(tempNode != null){
			if(tempNode.label.equals(inputLabel)){
				return tempNode;
			}
			
			tempNode = tempNode.next;
		}
		
		return null;
	}
	
	//retrieve symbol named inputName from current table
	//Chua xu li truong hop trung ten o cac outer scope ma khai bao lai la typedef.
	
	public ASTNode RetrieveSymbol(String inputName){
		ASTNode nextNode = (ASTNode)scope_tables.peek();
		
		while(nextNode != null){
			if(nextNode.nameASTNode.equals(inputName)){
				return nextNode;
			}
			
			nextNode = nextNode.right_sibling;
		}
		return null;
	}

}
