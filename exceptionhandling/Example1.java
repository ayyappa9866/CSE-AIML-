package exceptionhandling;
public class Example1 {
	public static void main(String[] args) {
		try {
			int data = 50 / 0;
			System.out.println("I am inside the try block");
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}
}
