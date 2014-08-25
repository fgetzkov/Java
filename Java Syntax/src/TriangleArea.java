import java.util.Scanner;


public class TriangleArea {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int Ax=input.nextInt();
		int Ay=input.nextInt();
		int Bx=input.nextInt();
		int By=input.nextInt();
		int Cx=input.nextInt();
		int Cy=input.nextInt();
		
		int Area;
		
		int AB=Ax*(By-Cy);
		int BC=Bx*(Cy-Ay);
		int AC=Cx*(Ay-By);
		
		Area=(AB+BC+AC)/2;
		
		System.out.println(Area);		

	}

}
