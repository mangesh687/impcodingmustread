package impcodingmustread;

public class AmstrongNumber {
	public static void main(String[] args) {
		// Write a Java Program to check Armstrong number
		int num=153;
		int original=num;
		int sum=0;
		while(num>0) {
			int d=num%10;
			sum=sum+d*d*d;
			num=num/10;
		}
		if(original==sum) {
			System.out.println("given number is amstrong number : "+original);
		}else {
			System.out.println("given number is not amstrong number : "+original);
		}
	}

}
