package collections1;

import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map1= new HashMap<Integer,String>();
		
		map1.put(1, "Simran");
		map1.put(2, "John");
		map1.put(4, "Nik");
		map1.put(10, "Carrie");
		
		map1.put(2, "Suraj");
		
		System.out.println(map1);
		
		map1.remove(10);
		System.out.println(map1);
		
		for(Map.Entry<Integer,String> entry1: map1.entrySet()) {
			
			System.out.println(entry1.getKey()+" "+ entry1.getValue());
		}
		
		// to print only keys
		
		for(Integer val: map1.keySet()) {
			
			System.out.println("Key is: "+val);
			System.out.println("Value is: "+ map1.get(val));
		}
		
		for(String val: map1.values()) {
			
			System.out.println("Value is: "+val);
		}
		
		/*LinkedHashMap<Integer,String> map2= new LinkedHashMap<Integer,String>();
		
		map2.put(1, "Simran");
		map2.put(2, "John");
		map2.put(4, "Nik");
		map2.put(10, "Carrie");
		
		System.out.println(map2);*/
		
		/*TreeMap<Integer,String> map3= new TreeMap<Integer,String>();
		
		map3.put(10, "Carrie");
		map3.put(1, "Simran");
		map3.put(2, "John");
		map3.put(4, "Nik");
		
		
		System.out.println(map3);*/
	}

}
