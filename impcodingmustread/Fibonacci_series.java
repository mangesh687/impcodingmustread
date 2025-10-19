package impcodingmustread;

import java.util.Scanner;

public class Fibonacci_series {
	public static void main(String[] args) {
		System.out.println("eneter the number of upto term");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int first=0;
		int second=1;
		System.out.println(first+"  "+second);
		int third=0;
		
		for(int i=3;i<=n;i++) {
			third=first+second;
			first=second;
			second=third;
			System.out.println(third);
		}
		
		
	}

}
