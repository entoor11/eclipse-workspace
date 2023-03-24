package oops;

//Multilevel Grandparent-parent-grandchild 
public class GrandChild extends Parent{
public int InsuranceId;
	
	public GrandChild() {
		//this will call parent class default constructor
		super ();
		System.out.println("inside default cons of GrandChild");
	}
	
	public void Print() {
		//it will call print method of grandparent
		
		super.Print();
		System.out.println("Insurance Id is " + InsuranceId);
		
	}

	public void Print(String message) {
		
		System.out.println("Typing some message " + message);
		
	}


}
