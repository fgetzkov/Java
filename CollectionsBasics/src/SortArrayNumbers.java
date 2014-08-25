import java.util.Arrays;
import java.util.Scanner;


public class SortArrayNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[]numbersArr=new int[n];
		for (int i = 0; i < numbersArr.length; i++) {
			
			numbersArr[i]=input.nextInt();
		}
		
		Arrays.sort(numbersArr);
		
		for (int i = 0; i < numbersArr.length; i++) {
			
			System.out.println(numbersArr[i]);
		}
		

	}

}
