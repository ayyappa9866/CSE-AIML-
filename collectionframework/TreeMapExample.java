package collectionframework;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer,String> hm = new TreeMap<>();
		hm.put(1100, "ABCD");
		hm.put(101, "PQRS");
		hm.put(10, "WXYZ");
		System.out.println(hm);
		for(Map.Entry<Integer, String> m:hm.entrySet()) {
			System.out.println(m.getKey()+" ---> "+m.getValue());
		}
	}
}
