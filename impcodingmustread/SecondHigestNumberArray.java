package impcodingmustread;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class SecondHigestNumberArray {
	public static void main(String[] args) {
		int[] a= {4,10,-5,-7,7,10,11,22};
		//Write a Java Program to find the second-highest number in an array.
//		Arrays.sort(a);
//		System.out.println(a[a.length-2]);
		
		int highest=0;
		int secondhighest=0;
		for(int num:a) {
			if(num>highest) {
				secondhighest=highest;
				highest=num;
			}
			else if (num>secondhighest && num!=highest) {
				secondhighest=num;
			}
		}
		
		System.out.println(secondhighest);
		
		
	}

}
