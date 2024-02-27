package exceptionhandling;

public class ExceptionPropagationExample1 {
	public void A() {
		B();
		System.out.println("A");
	}
	public void B() {
		C();
		System.out.println("B");
	}
	public void C() {
		D();
		System.out.println("C");
	}
	public void D() {
		int data = 50 / 0;
	}
	public static void main(String[] args) {
		ExceptionPropagationExample1 epe1= new ExceptionPropagationExample1();
		try{
			epe1.A();		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
