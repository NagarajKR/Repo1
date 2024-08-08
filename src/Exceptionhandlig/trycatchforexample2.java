package Exceptionhandlig;

import java.util.Scanner;

public class trycatchforexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("started");
		int a=scan.nextInt();
		System.out.println(a);
		int b=scan.nextInt();
		System.out.println(b);
		try {
		System.out.println(a/b);
	}
		catch (Exception e) {
			System.out.println("exception handled");
			
		}
		
		System.out.println("ended");
	}

}
