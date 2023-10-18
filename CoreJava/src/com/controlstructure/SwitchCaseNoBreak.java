package com.controlstructure;

import java.util.Scanner;

public class SwitchCaseNoBreak {

	public static void main(String[] args) {
		int ch;
		Scanner sc = new Scanner (System.in);
				System.out.println("Enter the choice");
				ch = sc.nextInt();
				switch (ch){
				case 1:
					System.out.println("Case 1");
				case 2:
					System.out.println("Case 2");
				case 3:
					System.out.println("Case 3");
				default:
					System.out.println("Default");
	}
}
}