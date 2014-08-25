import java.util.Scanner;

public class SequencesEqualStrings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[]wordsArr=str.split(" ");
		System.out.print(wordsArr[0]);
		
		for (int i = 1; i < wordsArr.length; i++) {
		
			if (wordsArr[i].equals(wordsArr[i-1])) {
				System.out.print(" "+wordsArr[i]);
			}
			else {
				System.out.println();
				System.out.print(wordsArr[i]);
			}
		}		
	}

}
