package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int len = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length Of Array ");		
		len=sc.nextInt(); 
		
		int[] a=new int[len];
		int[] b=new int[len];
		
		for(int i=0; i<len; i++) {
		System.out.println("Enter "+i+"th Value For Array");
			a[i] =sc.nextInt(); 
		
		
		}
		
		for(int i=0; i<len; i++) {
			
			b[i] = a[len - 1 -i];
			
			}
			
		System.out.println(" ");
		System.out.println("Value Of Array a is "+Arrays.toString(a));
	
		
		System.out.println(" ");
		System.out.println("Reversed Value Of Array a is "+Arrays.toString(b));
			

	}

}
