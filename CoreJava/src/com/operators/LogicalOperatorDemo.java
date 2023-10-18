package com.operators;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
		 int a = 5;
		 int b = 2;
		 int c = 8;
		 
		 System.out.println("The result of a>b && a>c is "+(a>b && a>c));
		 System.out.println("The result of a>b && a<c is "+(a>b && a<c));
		 System.out.println("The result of a>b || b<c is "+(a>b || b<c));
		 System.out.println("The result of !(a>b) is "+(!(a>b)));
		 System.out.println("The result of !(a<b) is "+(!(a<b)));

	}

}
