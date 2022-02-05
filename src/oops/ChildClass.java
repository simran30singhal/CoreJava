package oops;

public class ChildClass extends Person{
	
	public String Profession;
	

	public ChildClass(String Name, int Age, String Profession) {
		
		super(Name,Age);
		this.Profession=Profession;
		
	}
	public void print() {
		
		System.out.println("Inside Child");
	}

}
