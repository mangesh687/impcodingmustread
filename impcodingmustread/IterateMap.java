package impcodingmustread;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IterateMap {
	public static void main(String[] args) {
		// Write a Java Program to iterate HashMap using While and advance for loop

		Map<String, String> data = new HashMap<>();
		data.put("A", "Apple");
		data.put("B", "Ball");
		data.put("C", "Cat");
		data.put("D", "Dog");
		data.put("E", "Elephant");
		for (Map.Entry<String, String> sc : data.entrySet()) {
			System.out.println(sc.getKey() + " : " + sc.getValue());
		}

	}

}
