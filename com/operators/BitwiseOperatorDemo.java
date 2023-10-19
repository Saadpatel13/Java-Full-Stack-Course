package com.operators;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		int n = 12;
		int x = 4;
		
		System.out.println("The AND result is: "+(n & x));
		System.out.println("The OR result is : "+(n | x));
		System.out.println("The XOR result is: "+(n ^ x));
		System.out.println("");
		System.out.println("Left shifted to  : "+(n<<x));
		System.out.println("Right shifted to : "+(n>>x));
	}
}
