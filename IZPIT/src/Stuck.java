import java.util.Scanner;
 
 
public class Stuck {
        public static void main(String[] args){
                Scanner scan=new Scanner(System.in);
                int n=scan.nextInt();
                int[] sequence=new int[n];
                String left="";
                String right="";  
                String leftLeft="";
                String rightRight="";
                int count=0;
                for (int i = 0; i < sequence.length; i++) {
                        sequence[i]=scan.nextInt();
                }
                count = sequence(sequence, count);
                if(count==0){
                        System.out.println("No");
                }
        }

		private static int sequence(int[] sequence, int count) {
			String left;
			String right;
			String leftLeft;
			String rightRight;
			for (int i = 0; i < sequence.length; i++) {
			 for (int j = i+1; j < sequence.length; j++) {
			  for (int j2 = 0; j2 < sequence.length; j2++) {
			   for (int k = j2+1; k < sequence.length; k++) {
			     if(sequence[i]!=sequence[j] &&
			       sequence[i]!=sequence[j2] &&
			       sequence[i]!=sequence[k] &&
			       sequence[j]!=sequence[j2] &&
			       sequence[j]!=sequence[k] &&
			       sequence[j2]!=sequence[k]){
			       left=""+sequence[i]+sequence[j];
			       right=""+sequence[j2]+sequence[k];
			       rightRight=""+sequence[k]+sequence[j2];
			       leftLeft=""+sequence[j]+sequence[i];
			       if(left.equals(right)){
			       System.out.println(sequence[i] + "|" + sequence[j] + "==" + sequence[j2] + "|" + sequence[k]);
			       count++;
			       }
			       else if(left.equals(rightRight)){
			       System.out.println(sequence[i] + "|" + sequence[j] + "==" + sequence[k] + "|" + sequence[j2]);
			       count++;
			       }
			       else if(leftLeft.equals(right)){
			       System.out.println(sequence[j] + "|" + sequence[i] + "==" + sequence[j2] + "|" + sequence[k]);
			       count++;
			       }
			       else if(leftLeft.equals(rightRight)){
			       System.out.println(sequence[j] + "|" + sequence[i] + "==" + sequence[k] + "|" + sequence[j2]);
			       count++;
			        }
			        }
			        }
			        }
			        }
			}
			return count;
		}
}