package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Shivam";
		String name1 = "John";

		System.out.println("Number of chars in string is:" + name.length());
		System.out.println("the 4th char in string is:" + name.charAt(3));
		System.out.println("The last char in the string is:" + name.charAt(name.length() - 1));
		System.out.println("The string in uppercase is:" + name1.toUpperCase());

	}

}
