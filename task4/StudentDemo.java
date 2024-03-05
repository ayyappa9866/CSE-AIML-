package task4;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Student> a1 = new ArrayList<>();
		for(int i = 1;i <= 3;i++) {
			System.out.println("Enter Student "+i+" Data");
			int r = input.nextInt();
			String name = input.next();
			String dept = input.next();
			double cgpa = input.nextDouble();
			Student s1 = new Student(r,name,dept,cgpa);
			a1.add(s1);// student object will be added inside the arraylist
		}
		System.out.println("******** Student data ********");
		for(Student s:a1) {
			System.out.println(s.toString());
		}
		input.close();
	}
}
