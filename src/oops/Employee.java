package oops;

public class Employee {
	public String Name;
	public int EmpID;
	public static int Salary=1000;
	public static String CompanyName = "Infosys";
	
	public Employee(String Name,int EmpID, int Salary) {
		
		this.Name=Name;
		this.EmpID=EmpID;
		this.Salary=Salary;
	}
public Employee(String Name,int EmpID) {
		
		this.Name = Name;
		this.EmpID = EmpID;
		
	}
	
	public void PrintName() {
		
		System.out.println("Name of employee is " + this.Name);
	}
	
	public void PrintSalary() {
		
		System.out.println("Salary of employee is " + Employee.Salary);
	}
	
	public static void ChangeCompanyName() {
		
		Employee.CompanyName = "Infosys Technology";
	}

	
}
