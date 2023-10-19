package com.basicprog;
import java.util.Scanner;
public class BasicDemoScanner {
	static int addition (int a, int b) {
		return a+b;
	}

	static int multiplication (int a, int b) {
		return a*b;
	}
	
	static int division (int a, int b) {
		return a/b;
	}
	
	static int substraction (int a, int b) {
		return a-b;
	}
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of 'a':");
		int a = scanner.nextInt();
		
		System.out.println("Enter the value of 'b':");
		int b = scanner.nextInt();
		
		int result1 = addition(a,b);
		int result2 = multiplication(a,b);
		int result3 = division(a,b);
		int result4 = substraction(a,b);
		
		System.out.println("Result for addition=" + result1);
		System.out.println("Result for multiplication=" + result2);
		System.out.println("Result for division=" + result3);
		System.out.println("Result for substraction=" + result4);
		scanner.close();
		

	}

}
