package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Employee emp1 = new Employee(); emp1.Name = "Sweta"; emp1.EmpId = 1234;
		 * emp1.DisplayName(); emp1.DisplayID();
		 * 
		 * Employee emp2 = new Employee(); emp2.Name = "tiwari"; emp2.EmpId = 5678;
		 * emp2.DisplayName(); emp2.DisplayID();
		 * 
		 * //Paramitarized constructor Employee emp3 = new Employee("Rahul", 1111); //
		 * emp3.salary=10000; if salary is assigned as private then we cant use this //
		 * variable we can use only in employee class emp3.DisplayID();
		 * 
		 * 
		 * //Access using static variable Employee.DisplaySalary();// using static call
		 * class name dot method
		 */
		// inheritence concept
		// Child can access parent
		Parent ct1 = new Parent();
		ct1.age = 50;
		ct1.Name = "Mike";
		ct1.SSN = 1234;
		// If contryname is private then we cant access

		// Protected can be accessed in same class or child class
		ct1.CountryName = "Protected can access";

		Parent ct2 = new Parent("Rahul", "India", 30, 6789);
		ct2.Print();

		// When I create the object for grandchild it will run default constructor of
		// grandparent and parent class
		GrandChild gc = new GrandChild();
		gc.InsuranceId = 3000;
		gc.SSN = 9999;

		// I have print method in both parent and child class it will print child method

		gc.Print();
		gc.Print("Hello Class");

		// You cant create the boject for abstract class
		// BankExample bank = new BankExample() ;

		//Concept of interface
		ICICIBank bank = new ICICIBank();
		bank.Print();

		EncapsulationExample emp = new EncapsulationExample();
		//we are setting salary
		emp.setSalary(5000);
		
		//we are getting salary by this method this way we are protecting the data
		System.out.println("The salary is " + emp.getSalary());
	

	
	}
}
