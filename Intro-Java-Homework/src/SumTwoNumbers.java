import java.util.Scanner;


public class SumTwoNumbers {

	public static void main(String[] args) {
		int a;
		int b;
		int ress;
		Scanner in = new Scanner(System.in);	       
	       a = in.nextInt();
	       b=in.nextInt();
	       in.close();        
	       ress=a+b;
	       System.out.println(ress);
	}

}
