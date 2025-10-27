package impcodingmustread;

public class RemoveSpace {
	public static void main(String[] args) {
		//Write a Java Program to remove all white spaces from a string
		// without using replace().
		
		String str="hello java code name";
		StringBuilder sc=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				sc.append(str.charAt(i));
			}
		}
		System.out.println(sc);
		
	}

}
