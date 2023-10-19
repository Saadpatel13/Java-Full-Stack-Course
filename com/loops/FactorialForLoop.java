package com.loops;

public class FactorialForLoop {

	public static void main(String[] args) {
		int i;
		int fact=1;
		for(i=5;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("fact is : "+fact);

}}
