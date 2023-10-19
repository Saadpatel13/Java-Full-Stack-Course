package com.controlstructure;

import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args) {
		/*int a = 5;
		if (a%2==0)
		{
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}*/
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int b = obj.nextInt();
		//if(b%4 == 0)
		if(b%4 == 0&&b%100!=00)
		{
			System.out.println("It's a leap year");
		}
		else {
			System.out.println("it's not a leap year");
		}

	}

}
