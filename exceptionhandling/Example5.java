package exceptionhandling;

public class Example5 {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		try {
			arr[5] = 6;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println(arr[0]);
	}
}
