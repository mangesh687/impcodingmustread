package impcodingmustread;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class SecondHigestNumberArray {
	public static void main(String[] args) {
		int[] a= {4,10,-5,-7,10,11,22};
		
		Arrays.sort(a);
		System.out.println(a[a.length-2]);
	}

}
