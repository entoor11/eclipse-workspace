package test;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int num = 1; num < 11; num++) {

			System.out.println(num);
		}

		System.out.println("End of for loop");

		for (int num1 = 10; num1 > 0; num1 -= 2) {

			System.out.println("num1 valueis:" + num1);

		}
		System.out.println("End of second for loop");

		System.out.println("Table of 2");

		int num1 = 2;

		for (int i = 1; i < 11; i++) {

			System.out.println(num1 * i);

			System.out.printf("%d * %d = %d \n", num1, i, num1 * i);

		}

		System.out.println("End Table of 2");

		// Loops with Array

		int arr1[] = { 2, 3, 4, 6, 8, 9 };
		for (int i = 0; i < arr1.length; i++) {

			System.out.println("Element value is:" + arr1[i]);
		}
		
		//For each loop
		
		for(int val:arr1) {
			System.out.println("Value is:"+val);
		}
		
		String str1= "John";
		for(int i=0;i<str1.length();i++) {
			System.out.println("Char val is:" +str1.charAt(i));
		}
		
	}
}