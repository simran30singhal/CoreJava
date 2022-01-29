package test;

public class LoopsExample {

	public static void main(String[] args) {
		// While loop
		int n1=1;
		
		while(n1<=10) {
			
			System.out.println(n1);
			
			n1+=1;
		}

		// For Loop to type 1 to 10
		
		for(int count=1;count<=10;count++) {
			
			if(count==5) {
				continue;
			}
			
			System.out.println("inside for loop " + count);
		}
		// Arrays with loop
		int[] arr1={20,30,40,50,60};
		for(int i=0;i<arr1.length;i++) {
			System.out.println("Value inside loop "+ arr1[i]);
		}
		
		for(int var:arr1) {
			System.out.println(var);
		}
	}

}
