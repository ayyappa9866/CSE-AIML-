package inputfromconsole;
import java.util.Scanner;
public class ScannerExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter RollNo : ");
		int rollNo = input.nextInt();
		input.nextLine(); // Till new Line Character it will Read
		System.out.println("Enter Name Of The Student :");
		String name = input.nextLine();
		System.out.println("Enter Gender : ");
		char gender = input.next().charAt(0);
		System.out.println("Enter Dept : ");
		String dept = input.next();
		System.out.println("Enter CGPA Of a Student :");
		double cgpa = input.nextDouble();
		System.out.println("*************Student Data**************");
		System.out.println("Rollno : "+rollNo);
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Department : "+dept);
		System.out.println("CGPA : "+cgpa);		
		input.close();
	}
}
