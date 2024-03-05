package collectionframework;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetExample1 {
	public static void main(String[] args) {
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("ABC");
		hs1.add("CDE");
		hs1.add("ABC");
		hs1.add("PQR");
		for(String s1:hs1) {
			System.out.println(s1);
		}
		Iterator<String> it1 = hs1.iterator();
		while(it1.hasNext()) {
			System.out.print(it1.next()+" ");
		}
	}
}
