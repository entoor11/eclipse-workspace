package oops;

public class Employee {
	public String Name;
	public int EmpId;
	// private int salary=50000;
	private static int salary = 50000;

	// Default constructor
	public Employee() {
		System.out.println("Inside default cons");
	}

	// Parametarized constructor
	public Employee(String Name, int EmpId) {

		System.out.println("Inside param cons");
		// This here refere to class employee variable name
		// where as right hand side name refer to the parameter which has value rahul
		this.Name = Name;
		this.EmpId = EmpId;
	}

	public void DisplayName() {
		System.out.println("Name of the Employee is " + Name);
	}

	public void DisplayID() {
		System.out.println("ID of the Employee is " + EmpId);
	}

	public static void DisplaySalary() {
		System.out.println("Salary is " + salary);
	}

}
