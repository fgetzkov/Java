import java.util.Scanner;
 
 
public class stuck_numbers {
        public static void main(String[] args){
                Scanner scan=new Scanner(System.in);
                String cards=scan.nextLine();
                String[] splitCards=cards.split("\\W+");
                int umnojenie=0;
                long result=0;
                int[] current=new int[splitCards.length];
                String currrent="";
                for (int i = 0; i < splitCards.length; i++) {
                        currrent=""+splitCards[i].charAt(0);
                        current[i]=weightReturner(currrent);
                }
                for (int i = 0; i < current.length; i++) {
                        if(i==0){
                                if(current[i]==current[i+1]){
                                        umnojenie+=(current[i]*2);
                                }
                                else{
                                        result+=current[i];
                                }
                        }
                        else if(i>0 && i<current.length-1){
                                if(current[i]==current[i-1] || current[i]==current[i+1]){
                                        umnojenie+=(current[i]*2);
                                }
                                else{
                                        result+=current[i];
                                }
                        }
                        else if(i==current.length-1){
                                if(current[i]==current[i-1]){
                                        umnojenie+=(current[i]*2);
                                }
                                else{
                                        result+=current[i];
                                }
                        }
                }
                result+=umnojenie;
                System.out.println(result);
        }
        public static int weightReturner(String card){
                int result=0;
                switch(card){
                case "2":
                        result=2;
                        break;
                case "3":
                        result= 3;
                        break;
                case "4":
                        result= 4;
                        break;
                case "5":
                        result= 5;
                        break;
                case "6":
                        result= 6;
                        break;
                case "7":
                        result= 7;
                        break;
                case "8":
                        result= 8;
                        break;
                case "9":
                        result= 9;
                        break;
                case "1":
                        result= 10;
                        break;
                case "J":
                        result= 12;
                        break;
                case "Q":
                        result= 13;
                        break;
                case "K":
                        result= 14;
                        break;
                case "A":
                        result= 15;
                        break;
                }
                return result;
        }
}
