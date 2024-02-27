package exceptionhandling;
public class NestedTryBlocksExample {
	public static void main(String[] args) {
		int data = 0;
		int []arr = new int[] {1,2,3,4,5};
		String s1 = null;
		try{
			
			try {
				data = 50 / 0;
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			try {
				arr[5] = 12;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			try {
				System.out.println(s1.length());
			}catch(NullPointerException e) {
				System.out.println(e.getMessage());
			}
			int a = 0;
			a = Integer.parseInt("abc");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("I am in Finally Block");
		}
		System.out.println("Rest of the code");

	}

}
