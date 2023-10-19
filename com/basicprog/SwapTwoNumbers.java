package com.basicprog;

public class SwapTwoNumbers {
	

	public static void main(String[] args) {
		int a = 50;
		int b = 100;
		
		System.out.println("This is before swapping");
        System.out.println("a ="+a);
        System.out.println("b =" +b);
        
        int c = a;
        a = b;
        b = c;
        
        System.out.println("This is after swapping");
        System.out.println("a ="+a);
        System.out.println("b =" +b);
	}
}
