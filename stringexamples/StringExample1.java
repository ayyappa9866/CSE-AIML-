package stringexamples;

public class StringExample1 {
	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = new String("Welcome");
		if(s1 == s3) {
			System.out.println("Both Referening Same Object");
		}else {
			System.out.println("Not Same");
		}
		System.out.println("Comparing Contents By Using Equals Method");
		if(s1.equals(s3)) {
			System.out.println("Content is Same");
		}else {
			System.out.println("Content is Different");
		}
	}
}
