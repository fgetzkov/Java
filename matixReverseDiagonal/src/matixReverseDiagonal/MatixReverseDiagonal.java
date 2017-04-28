package matixReverseDiagonal;

import java.util.Scanner;

public class MatixReverseDiagonal {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int dimRow = matrix.length;
		int dimCow = matrix[0].length;
		int x = 0;
		int y = 0;
		int tempX = 0;
		int tempY = 0;
		int diagonals = dimCow + dimRow - 1;

		for (int i = 0; i < diagonals; i++) {
			if (i < dimCow) {
				tempX = 0;
				tempY = y;
				print(matrix, dimRow, tempX, tempY);
				y++;

			}
			if (i >= dimCow) {
				tempX = x;
				tempY = dimCow - 1;
				print(matrix, dimRow, tempX, tempY);
				x++;

			}
		}

	}

	private static void print(int[][] matrix, int dimRow, int tempX, int tempY) {
		while (tempX < dimRow && tempY >= 0) {
			System.out.print(matrix[tempX][tempY] + " ");
			tempX++;
			tempY--;
		}
	}
}
