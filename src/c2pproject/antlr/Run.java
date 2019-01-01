package c2pproject.antlr;
import org.antlr.runtime.*;

import java.util.Scanner;
import java.io.*;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			    CharStream input = null;
			    File sink;

	        	input = new ANTLRFileStream(args[0]);
	        	sink = new File(args[1]); 

	        	// BUILD AST
		        
		        C2PParserLexer lex = new C2PParserLexer(input);
		        CommonTokenStream tokens = new CommonTokenStream(lex);
	        
		        C2PParserParser g = new C2PParserParser(tokens);
		        compoundStatementNode treeRoot = (compoundStatementNode)(g.programFile());

		    	//sink = new File("/home/hieuht/Downloads/Pmachine/output.p");

		    	FileWriter writer = new FileWriter(sink);
		        SymbolTableSet tableSet = new SymbolTableSet();
		        treeRoot.Semantics(tableSet);
		    	treeRoot.CodeGen(writer, tableSet);
		 	}

		    catch(Exception e) {
		    		  System.out.println("Error. C file or P-code file names are not identified. ");	
				      System.err.println("exception: "+e);
				      e.printStackTrace(System.err);   
		   }
	}
}
	


