package collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arraylist1= new ArrayList<String>();
		
		arraylist1.add("Simran");
		arraylist1.add("Priya");
		arraylist1.add("Reena");
		arraylist1.add("Rohan");
		
		System.out.println("The size of array list is: " +arraylist1.size());
		
		System.out.println(arraylist1);
		
		arraylist1.remove(0);
		
		System.out.println("The size of array list is: " +arraylist1.size());
		System.out.println(arraylist1);
		
		System.out.println("The element at 2nd position is: "+arraylist1.get(2));
		
		System.out.println("From FOR Loop: ");
		
		for(int i=0;i<arraylist1.size();i++) {
			
			System.out.println(arraylist1.get(i));
		}
		
		System.out.println("From FOR EACH Loop: ");
		
		for(String name: arraylist1) {
			
			System.out.println(name);
		}
		
		System.out.println("From Iterator: ");
		Iterator<String> itr=arraylist1.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		//replacing the value
		arraylist1.set(1, "Supriya");
		
		//Sorting the arraylist1 in ascending order
		Collections.sort(arraylist1);
		System.out.println(arraylist1);
		
		//Sorting the arraylist1 in descending order
		Collections.sort(arraylist1,Collections.reverseOrder());
		System.out.println(arraylist1);
	}

}
