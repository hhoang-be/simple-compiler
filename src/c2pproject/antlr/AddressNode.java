package c2pproject.antlr;

public class AddressNode {
	public String accessMethod;
	public String label;
	public int offset;
	public int nestLevel;
	
	AddressNode(){
		accessMethod = "JumpIfFalse";
		label = "SampleLabel";
		offset = 0;
	}

}
