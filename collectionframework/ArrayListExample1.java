package collectionframework;
import java.util.ArrayList;
public class ArrayListExample1 {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(10);
		arrList.add(20);
		arrList.add(30);
		arrList.add(40);
		arrList.add(50);
		arrList.add(60);
		arrList.add(70);
		arrList.add(0, 123);
		System.out.println(arrList);
		System.out.println(arrList.size());
		System.out.println(arrList.get(5));
	}
	/*
	byte ---> Byte
	short ----> Short
	int ---> Integer
	long ---> Long
	float ---> Float
	double ---> Double
	boolean ---> Boolean
	char ----> Character */
	
}
