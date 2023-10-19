package com.array;

import java.util.Scanner;

public class MatrixMultiplication {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the number of rows and columns for Matrix A: ");
//        int rowsA = sc.nextInt();
//        int colsA = sc.nextInt();
//
//        System.out.print("Enter the number of rows and columns for Matrix B: ");
//        int rowsB = sc.nextInt();
//        int colsB = sc.nextInt();
//
//        if (colsA != rowsB) {
//            System.out.println("Matrix multiplication is not possible. The number of columns in Matrix A must be equal to the number of rows in Matrix B.");
//           // return;
//        }
//
//        int[][] matrixA = new int[rowsA][colsA];
//        int[][] matrixB = new int[rowsB][colsB];
//        int[][] resultMatrix = new int[rowsA][colsB];
//
//        // Input for Matrix A
//        inputMatrix(sc, matrixA, "Matrix A");
//
//        // Input for Matrix B
//        inputMatrix(sc, matrixB, "Matrix B");
//
//        // Multiply Matrix A and Matrix B
//        multiplyMatrices(matrixA, matrixB, resultMatrix);
//
//        // Display the result Matrix
//        displayMatrix(resultMatrix, "Result Matrix");
//    }
//
//    // Function to input values into a matrix
//    private static void inputMatrix(Scanner sc, int[][] matrix, String matrixName) {
//        System.out.println("Enter values for " + matrixName + ":");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                System.out.print("Enter value for [" + i + "][" + j + "]: ");
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//    }
//
//    // Function to multiply two matrices
//    private static void multiplyMatrices(int[][] matrixA, int[][] matrixB, int[][] resultMatrix) {
//        int rowsA = matrixA.length;
//        int colsA = matrixA[0].length;
//        int colsB = matrixB[0].length;
//
//        for (int i = 0; i < rowsA; i++) {
//            for (int j = 0; j < colsB; j++) {
//                resultMatrix[i][j] = 0;
//                for (int k = 0; k < colsA; k++) {
//                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
//                }
//            }
//        }
//    }
//
//    // Function to display a matrix
//    private static void displayMatrix(int[][] matrix, String matrixName) {
//        System.out.println(matrixName + ":");
//        for (int[] row : matrix) {
//            for (int value : row) {
//                System.out.print("  " + value + "  ");
//            }
//            System.out.println();
//        }
//    }
	
	 public static void main(String[] args) {
	        int[][] A = {{1, 2, 3}, {4, 5, 6}};
	        int[][] B = {{7, 8}, {9, 10}, {11, 12}};

	        int rowsA = A.length;
	        int colsA = A[0].length;
	        int colsB = B[0].length;

	        int[][] C = new int[rowsA][colsB];

	        if (colsA == B.length) {
	            for (int i = 0; i < rowsA; i++) {
	                for (int j = 0; j < colsB; j++) {
	                    for (int k = 0; k < colsA; k++) {
	                        C[i][j] += A[i][k] * B[k][j];
	                    }
	                }
	            }

	            // Printing the result matrix C
	            for (int i = 0; i < rowsA; i++) {
	                for (int j = 0; j < colsB; j++) {
	                    System.out.print(C[i][j] + " ");
	                }
	                System.out.println();
	            }
	        } else {
	            System.out.println("Matrix multiplication is not possible.");
	        }
	    }
}

