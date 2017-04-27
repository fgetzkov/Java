package printXmaxTree;

import java.util.Scanner;

public class Tree {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		int height = scanner.nextInt();
		int starCount = 1;
		int spaces = height-1;
		for (int i = 0; i < height; i++) {
			if(spaces!=0){
				String tempSpaces = String.format("%0"+spaces+"d", 0).replace("0", " ");
				builder.append(tempSpaces);}
				if (starCount!=0) {
					String tempStars = String.format("%0"+starCount+"d", 0).replace("0", "*");
					builder.append(tempStars);
				}
			builder.append("\n");
			starCount+=2;
			spaces--;
		}
		stem(builder, height);
		stem(builder, height);
		System.out.println(builder.toString());
	}

	private static void stem(StringBuilder builder, int height) {
		builder.append(String.format("%0"+ (height-1)+"d",0).replace("0"," "));
		builder.append("*\n");
	}
}

