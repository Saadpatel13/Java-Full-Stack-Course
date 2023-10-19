package com.array;

public class SearchingNumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,0};
		int f=10, c=2;
		for(int i=0;i<a.length;i++) {
			if(f==a[i]) {
				c++;
			}
		}
		if(c>=1) {
			System.out.println("The number is present");
		}
		else {
			System.out.println("The number is not present");
		}
	}

}
