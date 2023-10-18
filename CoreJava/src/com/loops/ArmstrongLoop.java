package com.loops;

import java.util.Scanner;

public class ArmstrongLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int arm=0,r=0;
		int n=sc.nextInt();
		int copy=n;
		while(n!=0) {
			r=n%10;
			arm=arm+(r*r*r);
			n=n/10;
		}
		if(arm==copy) {
			System.out.println("The number is Armstrong");
		}
		else {
			System.out.println("The number is not Armstrong");
		}

	}

}
