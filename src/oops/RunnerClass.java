package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Employee emp1=new Employee("Sachin",23456,1000);
		 /*emp1.Name="Sachin";
		 emp1.EmpID=23456;
		 emp1.Salary=1000;*/
		 
		// Employee emp2=new Employee("Mahesh",88456,1200);
		 /*emp2.Name="Mahesh";
		 emp2.EmpID=88456;
		 emp2.Salary=1200;*/
		 
		 //emp1.PrintName();
		 //emp2.PrintName();
		 
		//Employee emp1 = new Employee("Sachin",242423,1000);
			//Employee emp2 = new Employee("Mahesh",543456,1200);
			
			//emp1.PrintName();
			//emp2.PrintName();

			Employee emp3 = new Employee("Rahul",456785);
			emp3.PrintSalary();
			emp3.PrintName();
			Employee.ChangeCompanyName();
			
			Person per1=new Person("Simran",25);
			ChildClass ch1=new ChildClass("Rahul",25,"Actor");
			ch1.display();
			ch1.print();
			
			MethodOverloading ob= new MethodOverloading();
			ob.Sum(5, 6);
			ob.Sum(5, 6, 7);
			
			EncapsulationExample encap= new EncapsulationExample();
			encap.setName("Simran");
			System.out.println(encap.getName());
	}

}
