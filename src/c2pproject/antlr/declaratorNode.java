package c2pproject.antlr;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.*;

public class declaratorNode extends ASTNode{
	//Dang dat address chung de thu nghiem gen code;

	ASTNode arrayExpr;
	
	
	declaratorNode(Token inputToken){
		this.address = new AddressNode();
		this.isArrayVariable = false;
		this.nodeType = "declaratorNode";
		if(inputToken != null){
			this.nodeAttributes = new NodeAttributes();
			this.nameASTNode = inputToken.getText();
		} else{
			new GenerateError("Error in declaratorNode. InputToken == null");
		}
	}
	
	declaratorNode(ASTNode inputExpr){
		this.isArrayVariable = true;
		this.nodeType = "declaratorNode";
		address = new AddressNode();
		
		if(inputExpr != null){
			this.arrayExpr = inputExpr;
			this.arrayExpr.parent = this;
			this.nodeAttributes.variableType = new ArrayTypeDescriptor();
		}
	}
	
	
	public TypeDescriptor ExprSemantics(SymbolTableSet tableSet){
		ASTNode tempNode = tableSet.isDeclaredGlobal(this.nameASTNode);
		if(tempNode == null){
			System.out.println("Warning. Variable " + this.nameASTNode + " has not been declared yet.<declaratorNode.ExprSemantics>");
			return new ErrorType();
		} else {
			return tempNode.nodeAttributes.variableType;
		}
	}
	
	public TypeDescriptor LvalueSemantics(SymbolTableSet tableSet){
		
		ASTNode tempNode = tableSet.isDeclaredGlobal(this.nameASTNode);
		if(tempNode == null){
			System.out.println("Warning. Variable " + this.nameASTNode + " has not been declared yet.<declaratorNode.LvalueSemantics>");
			return new ErrorType();
		} else {
			if(tempNode.nodeAttributes.isConstant == true){
				return new ErrorType();
			} else{
				return tempNode.nodeAttributes.variableType;
			}
		}		
	}
	
	public void Semantics(SymbolTableSet tableSet){
		ASTNode tempNode = tableSet.isDeclaredGlobal(this.nameASTNode);
		if(tempNode == null){
			String errMess = "Variable " + this.nameASTNode + " has not been declared yet.<declaratorNode.Semantics>";
			new GenerateError(errMess);
		} else{
			
			if(tempNode.isArrayVariable){
				if(this.arrayExpr != null){
					this.arrayExpr.Semantics(tableSet);
					TypeDescriptor tempType = this.arrayExpr.ExprSemantics(tableSet);
					if((tempType.typeName.equals("int")) == false){
						new GenerateError("Error. Array index must be an valid integer number.<declaratorNode.Semantics>");
					}
				} else {
					new GenerateError("Error. Array index must be a valid integer number.Semantics>");
				}
			}
			
			this.nodeAttributes = tempNode.nodeAttributes;
			this.nestLevel = tempNode.nestLevel;
			this.funcLevel = tempNode.funcLevel;
			this.address = tempNode.address;
		}
	}
	
	//load the variable at inputOffSet to the top of the stack
	public void GenLoadLocal(TypeDescriptor inputType, int inputOffSet, FileWriter fileWriter, SymbolTableSet tableSet){
		String generatedCode = "";
		if(this.isArrayVariable){
			if(this.arrayExpr != null){
				//load the index of the array
				this.arrayExpr.CodeGen(fileWriter, tableSet);
				//compute the distance from this element to the first element = index * size of array element
				generatedCode = generatedCode + "ldc i " + ((ArrayTypeDescriptor)this.nodeAttributes.variableType).elementType.typeSize + this.lineCarret;
				
				generatedCode = generatedCode + "mul i" + this.lineCarret;

				//load the address of array variable
				generatedCode = generatedCode + "ldc i " + this.address.offset + this.lineCarret;
									
				//==> the offset of array element;
				generatedCode = generatedCode + "add i" + this.lineCarret;
				
				//convert to address type
				
				generatedCode = generatedCode + "conv i a" + this.lineCarret;
				
				//load the value of array element
				generatedCode = generatedCode + "ind " + ((ArrayTypeDescriptor)this.nodeAttributes.variableType).elementType.abbreviateTypeName + this.lineCarret;
			
			}
		} else{
			generatedCode = "ldo " + inputType.abbreviateTypeName + " " + Integer.toString(inputOffSet) + this.lineCarret;
		}
		
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
		
	}
	
	public void GenLoadGlobal(TypeDescriptor inputType, int inputOffSet, FileWriter fileWriter, SymbolTableSet tableSet){
		
		String generatedCode = "";
		if(this.isArrayVariable){
			if(this.arrayExpr != null){
				this.arrayExpr.CodeGen(fileWriter, tableSet);
				//the array index is put on top of the stack. This is the relative offset compared to address of the first index of array
				//load the address of array variable
				generatedCode = "lda 0 " + this.address.offset + this.lineCarret;
								
				//add the array index and the address of array variable ==> the offset of array element;
				generatedCode = generatedCode + "add i" + this.lineCarret;

				//load the value of array element
				generatedCode = generatedCode + "lod 0 " + ((ArrayTypeDescriptor)this.nodeAttributes.variableType).elementType.abbreviateTypeName + " " + this.address.offset + this.lineCarret;
				
			}
		} else{
			generatedCode = "lod " + inputType.abbreviateTypeName + " 0 " + Integer.toString(inputOffSet) + this.lineCarret;
		}
		
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
	}
	
	public void CodeGen(FileWriter fileWriter, SymbolTableSet tableSet){
		//load the variable at inputOffSet to the top of the stack
		if(this.funcLevel < tableSet.funcLevel){
			this.GenLoadGlobal(this.nodeAttributes.variableType, this.address.offset, fileWriter, tableSet);
		} else{
			this.GenLoadLocal(this.nodeAttributes.variableType, this.address.offset, fileWriter, tableSet);
		}
	}
	

	public int LvalueAddress(){
		return this.address.offset;
	}
	
	
	public void setArrayVariable(boolean inputValue){
		this.isArrayVariable = inputValue;
	}
	
	
	public boolean getArrayVariable(){
		return this.isArrayVariable;
	}

}
