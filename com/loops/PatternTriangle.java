package com.loops;

import java.util.Scanner;

public class PatternTriangle {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
	
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=0; i<n; i++) {
			
			for(int j=n-i; j>1; j--) {
			
				System.out.print(" ");
			}
			for (int j=0;j<=i;j++)
			{
				System.out.print("* ");
				
			}
			
			System.out.println();
			

			
			}
		
		}
		

	}

