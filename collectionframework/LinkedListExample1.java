package collectionframework;
import java.util.LinkedList;
public class LinkedListExample1 {
	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<>();
		lList.add("ABCD");
		lList.add("PQRS");
		lList.add("XYZ");
		lList.addFirst("Veltech");
		lList.addLast("Welcome");
		System.out.println(lList);
	}
}
