package impcodingmustread;

import java.util.Arrays;
import java.util.List;

public class ArrayListItrate {
	public static void main(String[] args) {
		//) Write a Java Program to iterate ArrayList using for-loop, while-loop,and advance for-loop.
		
		List<String> sc=Arrays.asList("java","com","don","life","cognizant");
		for(String sc1:sc) {
			System.out.println(sc1);
		}
	}

}
