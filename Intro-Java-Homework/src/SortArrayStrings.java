import java.util.Scanner;
import java.util.Arrays;
public class SortArrayStrings {

	public static void main(String[] args) {
		
		  int number;
		  Scanner in = new Scanner(System.in);	       
	      number = in.nextInt();      	     
	       String[] Arr=new String[number];
	       for(int i=0;i<Arr.length;i++){
	    	   
	    	   Arr[i]=in.next();    	   
	    	   
	       }
	       in.close();
	       
	       Arrays.sort(Arr);
	       
	        for(int i = 0; i < Arr.length; i++){
	            System.out.println(Arr[i]);
	        }	       
	}

}

