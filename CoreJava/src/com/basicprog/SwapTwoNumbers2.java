package com.basicprog;

public class SwapTwoNumbers2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println("This is before swapping");
        System.out.println("a ="+a);
        System.out.println("b =" +b);
        
        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.println("This is after swapping");
        System.out.println("a ="+a);
        System.out.println("b =" +b);

	}

}
