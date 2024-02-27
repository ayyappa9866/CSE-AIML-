package exceptionhandling;
public class Example3 {
	public static void main(String[] args) {
		String s1 = "abc";
		try {
			int a = Integer.parseInt(s1);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}		
		System.out.println("rest of the code");
	}
}
