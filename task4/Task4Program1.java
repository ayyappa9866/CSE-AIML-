package task4;
import java.util.ArrayList;
public class Task4Program1 {
	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<>();
		alist.add(10);
		alist.add(20);
		alist.add(5);
		alist.add(0, 2);
		System.out.println(alist);
		alist.remove(1);
		System.out.println(alist);
	}
}
