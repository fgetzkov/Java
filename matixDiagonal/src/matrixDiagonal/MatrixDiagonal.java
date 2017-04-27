package matrixDiagonal;

import java.util.Scanner;

public class MatrixDiagonal {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4,5 }, { 5, 6, 7, 8 ,5}, { 9, 10, 11, 12,5 },{ 9, 10, 11, 12,5 } };
		int dimRow = matrix.length;
		int dimCow = matrix[0].length;
		int x = 0;
		int y = 0;
		int tempX = 0;
		int tempY = 0;
		int diagonals = dimCow + dimRow - 1;

		for (int i = 0; i < diagonals; i++) {
			if (x < dimRow) {
				tempX = x;
				for (int j = 0; j <= x; j++) {
					System.out.print(matrix[tempX][j] + " ");
					tempX--;
				}
			}
			x++;
			if (y < dimCow && x == dimRow) {
				y++;
				tempX = x - 1;
				for (int k = 1; k < dimCow; k++) {
					tempY = y;
					while (tempY < dimCow && tempX >= 0) {
						System.out.print(matrix[tempX][tempY] + " ");
						tempX--;
						tempY++;
					}
					tempX = x - 1;
					y++;
				}
			}
		}
	}

}
