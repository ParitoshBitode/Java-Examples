package java_resources;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String myString = sc.next();
		
		System.out.println("Enter the Integer");
		int myInt = sc.nextInt();
		
		System.out.println("Enter the Float");
		float myFloat = sc.nextFloat();
		
		System.out.println("Enter the double");
		double myDouble = sc.nextDouble();
		
		System.out.println(myString);
		System.out.println(myInt);
		System.out.println(myFloat);
		System.out.println(myDouble);
		
		
	}

}
