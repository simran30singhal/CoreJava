package collections1;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack1=new Stack<Integer>();
		
		stack1.push(5);
		stack1.push(8);
		stack1.push(12);
		stack1.pop();
		stack1.push(14);
		
		System.out.println(stack1);
		
	}

}
