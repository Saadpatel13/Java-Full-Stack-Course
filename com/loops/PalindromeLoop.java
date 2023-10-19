package com.loops;

import java.util.Scanner;

public class PalindromeLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int rev = 0, copy=n,r=0;
		
		while(n!=0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(rev==copy)
			System.out.println("The number is Palindrome");
		else {
			System.out.println("The number is not a palindrome");
		}
	}
}
