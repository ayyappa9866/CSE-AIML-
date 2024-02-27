package exceptionhandling;

public class Example2 {

	public static void main(String[] args) {
		String s1 = null;
		try {
			System.out.println(s1.length());
			System.out.println("I am inside the Try Block");
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Rest Of the code");
	}
}
