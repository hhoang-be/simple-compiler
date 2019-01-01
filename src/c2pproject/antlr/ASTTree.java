package c2pproject.antlr;

//import org.antlr.runtime.*;

public class ASTTree {
	private ASTNode root = new ASTNode();
	private int visitOrder = 1;
		
	ASTTree(){
		root = null;
	}
	
	ASTTree(ASTNode inputRoot){
		root = inputRoot;		
	}
	
	public ASTNode getRoot(){
		return root;
	}
	
	public void setRoot(ASTNode inputRoot){
		this.root = inputRoot;
	}
	
	//Adopt child and all its children under the parent node
	public void adoptChild(ASTNode parent, ASTNode child){
		if (child !=null) {
			child.setParent(parent);
			child.setRightSibling(null);
			
			//In case parent has no child, child.leftmostchild will refer to itself otherwise it refers to parent left most child
			if (parent.getLeftMostChild() == null){
				child.setLeftMostSibling(child);
				parent.setLeftMostChild(child);
			} else {
				child.setLeftMostSibling(parent.getLeftMostChild());
				ASTNode nextChild = new ASTNode();
				
				nextChild = parent.getLeftMostChild();
				while(nextChild.getRightSibling()!=null){
					nextChild = nextChild.getRightSibling();
				}
				nextChild.setRightSibling(child);
				
			}
		}
	}
	
	//adopt child as the left most child of the parent
	
	public void adoptChildLeftMost(ASTNode parent, ASTNode child){
		
		child.parent = parent;
		child.right_sibling = parent.left_most_child;
		ASTNode nextNode;
		nextNode = parent.left_most_child;
		while (nextNode != null){
			nextNode.left_most_sibling = child;
			nextNode = nextNode.right_sibling;
		}
		child.left_most_sibling = child;
		parent.left_most_child = child;
		
	}
	
	//adopt child and all its siblings under parent node
	public void adoptChildandSibling(ASTNode parent, ASTNode child){
		ASTNode nextNode = new ASTNode();
		
		if (child == null) return;
		
		//in case parent does not have any child yet
		if(parent.getLeftMostChild() == null){
			//its left most child will be child's left most sibling
			parent.setLeftMostChild(child.getLeftMostSibling());
		} else {
			nextNode = parent.getLeftMostChild();
			while (nextNode.getRightSibling()!=null){
				nextNode = nextNode.getRightSibling();
			}
			nextNode.setRightSibling(child.getLeftMostSibling());		
		}
		
		nextNode = child;
		while(nextNode.getRightSibling()!=null){
			nextNode.setParent(parent);
			nextNode.setLeftMostSibling(parent.getLeftMostChild());
			nextNode = nextNode.getRightSibling();
		}
	}
	
	
	//remove a node from tree root
	public ASTNode removeNode(ASTNode removedNode){
		ASTNode nextNode;
		if (removedNode.getParent() == null) {
			System.out.println("Can not remove root node!");
			return null;
		}
		
		//removedNode is the left most child of its parent
		if (removedNode.getLeftMostSibling() == removedNode){
			ASTNode parent = removedNode.getParent();
			parent.setLeftMostChild(removedNode.getRightSibling());
			
			//Change left_most_sibling of all removedNode's siblings to new node 
			ASTNode new_left_most_sibling = removedNode.getRightSibling();
			nextNode = removedNode;
			while(nextNode.getRightSibling()!=null){
				nextNode.setLeftMostSibling(new_left_most_sibling);
				nextNode = nextNode.getRightSibling();
			}
		} else {
			nextNode = removedNode.getLeftMostSibling();
			//find the node before removedNode
			while (nextNode.getRightSibling() != removedNode){
				nextNode = nextNode.getRightSibling();
			}
			
			//change it right sibling to the right sibling of removed node
			nextNode.setRightSibling(removedNode.getRightSibling());
			
		}
		
		return removedNode;
	}
	
	//merge 02 tree root and removedRoot into one tree with new root is root
	//return new root
	public void mergeSibling(ASTNode root, ASTNode removedRoot){
		//refer all parent fields of removedRoot to root
		ASTNode nextNode;
		
		if(root == null) {
			root = removedRoot;
			return;
		}
		
		if(root.left_most_child == null){
			root.left_most_child = removedRoot.left_most_child;
			nextNode = removedRoot.left_most_child;
			if (nextNode == null) return;
			
			while(nextNode != null){
				//refer to new parent
				nextNode.parent = root;
				nextNode = nextNode.right_sibling;
			}
			
		} else{
			nextNode = root.left_most_child;
			
			while(nextNode.right_sibling != null){
				nextNode = nextNode.right_sibling;
			}
			
			nextNode.right_sibling = removedRoot.left_most_child;
			nextNode = removedRoot.left_most_child;

			
			while(nextNode != null){
				nextNode.parent = root;
				nextNode.left_most_sibling = root.left_most_child;
				nextNode = nextNode.right_sibling;
			}

		}

	}
	
	
	public void makeFamily(ASTNode sub_root, ASTNode child1, ASTNode child2, ASTNode child3, ASTNode child4){
		if (child1 != null)adoptChild(sub_root, child1);
		if (child2 !=null )adoptChild(sub_root, child2);
		if (child3 !=null) adoptChild(sub_root, child3);
		if (child4 !=null) adoptChild(sub_root, child4);
	}
	
	public void ListTree(ASTNode sub_root){
		sub_root.displayNode();
		VisitTree(sub_root);
	}
	
	public void VisitTree(ASTNode sub_root){

		if (sub_root == null){
			System.out.println("Error in ASTTree class. Tree root is null.");
			//return;
		}
		
		ASTNode nextRoot;
		sub_root.isVisisted = true;
		nextRoot = sub_root.getLeftMostChild();
		while (nextRoot != null){
			if (nextRoot.isVisisted == false) {
				System.out.print(Integer.toString(visitOrder) + "-");
				visitOrder++;
				nextRoot.displayNode();
				VisitTree(nextRoot);
			}
			
			nextRoot = nextRoot.getRightSibling();
		}
	}
}

