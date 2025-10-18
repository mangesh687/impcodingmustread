package impcodingmustread;

public class ReverseString2 {
	public static void main(String[] args) {
		String str="java";
		char[] ch=str.toCharArray();
		int left=0, right=str.length()-1;
		while(left<right) {
			char tem=ch[left];// j
			ch[left]=ch[right];//a
			ch[right]=tem; //j
			left++;
			right--;
		}
		System.out.println(ch);
//		Explanation: This solution manually swaps the characters of the string from the start and
//		end, moving towards the center, effectively reversing the string without using any built-in
//		functions.
	}

}
