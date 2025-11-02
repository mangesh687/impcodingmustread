package impcodingmustread;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class HashMap_DSA {
	public static void main(String[] args) {
		//create a HashMap
		HashMap<String,Integer> map=new HashMap<>();
		//create HashMap with initial capacity 
		HashMap<String, Integer> map1=new HashMap<>(16);
		//create hashmap from another mao
		HashMap<String, Integer> AnotherMap=new HashMap<>();
		AnotherMap.put("one", 5);
		HashMap<String, Integer> map2=new HashMap<>(AnotherMap);
		//put key-value pair
		map2.put("two", 10);
		map2.put("three", 15);
		System.out.println(map2);//{two=10, three=15, one=5}
		//put if absent
		map2.putIfAbsent("four", 5);
		System.out.println(map2);
		map2.putIfAbsent("two", 22);
		System.out.println(map2);//{two=10, three=15, four=5, one=5}
		//get value by key
		Integer value=map2.get("four");
		System.out.println(value);//5
		//get value by key with default
		// Get value for key "one" — if not found, return default value 0
		Integer value1=map2.getOrDefault("one", 0);
		System.out.println(value1);//5
		//remove key-value pair
		map2.remove("one");
		System.out.println(map2);//{two=10, three=15, four=5}
		//remove key-value pair if value matchs
		map2.put("ten", 10);
		map2.remove("ten", 1);   // value doesn’t match → won’t remove
		System.out.println(map2);  // {ten=10, two=10, three=15, four=5}
		map2.remove("ten", 10);  // key and value both match → removes entry
		System.out.println(map2);  // {two=10, three=15, four=5}
        //clear all entries 
		System.out.println(AnotherMap);//{one=5}
		AnotherMap.clear();
		System.out.println(AnotherMap);//{}
        //check if key exist or not 
		boolean conatinkey=map2.containsKey("two");
		System.out.println(conatinkey);//true
		//check if value exist 
		boolean conatinValue=map2.containsValue(12);
		System.out.println(conatinkey);//true
		//get set of keys keySet() returns a Set view of all the keys in the map.
		Set<String> keys=map2.keySet();
		System.out.println(keys);//[two, three, four]
		//get Collection of values 
		Collection<Integer> values=map2.values();
		System.out.println(values);//[10, 15, 5]
		//get set of entries
		Set<Map.Entry<String, Integer>> entriess=map2.entrySet();
		System.out.println(entriess);//[two=10, three=15, four=5]
        //check if map is empty 
		boolean isempty=map.isEmpty();
		System.out.println(isempty);//true
		boolean isempty1=map2.isEmpty();
		System.out.println(isempty1);//false
		//get size of map 
		int size=map2.size();
		System.out.println(size);//3
		//replace value for key 
		map2.replace("two", 22);
		System.out.println(map2);//{two=22, three=15, four=5}
        // what happen key is alreday present then 
		map2.put("two", 100);
		System.out.println(map2);//{two=100, three=15, four=5}
		Map<String, Integer> map3 = new HashMap<>();
		map3.put("key", 1);
		map3.put("num", 10);
		// Try to replace value for key "key"
		map3.replace("key", 1, 2);   // Old value = 1, so replaced
		System.out.println(map3);    // {key=2, num=10}
		// Try to replace with wrong old value
		map.replace("key", 1, 5);   // Won’t change anything (old value isn’t 1)
		System.out.println(map3);    // {key=2, num=10}
		//marge values
		map2.merge("two", 2,Integer::sum);
		System.out.println(map2);//{two=102, three=15, four=5}
		map2.merge("ten", 2,Integer::sum);
		System.out.println(map2);//{ten=2, two=102, three=15, four=5}
        // compute value if absent 
		map2.computeIfAbsent("one", x->x.length());
		System.out.println(map2);//{ten=2, two=102, three=15, four=5, one=3}
		// "key" already exists, function won't run
		map2.computeIfAbsent("one", x->x.length()*2);
		System.out.println(map2);//{ten=2, two=102, three=15, four=5, one=3}
		//compute value if present 
		map2.computeIfPresent("one", (k,v)->v+1);
		System.out.println(map2);//{ten=2, two=102, three=15, four=5, one=4}
        map2.computeIfPresent("six", (k,v)->v+5);
        System.out.println(map2);//{ten=2, two=102, three=15, four=5, one=4}
        //compute value 
        map2.compute("one", (k,v)->(v==null)?1:v+2);
        System.out.println(map2);//{ten=2, two=102, three=15, four=5, one=6}
        map2.compute("eight", (k,v)->(v==null)?1:v+2);
        System.out.println(map2);//{ten=2, two=102, three=15, four=5, eight=1, one=6}
        //convert to synchronized map
        Map<String, Integer> syncMap=Collections.synchronizedMap(map2);
        //create unmodifiable view of map
        Map<String, Integer> unmodifiableMap=Collections.unmodifiableMap(map2);
        System.out.println(unmodifiableMap);//{ten=2, two=102, three=15, four=5, eight=1, one=6}
         //Iterate over entries
        System.out.println("====");
        for(Map.Entry<String, Integer> entry:map2.entrySet()) {
        	System.out.println(entry);
        }
//        ten=2
//        		two=102
//        		three=15
//        		four=5
//        		eight=1
//        		one=6
        //iterate over keys
        System.out.println("=======");
        for(String key:map2.keySet()) {
        	System.out.println(key);
        }
//        ten
//        two
//        three
//        four
//        eight
//        one
        //Iterate over values
        System.out.println("==========");
        for(Integer val:map2.values()) {
        	System.out.println(val);
        }
//        2
//        102
//        15
//        5
//        1
//        6
        //convert to stream
        Stream<Map.Entry<String, Integer>> stream=map2.entrySet().stream();
        System.out.println(stream);


		

	}

}
