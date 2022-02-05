package collections1;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> pq=new PriorityQueue<String>();
		
		pq.add("Nik");
		pq.add("Mathew");
		pq.add("Lisa");
		
		System.out.println(pq);
		
		System.out.println("First Element: "+pq.peek());
		
		System.out.println("Element removed is: "+pq.poll());
		
		System.out.println(pq);
		
		
		
		ArrayDeque<String> dq1=new ArrayDeque<String>();
		
		dq1.add("Nik");
		dq1.add("Mathew");
		dq1.add("Lisa");
		
		
		System.out.println(dq1);
		
		System.out.println(dq1.peek());
		System.out.println(dq1.peekFirst());
		System.out.println(dq1.peekLast());
		
		//System.out.println(dq1.poll());
		//System.out.println(dq1);
		
		//System.out.println(dq1.pollFirst());
		 // System.out.println(dq1);
		  
		System.out.println(dq1.pollLast());
		System.out.println(dq1);
	}

}
