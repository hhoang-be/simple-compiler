package c2pproject.antlr;

public class GenerateError {
	String errMessage;
	static int lineNumber;
	
	
	GenerateError(String inputMessage){
		this.errMessage = inputMessage;
		System.out.println(errMessage);
		System.exit(0);
		
	}
	
	GenerateError(String inputMessage, int lineNumber){
		this.errMessage = inputMessage;
		System.out.println("Line " + Integer.toString(lineNumber) + ":" + errMessage);
		System.exit(0);
		
	}
	
	GenerateError(){
		this.errMessage = "Unidentified error.";
		System.out.println("Line " + Integer.toString(lineNumber) + ":" + errMessage);
		System.exit(0);
	}

}
