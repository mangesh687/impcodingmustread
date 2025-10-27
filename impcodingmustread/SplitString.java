package impcodingmustread;

import java.util.Arrays;

public class SplitString {
	public static void main(String[] args) {
		String str="zapbra,apple,man,car,go";
		String[] name=str.split(",");
		Arrays.sort(name);
		System.out.println(String.join(",", name));
		
	}

}
