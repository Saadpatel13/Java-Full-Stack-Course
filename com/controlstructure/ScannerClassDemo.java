package com.controlstructure;
import java.util.Scanner;

public class ScannerClassDemo {
	

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = obj.nextInt();
		int sq = a*a;
		System.out.println("Square of "+a+" is "+sq);
		
		Scanner username = new Scanner(System.in);
		System.out.println("Enter your username: ");
		String b = username.nextLine();
		System.out.println("Your registered username is: "+username);
	}

}
