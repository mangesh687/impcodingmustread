package impcodingmustread;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {
public static void main(String[] args) {
	// Given an array of integers nums and an integer target, return indices
	//of the two numbers such that they add up to target.
	int target=10;
	int a[]= {1,2,3,5,8,5,5,9};
	Map<Integer, Integer> sc=new HashMap<>();
	for(int i=0;i<a.length;i++) {
		int find=target-a[i];
		if(sc.containsKey(find)) {
			System.out.println(a[i] +" "+find);
		}
		 sc.put(a[i], i);
	}
	System.out.println("final");
//	8 2
//	5 5
//	5 5
//	9 1
//	final
}
}
