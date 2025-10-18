package impcodingmustread;

public class NumberPrimeOrNot {
	public static void main(String[] args) {
		int a = 5;
		if (a <= 1) {
			System.out.println("given number is not prime number " + a);
		} else if (a <= 3) {
			System.out.println("givent number is prime number " + a);
		} else if (a % 2 == 0 || a % 3 == 0) {
			System.out.println("given number is not prime number " + a);
		}
		boolean f = true;
		for (int i = 5; i <= a/2; i++) {
			if (a % i == 0) {
				System.out.println("given number is not prime " + a);
				f = false;
			}

		}
		if(f) {
			System.out.println("given number is prime number "+a);
		}
	}

}
