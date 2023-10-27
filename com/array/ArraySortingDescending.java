package com.array;

import java.util.Scanner;

public class ArraySortingDescending {

	public static void main(String[] args) {
		int[] a = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + i + "th number");
            a[i] = sc.nextInt();
        }

        // Call the sorting method
        sortArray(a);

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void sortArray(int[] array) {
        int temporary;
        int length = array.length; // Get the length of the array

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] > array[j]) {
                    temporary = array[i];
                    array[i]	 = array[j];
                    array[j] = temporary;
                }
            }
        }

	}

}
