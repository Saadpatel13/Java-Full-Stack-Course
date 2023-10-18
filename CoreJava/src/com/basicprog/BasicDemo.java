package com.basicprog;

public class BasicDemo {

	static int addition()
	{
		int a, b, res;
		a = 20;
		b = 10;
		res = a + b;
		return res;
	}
	
	static int substraction()
	{
		int a, b, res;
		a = 20;
		b = 10;
		res = a - b;
		return res;
	}
	
	static int multiplication()
	{
		int a, b, res;
		a = 20;
		b = 10;
		res = a * b;
		return res;
	}
	
	static int division()
	{
		int a, b, res;
		a = 20;
		b = 10;
		res = a/ b;
		return res;
	}
	public static void main(String[] args) {
		System.out.println("Result ="+addition());
		System.out.println("Result ="+substraction());
		System.out.println("Result ="+multiplication());
		System.out.println("Result ="+division());
		
	}

}
