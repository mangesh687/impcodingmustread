package impcodingmustread;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Arrays_DSA {
	public static void main(String[] args) {
		//Declare an array:
		int[] myArray ;
		//Initialize an array:
        int[] myArray1= {10,30,2,4,5,6};
        //Create an array with size:
       int[] myArray2=new int[5];
       //set elements
       myArray2[0]=10;
       //get Array length
       int length=myArray2.length;
       System.out.println(length);  
       //copy array
       int[] newArray=Arrays.copyOf(myArray1, myArray1.length);
       System.out.println(Arrays.toString(newArray));
     //Compare arrays:
       boolean isequal=Arrays.equals(myArray1, newArray);
       System.out.println(isequal);
       //copy range
       //Arrays length start from 0 , and find the range than end is value is remove 
       int[] partialArray=Arrays.copyOfRange(myArray1, 1,3);
       System.out.println(Arrays.toString(partialArray));
       //Fill 	Array
       Arrays.fill(myArray2, 0);
       System.out.println(Arrays.toString(myArray2));
       //[0, 0, 0, 0, 0]
       //Sort Arrays accending order 
       Arrays.sort(myArray1);
       System.out.println(Arrays.toString(myArray1));
      // Sorting an array of wrapper types (like Integer[])
       Integer[] myArray3= {10,30,2,4,5,6};
       Arrays.sort(myArray3,Comparator.reverseOrder());
       System.out.println(Arrays.toString(myArray3));
       //Binary Search Arrays.binarySearch() assumes the array is sorted in ascending order by default.
       int index=Arrays.binarySearch(myArray1, 10);
       System.out.println(index);
       int index1 = Arrays.binarySearch(myArray3, 4, Comparator.reverseOrder());
       System.out.println(index1);
       //Convert to List:
       List<Integer> list=Arrays.asList(myArray3);
       System.out.println(list);
       //print Array
       System.out.println(Arrays.toString(myArray3));
      //multi-dimensinal array
       int[][] matrix=new int[3][3];
	}

}
