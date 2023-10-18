package com.operators;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a=a+b is powercng" + (a+=b));
		System.out.println("a=a-b is " + (a-=b));
		System.out.println("a=a*b is " + (a*=b));
		System.out.println("a=a/b is " + (a/=b));
		System.out.println("a=a%b is " + (a%=b));
	

	}

}
