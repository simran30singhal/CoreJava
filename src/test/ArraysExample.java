package test;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {20,30,40,50,60};
		
		System.out.println("Total num of values are " + num1.length);
		System.out.println("Value at 3rd positon is " + num1[2]);
		System.out.println("Value at last positon is " + num1[num1.length -1]);
		
		String[] name1 = {"abc" , "xyz" , "pqr"};
		
		System.out.println("Value at 3rd positon is " + name1[2]);
		
		String name = "Clean India Green India";
		
		String[] arrWords = name.split(" ");
		System.out.println("Value at 3rd positon is " + arrWords[2]);
		System.out.println("Total num of words are " + arrWords.length);


	}

}
