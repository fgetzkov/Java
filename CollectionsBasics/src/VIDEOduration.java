import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class VIDEOduration {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in); 
		boolean stop = true;
		int i = 0;
		String time ;
		int sum=0;
		int minutes=0;
		ArrayList <String> timeList = new ArrayList<>();
		
		
		while (stop) {
			
			time=input.next();
			timeList.add(time);
			if (time.equals("End")) {
				stop=false;
			}
			
		}
		timeList.remove("End");
		String listString = "";

		for (String s : timeList)
		{
		    listString += s + ",";
		}
		 String[]timeTime=listString.split("[, :]+");
		 int[] timeTimeNum=new int[timeTime.length];
		
		for (int j = 0; j < timeTime.length; j++) {
		   
			timeTimeNum[j]=Integer.parseInt(timeTime[j]);
				
		}
		
		int hour=0;
		for (int j = 0; j < timeTimeNum.length; j++) {
			
			if (j%2==0) {
				
				hour=timeTimeNum[j];
				hour=hour*60;
											
			}
			else {
				hour=timeTimeNum[j];
			}
			
			sum= sum+ hour;
		}
		hour=sum/60;
		minutes=(sum%60);
		
		System.out.print(hour+":");
		if (minutes<10) {
			System.out.print("0"+minutes);
		}
		else {
			System.out.print(minutes);
		}
	}

}
