package java_resources;

import java.io.*;
import java.util.Scanner;

public class read_File {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FileReader filereader=new FileReader("D://Amber_Java_Programs//readfile.txt");
		Scanner sc = new Scanner(filereader);
		
		while(sc.hasNext())
		{
			System.out.println(sc.next());
		}
		
	}
	

}
