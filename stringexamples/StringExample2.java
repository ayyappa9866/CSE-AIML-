package stringexamples;

public class StringExample2 {

	public static void main(String[] args) {
		String s1 = "Welcome To Vel Tech";
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5, 12));
		System.out.println(s1.charAt(0));
		
		StringBuffer sb1 = new StringBuffer("Hai Hello");
		StringBuilder sb2 = new StringBuilder("Welcome");

	}

}
