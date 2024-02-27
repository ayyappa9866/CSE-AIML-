package exceptionhandling;
import java.io.IOException;
public class ExceptionPropagationExample2 {

	public void A() throws IOException {
		B();
		System.out.println("A");
	}
	public void B() throws IOException {
		C();
		System.out.println("B");
	}
	public void C() throws IOException {
		D();
		System.out.println("C");
	}
	public void D() throws IOException {
		throw new IOException("Device Error");
	}
	public static void main(String[] args) {
		ExceptionPropagationExample1 epe1= new ExceptionPropagationExample1();
		try{
			epe1.A();		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Rest Of the Code");
	}
}
