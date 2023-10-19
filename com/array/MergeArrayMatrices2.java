package com.array;

public class MergeArrayMatrices2 {

	public static void main(String[] args) {
		 int[] array1 = {1, 2, 3};
	        int[] array2 = {4, 5, 6};

	        int[] mergedArray = mergeArraysAlternatively(array1, array2);

	        System.out.println("Merged Array: ");
	        for (int i = 0; i < mergedArray.length; i++) {
	            System.out.print(mergedArray[i] + " ");
	        }
	    }

	    public static int[] mergeArraysAlternatively(int[] array1, int[] array2) {
	        int length1 = array1.length;
	        int length2 = array2.length;
	        int maxLength = Math.max(length1, length2);
	        int[] mergedArray = new int[length1 + length2];
	        int index = 0;

	        for (int i = 0; i < maxLength; i++) {
	            if (i < length1) {
	                mergedArray[index] = array1[i];
	                index++;
	            }
	            if (i < length2) {
	                mergedArray[index] = array2[i];
	                index++;
	            }
	        }

	        return mergedArray;

	}

}
