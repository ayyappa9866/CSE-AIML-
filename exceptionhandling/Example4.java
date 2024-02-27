package exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Example4 {
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
		int a = 0;
		try{
			a = input.nextInt();
		}catch(InputMismatchException e) {
			System.out.println(e);
		}
		System.out.println(a);
		System.out.println("Rest Of the code");
		input.close();
	}
}
