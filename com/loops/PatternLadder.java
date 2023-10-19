package com.loops;

import java.util.Scanner;

public class PatternLadder {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
	
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=0; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
			
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
