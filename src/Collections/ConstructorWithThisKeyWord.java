package Collections;

public class ConstructorWithThisKeyWord {

	//class var
	String name;
	int age;
	
	public ConstructorWithThisKeyWord(String name, int age) {
		
		this.name = name;
		//this.global var = local var
			
		this.age = age;
		System.out.println(name);
		System.out.println(age);
		
	}
	
	
	public static void main(String[] args) {
		
		ConstructorWithThisKeyWord obj =new ConstructorWithThisKeyWord("tom", 32);
		
		
	}

}
