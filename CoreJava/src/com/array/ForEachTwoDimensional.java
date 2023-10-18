package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachTwoDimensional {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int lenr,lenc;
		
		System.out.println("Enter the number of Rows in Array");
		lenr=sc.nextInt();
		System.out.println("Enter the number of Rows in Array");
		lenc=sc.nextInt();
		
		int[][]a=new int [lenr][lenc];
		int i=0, j=0;
		
		for ( i=0; i<lenr; i++) {
			for (j=0; j<lenc; j++) {
				
				System.out.println("Enter Value of the Arrays[" + i + " ]"+"[" + j + " ]" + "th position");
				
				a[i][j]=sc.nextInt();
			}
		}
		
		for(i=0; i<lenr; i++) {
			for(j=0; j<lenc; j++) {
				
				// System.out.print(+a[i][j]+" ");
			}
		//	System.out.println(" ");
		}
//		System.out.println(" ");
//		System.out.println(" ");
		
		for(int p[]:a)
		{
			System.out.println(Arrays.toString(p));
		}
	}

}
