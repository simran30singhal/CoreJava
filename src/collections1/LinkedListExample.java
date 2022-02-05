package collections1;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list1=new LinkedList<String>();
		
		list1.add("Simran");
		list1.add("Jack");
		list1.add("Jill");
		list1.add("John");
		list1.addFirst("David");
		
		System.out.println(list1);
		
		System.out.println("From For Loop");
		for(int i=0;i<list1.size();i++) {
			
			System.out.println(list1.get(i));
		}
		
		
	}

}
