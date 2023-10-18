package com.loops;

import java.util.Scanner;

public class TableForLopp {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter a number : ");
		Scanner table = new Scanner(System.in);
		a=table.nextInt();
		
		
		int i;
		System.out.println("The multiplication table of " +a+ " is: ");
		for(i=1; i<=10; i++) {
			System.out.println(+a*i);
		}
	}

}
