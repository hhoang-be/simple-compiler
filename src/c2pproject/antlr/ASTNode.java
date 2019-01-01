package c2pproject.antlr;
import java.io.*;


public class ASTNode {
	String lineCarret = "\n";
	AddressNode address = new AddressNode();
	
	boolean isArrayVariable;
	int nestLevel = 0;
	int funcLevel = 0;
	
	
	public ASTNode parent, right_sibling, left_most_sibling, left_most_child;
	public String nameASTNode;
	public String nodeType;
	
	public AddressNode Result = null;
	
	public NodeAttributes nodeAttributes;
	//Use this variable to treparse tree later on
	public boolean isVisisted = false;
	
	ASTNode(){
		nodeAttributes = new NodeAttributes();
		parent = null;
		right_sibling = null;
		left_most_sibling = null;
		left_most_child = null;
	}
	
	
	
	public ASTNode getParent(){
		return parent;
	}
	
	public void setParent(ASTNode inputParent){
		this.parent = inputParent;
	}
	
	public ASTNode getRightSibling(){
		return right_sibling;
	}
	
	public void setRightSibling(ASTNode inputRSibling){
		this.right_sibling = inputRSibling;
	}
	
	public ASTNode getLeftMostSibling(){
		return left_most_sibling;
	}
	
	public void setLeftMostSibling(ASTNode inputLMSibling){
		this.left_most_sibling = inputLMSibling;
	}
	
	public ASTNode getLeftMostChild(){
		return this.left_most_child;
	}
	
	public void setLeftMostChild(ASTNode inputLMChild){
		this.left_most_child = inputLMChild;
	}
	
	public NodeAttributes getAttributes(){
		return nodeAttributes;
	}
	
	public void setAttributes(NodeAttributes inputAttributes){
		nodeAttributes = inputAttributes;
	}
	
	public boolean isLeaf(){
		if (this.left_most_child == null) 
			return true;
		else
			return false;	
	}
	
	public boolean isRoot(){
		if (this.parent == null)
			return true;
		else
			return false;
	}
	
	public TypeDescriptor LvalueSemantics(SymbolTableSet tableSet){
		return new ErrorType();
	}
	
	public void Semantics(SymbolTableSet tableSet){
	}
	
	public void TypeSemantics(SymbolTableSet tableSet){
	}
	
	public TypeDescriptor ExprSemantics(SymbolTableSet tableSet){
		return new ErrorType();
	}
	
	public void displayNode(){
		String outputMess = "<";
		if(this.nodeType != null){
			outputMess = outputMess + this.nodeType + ":";
		}
		
		if(this.nameASTNode != null){
			outputMess = outputMess + this.nameASTNode + ":";
			
			if(this.nameASTNode.equals("VarDeclNode")){
				outputMess = outputMess + Integer.toString(((VarDeclNode)this).varName.address.offset) + ">";
			}
		}
		

		
		System.out.println(outputMess + ">");
	}
	
	public void CodeGen(FileWriter fileWriter, SymbolTableSet tableSet){
		
	}
	
	public AddressNode GetTemp(TypeDescriptor typeInput){
		return null;
	}
	
	public void FreeTemp(AddressNode inputAddress){
		
	}
	
	public void setArrayVariable(boolean inputValue){
		
	}
	
	public boolean getArrayVariable(){
		return true;
	}
}
