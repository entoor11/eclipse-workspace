package oops;

public class EncapsulationExample {

	private int Salary;
	private String Company;
	private int EmpId;

	
	//Goto source and select generate geteers and setters
	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		this.Salary = salary;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		this.Company = company;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		this.EmpId = empId;
	}

}
