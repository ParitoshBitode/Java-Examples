package loops;

import java.util.Scanner;

public class For_Loop {

	public static void main(String[] args) {
		
		int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number from 1 to 10 :");
		
		x = sc.nextInt();
		
		for(int i=0 ; i < x; i++)
		{
			System.out.println("Hello World");
		}
	
	}

}
