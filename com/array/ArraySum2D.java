package com.array;

import java.util.Scanner;

public class ArraySum2D {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int lenr,lenc;
		
//		Accepting User Input For Number Of Rows & Columns.
		
		System.out.println("Enter The Number Of Rows Of Array");
		lenr = sc.nextInt();
		System.out.println("Enter The Number Of Coloum Of Array");
		lenc = sc.nextInt();		
		
		
		int[][]a=new int[lenr][lenc];
		int[][]b=new int[lenr][lenc];
		int[][]c=new int[lenr][lenc];
		
		int i=0,j=0;
		
		
		for (i=0; i<lenr; i++) {
		 	for(j=0; j<lenc; j++) {
				
				System.out.println("Enter Value For A Array's [" + i + "]" + "["  + j +  "]"  + "th Posttion");
				
				a[i][j]=sc.nextInt();
				
			}
		}
		
		for (i=0; i<lenr; i++) {
		 	for(j=0; j<lenc; j++) {
				
				System.out.println("Enter Value For B Array's [" + i + "]" + "["  + j +  "]"  + "th Posttion");
				
				b[i][j]=sc.nextInt();
				
			}
		}
	
		 	
		 	for (i=0; i<lenr; i++) {
			 	for(j=0; j<lenc; j++) {
					
			c[i][j] = a[i][j]  +  b[i][j];
					
				}
			}
		 	
		 	System.out.println(" ");
		 	System.out.println(" ");
		 	
		 	for (i=0; i<lenr; i++) {
				
				for(j=0; j<lenc; j++) {

					System.out.print("  "+a[i][j]+"  ");
					
				}
				System.out.println("");
			}

		 	
		 	System.out.println(" ");
		 	System.out.println(" ");
		 	
		 	for (i=0; i<lenr; i++) {

		 		for(j=0; j<lenc; j++) {

		 			System.out.print("  "+b[i][j]+"  ");
	
		 			}
		 		System.out.println("");
		 	}
		 	
		 	System.out.println(" ");
		 	System.out.println(" ");

		 for (i=0; i<lenr; i++) {
				
				for(j=0; j<lenc; j++) {

					System.out.print("  "+c[i][j]+"  ");
					
				}
				System.out.println("");
			}
}

}
