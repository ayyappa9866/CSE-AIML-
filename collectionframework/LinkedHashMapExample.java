package collectionframework;
import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapExample {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm = new LinkedHashMap<>();
		hm.put(1100, "ABCD");
		hm.put(101, "PQRS");
		hm.put(10, "WXYZ");
		System.out.println(hm);
		for(Map.Entry<Integer, String> m:hm.entrySet()) {
			System.out.println(m.getKey()+" ---> "+m.getValue());
		}
	}
}
