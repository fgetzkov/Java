import java.util.Scanner;


public class AngleUnitConverter {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	double gradus = input.nextDouble();
	double changedGradus = 0;
	String degRad=input.next();
	
	if (degRad.equals("deg")) {
		changedGradus=Math.toRadians(gradus);
	}

	if (degRad.equals("rad")) {
		changedGradus=Math.toDegrees(gradus);
	}
	System.out.printf("%.6f:" ,changedGradus);
	
	}

}
