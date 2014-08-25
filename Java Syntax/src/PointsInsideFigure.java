import java.util.Scanner;


public class PointsInsideFigure {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		float B=input.nextFloat();
		float A=input.nextFloat();
		
		if ( (A>=8.5 && A<=13.5 && B>=12.5 && B<=17.5)||
				(A>=6 && A<=8.5 && B>=12.5 && B<=22.5)||
				(A>=8.5 && A<=13.5 && B>=20 && B<=22.5)) {
			System.out.println("inside");
		}
		else {
			System.out.println("outside");
		}
	}

}
