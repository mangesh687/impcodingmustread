package impcodingmustread;

public class ReverseStringWithoutInbuilt {

	public static void main(String[] args) {
		String str="java";
		String rev="";
for(int i=str.length()-1;i>=0;i--) {
	rev=rev+str.charAt(i);
}
System.out.println(rev);
System.out.println(str);
if(str.equals(rev)) {
	System.out.println("string is palindarm");
}else {
	System.out.println("string not a palindarm");
}
	}

}
