package Collections;

public class SuperB extends SuperA{
	public SuperB() {
		super(32);
		System.out.println("i m in Class B");
	}

	public static void main(String[] args) {
		SuperB b = new SuperB();
	}
}
