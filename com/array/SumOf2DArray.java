package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class SumOf2DArray {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			int lenr,lenc,sum=0;
			
			System.out.println("Enter the number of Rows in Array");
			lenr=sc.nextInt();
			System.out.println("Enter the number of Rows in Array");
			lenc=sc.nextInt();
			
			int[][]a=new int [lenr][lenc];
			int[][]b=new int [lenr][lenc];
			int[][]c=new int [lenr][lenc];
			int i=0, j=0;
			
			for ( i=0; i<lenr; i++) {
				for (j=0; j<lenc; j++) {
					
					System.out.println("Enter Value of the A Array[" + i + " ]"+"[" + j + " ]" + "th position");
					
					a[i][j]=sc.nextInt();
				}
			}
			
			for(i=0; i<lenr; i++) {
				for(j=0; j<lenc; j++) {

					System.out.println("Enter Value of the B Array[" + i + " ]"+"[" + j + " ]" + "th position");
					
					b[i][j]=sc.nextInt();
				}
					
				for(i=0; i<lenr; i++) {
					for(j=0; j<lenc; j++) {
						
						c[i][j]=a[i][j]+b[i][j];
				
			}
	}
				for(i=0;i<lenr;i++) {
					for(j=0; j<lenc; j++) {
						
						System.out.println(" "+c[i][j]+" ");
					}
					
					System.out.println(" ");
				}

}
	}
			}
	
