package test;

public class ReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse string
		//reverse array
		//reverse a number
		
		String s1="Clean India Green India";
		String rev="";
		for (int i=s1.length()-1;i>=0;i--)
		{
			 rev= rev +s1.charAt(i);
		}
		System.out.println("Reversed string is- "+ rev);
	
	int[] arr = {10,20,30,40,50,60};
	
	System.out.println("Reversed array is- ");
	for(int i=arr.length-1;i>=0;i--) {
		System.out.println(arr[i]);
	}
	
	int num=123456,rev1=0,rem=0;
	while(num>0) {
		
		rem=num%10;
		rev1=rev1*10+rem;
		
		num=num/10;
		
	}
	
	System.out.println(rev1);

}
}
