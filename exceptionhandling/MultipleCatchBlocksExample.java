package exceptionhandling;
public class MultipleCatchBlocksExample {
	public static void main(String[] args) {
		int data = 0;
		int []arr = new int[] {1,2,3,4,5};
		String s1 = null;
		try{
			data = 50 / 0;
			System.out.println(arr[5]);
			System.out.println(s1.length());
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("I am in Finally Block");
		}
		System.out.println("Rest of the code");
	}
}
