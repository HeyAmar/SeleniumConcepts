package Collections;

public class ConstructorConcept {
	
	//constructor name same as class name
	//it will not return any value
	//no void no static
	// we can overload a constuctor
	
	
	public ConstructorConcept() {
		System.out.println("This is Default Constructor");
		
	}
	
	public ConstructorConcept(int i) {
		System.out.println("Single paramater constructor");
		System.out.println("Value of i"			+i);
	}
	public ConstructorConcept(int i, int j) {
		System.out.println("multiple paramater constructor");
		System.out.println("Value of i" 		 +i);
		System.out.println("Value of j"			+j);
	}
	
	

	public static void main(String[] args) {
		ConstructorConcept c = new ConstructorConcept();
		ConstructorConcept c1 = new ConstructorConcept(10);
		ConstructorConcept c2 = new ConstructorConcept(10,20 );
		
		

	}

}
