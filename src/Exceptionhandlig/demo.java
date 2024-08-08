package Exceptionhandlig;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		System.out.println("start");
	Scanner scan=new Scanner(System.in);
	
	System.out.println("enter value of a");
	int a=scan.nextInt();
	System.out.println("enter value of B");
	int B=scan.nextInt();
	  System.out.println(a/B);
	  int c=a+B;
	  System.out.println(c);
	  scan.close();
	  System.out.println("stop");

	
	

	}
}
