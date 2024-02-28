package inputfromconsole;

public class StaticMethodsExample {
	public static int factorial(int num) {
		int fact = 1;
		for(int i = 1;i <= num;i++) {
			fact = fact * i;
		}
		return fact;
	}
	public static void main(String[] args) {
		int res = factorial(5);
		System.out.println(res);
		int ans = factorial(6);
		System.out.println(ans);
	}
}
