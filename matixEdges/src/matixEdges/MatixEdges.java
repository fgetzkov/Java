package matixEdges;

import java.util.Scanner;

public class MatixEdges {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int dimRow = matrix.length;
		int dimCow = matrix[0].length;
		int tempX = 0;
		int tempY = 0;
		for (int i = 0; i < 1; i++) {

			while (tempY < dimCow) {
				System.out.print(matrix[tempX][tempY] + " ");
				tempY++;
			}
			tempY--;
			tempX++;
			while (tempX < dimRow) {

				System.out.print(matrix[tempX][tempY] + " ");
				tempX++;
			}
			tempX--;
			while (tempY >= 0) {
				System.out.print(matrix[tempX][tempY] + " ");
				tempY--;
			}
			tempY++;
			tempX--;
			while (tempX > 0) {

				System.out.print(matrix[tempX][tempY] + " ");
				tempX--;
			}

		}

	}
}
