package test;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=20;
		boolean flag=true;
		for(int i=2;i<num/2;i++) {
			if(num%i==0)
			{
				 flag=false;
				 break;
			}
		}
		if(flag==true) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}

}
