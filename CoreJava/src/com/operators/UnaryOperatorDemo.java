package com.operators;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		int a = 10;
		System.out.println("The result of ++a is "+(++a));
		System.out.println("The result of --a is "+(--a));
		System.out.println("The result is "+(a++ + --a + --a + a++));
	}
}