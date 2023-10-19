package com.controlstructure;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your grade: ");
		int grade = obj.nextInt();
		
		if(grade >= 75)
		{
			System.out.println("Congrats, you have passed in Distinction");
		}
		else if (grade >= 60) {
			System.out.println("Congrats, you have passed in First class");
		}
		else if (grade >=50) {
			System.out.println("Congrats, you have passed in Second class");
		}
		else if (grade >=40) {
			System.out.println("Congrats you have passed");
		}
		else {
			System.out.println("Failed");
		}

	}

}