package impcodingmustread;

import java.util.HashMap;
import java.util.Map;

public class CountWord {
	public static void main(String[] args) {
		
		// Write a Java Program to count the number of words in a string using HashMap.

		String str="hello java is my name java";
		String[] words=str.split("\\s+");
		Map<String, Integer> sc=new HashMap<>();
		for(String w:words) {
			sc.put(w, sc.getOrDefault(w,0)+1);
		}
		System.out.println(sc);
		//{java=2, name=1, is=1, hello=1, my=1}
	}

}
