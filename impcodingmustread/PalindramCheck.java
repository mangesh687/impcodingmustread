package impcodingmustread;

public class PalindramCheck {
	public static void main(String[] args) {
		
		int a=121;
		String str=String.valueOf(a);
		int left=0;
		int right=str.length()-1;
		boolean b=true;
		while(left<right) {
			if(str.charAt(left)!= str.charAt(right)) {
				b=false;
				System.out.println("this string is not palindarm");
				
			}
			left++;
			right--;
			
		}if(b) {
			System.out.println("this string is palindarm");
		}
			
	}

}
