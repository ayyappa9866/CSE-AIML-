package collectionframework;
import java.util.LinkedHashSet;
public class LimkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<Long> lhs1 = new LinkedHashSet<>();
		lhs1.add(10L);
		lhs1.add(20L);
		lhs1.add(30L);
		lhs1.add(5L);
		lhs1.addFirst(2L);
		lhs1.addLast(35L);
		System.out.println(lhs1);
		if(lhs1.contains(40L)) {
			System.out.println("Found");
		}		
	}

}
