import java.util.Scanner;


public class TheSmallestNumbers {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		float num1=input.nextFloat();
		float num2=input.nextFloat();
		float num3=input.nextFloat();
		float min;
		min=num1;
		if (num2<min) {
			min=num2;
		}
	    if (num3<min) {
			min=num3;
		}
	    System.out.println(min);	

	}

}
