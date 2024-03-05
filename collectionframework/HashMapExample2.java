package collectionframework;
import java.util.HashMap;
import java.util.Scanner;
public class HashMapExample2 {
	public static void main(String[] args) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Few Numbers (End -1)");
		while(true) {
			int num = input.nextInt();
			if(num == -1) {
				break;
			}else {
				if(hm.containsKey(num)) {
					int value = hm.get(num);
					hm.put(num, value + 1);
				}else {
					hm.put(num,1);
				}
			}
		}
		System.out.println(hm);

	}

}
