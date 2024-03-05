package collectionframework;
import java.util.HashMap;
import java.util.Map;
public class HashMapExample1 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1100, "ABCD");
		hm.put(101, "PQRS");
		hm.put(10, "WXYZ");
		System.out.println(hm);
		for(Map.Entry<Integer, String> m:hm.entrySet()) {
			System.out.println(m.getKey()+" ---> "+m.getValue());
		}
	}
}
