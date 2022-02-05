package collections1;

import java.util.HashMap;
import java.util.TreeMap;

public class OccurenceOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str = "Clean India Green India Love India";
        
        TreeMap<String, Integer> Map = new TreeMap<>();
 
        
        String[] words = str.split(" ");
 
        for (String word : words) {
 
            
            Integer integer = Map.get(word);
 
            if (integer == null)
                // Storing the word as key and its
                // occurrence as value in the HashMap.
            	Map.put(word, 1);
 
            else {
                // Incrementing the value if the word
                // is already present in the HashMap.
            	Map.put(word, integer + 1);
            }
        }
        System.out.println(Map);
	}

}
