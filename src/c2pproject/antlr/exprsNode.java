package c2pproject.antlr;
import java.io.FileWriter;

import org.antlr.runtime.*;

public class exprsNode extends ASTNode {
	ASTNode expr;
	exprsNode more;
	
	exprsNode(Token inputToken){
		this.nodeType = "exprsNode";
		expr = new declaratorNode(inputToken);
		more = null;
		
	}
	
	exprsNode(ASTNode inputNode){
		this.nodeType = "exprsNode";
		this.expr = inputNode;
		more = null;
	}
	
	
	public void Semantics(SymbolTableSet tableSet){
		if(expr != null){
			this.expr.Semantics(tableSet);
		}
	}
	
	public void CodeGen(FileWriter fileWriter, SymbolTableSet tableSet){
		if(expr != null){
			this.expr.CodeGen(fileWriter, tableSet);
		}
	}

}
