package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows in the matrix:");
		int m = sc.nextInt();
		System.out.println("Enter the number of coluns in the matrix:");
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		System.out.println("Insert those inside the array:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter a number to know a position: ");
		int x = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position: " + i + ", " + j);

				}
			}

		}

		sc.close();

	}

}
