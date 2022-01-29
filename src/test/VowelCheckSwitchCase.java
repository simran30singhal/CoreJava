package test;

public class VowelCheckSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Clean World Green World";
		int v=0;
		for(int i=0;i<s1.length();i++) {
		char ch=s1.charAt(i);
		switch(ch) {
		case 'a':
			
		case 'e':
			
		case 'i':
			
		case 'o':
			
		case 'u':
			
		case 'A':
			
		case 'E':
			
		case 'I':
			
		case 'O':
			
		case 'U':
			v++;
			break;
		default:
			System.out.println("No vowels present in the string");
			
		
			
			
		}
	}
		System.out.println("Number of vowels:"+v);

}
}
