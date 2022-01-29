package oops;

public class MethodOverloading {

	public void Sum(int a, int b) {
		
		int res;
		res=a+b;
		System.out.println("Sum is: "+res);
		
	}
public void Sum(int a, int b, int c) {
		
		int res;
		res=a+b+c;
		System.out.println("Sum is: "+res);
		
	}
}
