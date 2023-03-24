package oops;

public class Parent extends GrandParent {

	public int SSN;

	public Parent() {

		super();
		System.out.println("inside default cons of Parent");
	}

	public Parent(String Name, String CountryName, int age, int SSN) {

		super();
		System.out.println("Inside param cons of Parent");

		this.Name = Name;
		this.CountryName = CountryName;
		this.age = age;
		this.SSN = SSN;
	}

	public void Print() {
		System.out.println("SSN is " + SSN);
	}

}
