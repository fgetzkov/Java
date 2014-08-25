import java.util.Scanner;


public class CountEqualBitPairs {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		String bin = String.format("%10s", Integer.toBinaryString(number)).replace(' ', '0');
		System.out.println(bin);		
		int j=0;
		int i=0;	
		int z=1;
		
		while(z<11){
			
			int nRight=number>>j;
			int nnRight=nRight>>z;
			int bit=nRight & 1;
			int bit2=nnRight & 1;
			System.out.print(bit);
			System.out.print(bit2);
			
			if (bit==bit2) {
				i++;
			}
			j=j+2;
			z=z+2;
			
			
		}//System.out.println(i);
	}

}
