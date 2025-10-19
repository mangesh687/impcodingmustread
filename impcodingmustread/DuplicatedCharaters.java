package impcodingmustread;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicatedCharaters {
	public static void main(String[] args) {
		//Write a Java Program to find the duplicate characters in a string.
		
		String str="javacomeabcj";
	Map<Character, Integer> sc=new HashMap<>();
	for(char ch:str.toCharArray()) {
		sc.put(ch, sc.getOrDefault(ch,0)+1);
	}
	
	for(Map.Entry<Character, Integer> sc1:sc.entrySet()) {
		if(sc1.getValue()>1) {
			System.out.println(sc1.getKey()+" "+sc1.getValue());
		}
	}
		
	}

}
