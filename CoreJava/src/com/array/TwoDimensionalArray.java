package com.array;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		int lenr,lenc;
		
		System.out.println("Enter the number of Rows in Array");
		lenr=sc.nextInt();
		System.out.println("Enter the number of Rows in Array");
		lenc=sc.nextInt();
		
		int[][]a=new int [3][3];
		int i=0, j=0;
		
		for ( i=0;i<lenr;i++) {
			for (j=0;j<lenc;j++) {
				System.out.println("Enter Value of the Arrays[" + i + " ]"+"[" + j + " ]" + "th position");
				
				a[i][j]=sc.nextInt();
			}
		}
		
		for(i=0; i<lenr; i++) {
			for(j=0;j<lenc;j++) {
				System.out.print(+a[i][j]+" ");
			}
			System.out.println(" ");
		}
			
			
//		for ( i=0;i<3;i++) {
//			for (j=0;j<3;j++) {
//				
//			}
//		System.out.println(a[2][2]);
//		System.out.println(" ");
//
//	}

		}
}
