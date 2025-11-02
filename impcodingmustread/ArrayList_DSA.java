package impcodingmustread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.stream.Stream;

public class ArrayList_DSA {
	public static void main(String[] args) {
		//create an ArrayList 
		ArrayList<Integer> list =new ArrayList<>();
		//create ArrayList with initial capacity 
		ArrayList<String> list1=new ArrayList<>(10);
//When an ArrayList reaches full capacity, it increases its internal size by 50%.
//So, if the old capacity was 10, the new capacity becomes:10+5=15	full than 15+15/2=22 after that 33 size
		//Can you increase it manually?	
//Yes — you can use ensureCapacity(int minCapacity) to make sure the list can hold at least a certain number of elements without resizing later.	
		list.ensureCapacity(100);// increases internal capacity to hold at least 100 elements
		//create ArrayList from other collection
		List<Integer> sc=Arrays.asList(1,2,10,20);
		ArrayList<Integer> list2=new ArrayList<>(sc);
		//add element
		list2.add(22);
		//add element at index
		list2.add(0, 5);
		System.out.println(list2);//[5, 1, 2, 10, 20, 22]
List<Integer> sc1=Arrays.asList(55,33);
//Add all elements from another collection:
list2.addAll(sc1);
System.out.println(list2);//[5, 1, 2, 10, 20, 22, 55, 33]
//get element at index
Integer element=list2.get(0);
System.out.println(element);//5
//set elemnet at index
list2.set(0, 100);
System.out.println(list2);//[100, 1, 2, 10, 20, 22, 55, 33]
//remove element
list2.remove(Integer.valueOf(22));
System.out.println(list2);//[100, 1, 2, 10, 20, 55, 33]
//remove element at index
list2.remove(2);
System.out.println(list2);//[100, 1, 10, 20, 55, 33]
//remove all elemnts from another collcetion 
list2.removeAll(sc1);
System.out.println(list2);//[100, 1, 10, 20]
//Retain all elements from another collection:
ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
ArrayList<Integer> sc3   = new ArrayList<>(Arrays.asList(20, 40, 50));

list3.retainAll(sc3);
System.out.println(list3);//[20, 40]
//clear all elements
sc3.clear();
System.out.println(sc3);//[]
//check if list conatin element
boolean contains=list2.contains(22);
System.out.println(contains);//false
boolean contains1=list2.contains(20);
System.out.println(contains1);//true
//get index of element
int index3=list2.indexOf(20);
System.out.println(index3);//3
//get last index of element
//list.lastIndexOf(Object o) returns the index of the last occurrence of the specified element.
//If the element is not found, it returns -1.
int lastIndex=list2.lastIndexOf(20);
System.out.println(lastIndex);//3
//check if list is empty 
boolean isEmpty=list1.isEmpty();
System.out.println(isEmpty);//true
//get size of list 
int size=list2.size();
System.out.println(size);//4
//convert list to array
Object[] arrayss=list2.toArray();
System.out.println(Arrays.toString(arrayss));//[100, 1, 10, 20]
System.out.println(list2);//[100, 1, 10, 20]
//get sublist
List<Integer> sublist=list2.subList(1, 4);
System.out.println(sublist);//[1, 10, 20]
//sort list
Collections.sort(list2);
System.out.println(list2);//[1, 10, 20, 100]
//Reverse List 
List<Integer> list4=Arrays.asList(100,10,20,1);
Collections.reverse(list4);
System.out.println(list4);//[1, 20, 10, 100]
//decending order using comparator 
Collections.sort(list4,Collections.reverseOrder());
System.out.println(list4);//[100, 20, 10, 1]
//Shuffle List  It randomly rearranges the elements in the list.
Collections.shuffle(list4);
System.out.println(list4);
//find min element
Integer min=Collections.min(list4);
System.out.println(min);//1
//find max element
Integer max=Collections.max(list4);
System.out.println(max);//100
//fill list with elements
System.out.println(sc);//[1, 2, 10, 20]
Collections.fill(sc, 1);
System.out.println(sc);//[1, 1, 1, 1]
//copy list 
ArrayList<Integer> copy=new ArrayList<>(sc);
System.out.println(copy);//[1, 1, 1, 1]
//convert to synchronized list
List<Integer> synclist=Collections.synchronizedList(copy);
System.out.println(synclist);//[1, 1, 1, 1]
//create unmodifiable view of list 
List<Integer> UNMODIFIABLElIST=Collections.unmodifiableList(list4);
System.out.println(UNMODIFIABLElIST);//[10, 1, 20, 100]
//Iterate over list 
for(Integer eleements:list4) {
	System.out.println(eleements);
}
//100
//10
//20
//1
//Iterate with index
for(int i=0;i<list4.size();i++) {
	System.out.println(list4.get(i));
}
//100
//10
//20
//1
//iterate using iterator 
System.out.println("===========");
Iterator<Integer> itr=list4.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
//10
//20
//1
//100
//Iterate using listIterator
ListIterator<Integer> listIter=list4.listIterator();
//remove if condition is met
List<String> list5 = new ArrayList<>(Arrays.asList("apple", "", "banana", "", "cherry"));
list5.removeIf(x -> x.isEmpty());
System.out.println(list5);//[apple, banana, cherry]
//replace all elements 
list5.replaceAll(String::toUpperCase);
System.out.println(list5);//[APPLE, BANANA, CHERRY]
//for each operation 
list5.forEach(System.out::println);
//APPLE
//BANANA
//CHERRY
//Convert to Stream
Stream<String> stream=list5.stream();
//join elements to String 
String joined=String.join("@", list5);
System.out.println(joined);//APPLE@BANANA@CHERRY
//check if any elements satisfiedd condition 
boolean any=list5.stream().anyMatch(String::isEmpty);
System.out.println(any);//false
//check if all elements satisfy condition 
boolean all=list5.stream().allMatch(x->x.length()>3);
System.out.println(all);//true
//find first elemts satisfing condition 
Optional<String> first=list5.stream().filter(x->x.startsWith("A")).findFirst();
System.out.println(first);



		
	}

}
