package com.loops;
import java.util.*;

public class FibonacciLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int f1,f2=0,f3=1;
		for(int i=1;i<=n;i++) {
			System.out.println(f2);
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}

	}

}
