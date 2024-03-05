package collectionframework;
import java.util.TreeSet;
public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Long> lhs1 = new TreeSet<>();
		lhs1.add(10L);
		lhs1.add(20L);
		lhs1.add(30L);
		lhs1.add(5L);
		System.out.println(lhs1);
		if(lhs1.contains(40L)) {
			System.out.println("Found");
		}	
	}
}
