package com.array;

public class MergingTwoMatrices {

	public static void main(String[] args) {
		
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int len1= a.length;
		int len2= a.length;
		int []c = new int[len1+len2];
		int pos = 0;
		int p=1;
		
		for(int ele:a) {
			c[pos]=ele;
			
			pos=pos+2;
		}
		for(int ele:b) {
			c[p]=ele;
			p=p+2;
		}
		for(int res:c) {
			System.out.println(res+" ");
		}
			
		}

	}


