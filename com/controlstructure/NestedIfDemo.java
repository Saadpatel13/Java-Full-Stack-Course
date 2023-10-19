package com.controlstructure;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = obj.nextInt();
		
		if (a <50)
		{
			if (a > 30)
			{
				System.out.println("The number is valid");
			}
		}
		else {
			System.out.println("The number is invalid");
		}
	}

}