package c2pproject.antlr;

public class ArrayTypeDescriptor extends TypeDescriptor {
	TypeDescriptor elementType;
	int startIndex;
	int endIndex;

	ArrayTypeDescriptor(){
		typeSize = 0;
		this.typeName = "array";
	}
	
}
