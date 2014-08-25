import java.util.Scanner;


public class CountBitsOne {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		String bin = String.format("%10s", Integer.toBinaryString(number)).replace(' ', '0');
		System.out.println(bin);		
		int j=0;
		int i=0;		
		while(j<17){
			
			int nRight=number>>j;
			int bit=nRight & 1;
			if (bit==1) {
				i++;
			}
			j++;
			
		}System.out.println(i);
		
		
	}

}
