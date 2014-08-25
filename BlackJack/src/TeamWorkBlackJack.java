import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TeamWorkBlackJack {

    static int creditTotal = 200, creditBet = 0, pointsPlayer = 0, pointsPC = 0, randomByte = 51;
    static List<String> deckPlayer = getDeck();
    static List<String> deckPC = getDeck();
    static boolean firstHand = true, allowDrawPC = true, allowDrawPlayer = true;
    static String pcCardsPlayed = "";
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        boolean keepPlaying = true;
        Random generator = new Random();
        String drawCard = "y";
        
        
        
        
        while(keepPlaying == true) {
            
            getBet();
            
            while(true){
            
                    if (firstHand == true)
                    {
                        int rndCardPlayer = generator.nextInt(randomByte);
                        System.out.println("Your Card: " + deckPlayer.get(rndCardPlayer) + " Total Points: " + String.valueOf(getPoints(deckPlayer.get(rndCardPlayer), pointsPlayer, deckPlayer, "Player")));                
                        rndCardPlayer = generator.nextInt(randomByte);
                        System.out.println("Your Card: " + deckPlayer.get(rndCardPlayer) + " Total Points: " + String.valueOf(getPoints(deckPlayer.get(rndCardPlayer), pointsPlayer, deckPlayer, "Player")));
                                               
                        int rndCardPC = generator.nextInt(randomByte);
                       // pcCardsPlayed+=("PC drawed cards:\nPC Card: " + deckPC.get(rndCardPC) + " Total Points: " + String.valueOf(getPoints(deckPC.get(rndCardPC), pointsPC, deckPC, "PC")));                
                        System.out.println("PC Card: " + deckPC.get(rndCardPC) + " Total Points: " + String.valueOf(getPoints(deckPC.get(rndCardPC), pointsPC, deckPC, "PC")));                
                        rndCardPC = generator.nextInt(randomByte);
                        
                        pcCardsPlayed+=("\nPC Card: " + deckPC.get(rndCardPC) + " Total Points: " + String.valueOf(getPoints(deckPC.get(rndCardPC), pointsPC, deckPC, "PC")));
                        
                        firstHand = false;
                    }
                    else{
                        if (allowDrawPlayer == true){
                            int rndCardPlayer = generator.nextInt(randomByte);
                            System.out.println("Your Card: " + deckPlayer.get(rndCardPlayer) + " Total Points: " + String.valueOf(getPoints(deckPlayer.get(rndCardPlayer), pointsPlayer, deckPlayer, "Player")));                
                        }
                        
                        if (allowDrawPC == true){
                            int rndCardPC = generator.nextInt(randomByte);
                            pcCardsPlayed+=("\nPC Card: " + deckPC.get(rndCardPC) + " Total Points: " + String.valueOf(getPoints(deckPC.get(rndCardPC), pointsPC, deckPC, "PC")));                
                        }
                    }
                  
           
                if (pointsPlayer == 21 ){
                    System.out.println("Congratulations!!! You win!"); creditTotal+=creditBet*2;
                    System.out.println("PC points: " + pointsPC + "\nPlayer points: " + pointsPlayer);
                    newSet();
                    break;
                }
                else if (pointsPC == 21 || pointsPlayer > 21) {
                    System.out.println("PC wins. You lose.");
                    System.out.println("PC points: " + pointsPC + "\nPlayer points: " + pointsPlayer);
                    newSet();
                    break;
                }
                else if (pointsPC > 21){
                    System.out.println("You win! Player points: " + pointsPlayer);
                    System.out.println("PC points: " + pointsPC + "\nPlayer points: " + pointsPlayer);
                    allowDrawPC = false;
                }
                else if (pointsPC >=17 && pointsPC < 21){
                    allowDrawPC = false;
                }
                
                if (allowDrawPlayer == true){
                    System.out.println("Do you want to draw a card? y/n");
                    drawCard = scan.next();
                    if(drawCard.equals("n")){
                        allowDrawPlayer = false;
                    }
                }

                if (allowDrawPlayer == false && allowDrawPC == false){
                    System.out.println("PC points: " + pointsPC + "\nPlayer points: " + pointsPlayer);
                    
                    if (pointsPC > pointsPlayer){System.out.println("You lose!");}
                    else if (pointsPC < pointsPlayer){System.out.println("You Win!");}
                    else if (pointsPC == pointsPlayer){System.out.println("Draw!");}
                    
                    System.exit(0);
                }

            }
            
            System.out.println(pcCardsPlayed);
            pcCardsPlayed = "";
            
        }
    }
    
    public static void newSet(){
        deckPlayer = getDeck();
        deckPC = getDeck();
        pointsPlayer = 0;
        pointsPC = 0;
        randomByte = 51;
        firstHand = true;
        allowDrawPlayer = true;
        allowDrawPC = true;
        
    }
    
    public static void getBet(){
        Scanner scan = new Scanner(System.in); 
        System.out.println("How much do you want to bet? You have " + creditTotal + ". If you want to stop the game, type 'NO'");
        
        String bet = scan.next();
        
        while ((Integer.parseInt(bet) < 0) || (Integer.parseInt(bet) > creditTotal)) {
            System.out.println("Not enough credits!");
            bet=String.valueOf(scan.nextInt());
        }
        
        if ("NO".equals(bet.toUpperCase())){
            System.out.println("Have a nice day!");
            System.exit(0);
        }
        
        creditBet = Integer.parseInt(bet);
        creditTotal -= creditBet;        
    } 
    
    public static int getPoints(String card, int points, List<String> deck, String typePlayer){
        if (card.charAt(0) == '2')      {points+=2; deck.remove(card);}
        else if (card.charAt(0) == '1') {points+=10; deck.remove(card);}
        else if (card.charAt(0) == '3') {points+=3; deck.remove(card);}
        else if (card.charAt(0) == '4') {points+=4; deck.remove(card);}
        else if (card.charAt(0) == '5') {points+=5; deck.remove(card);}
        else if (card.charAt(0) == '6') {points+=6; deck.remove(card);}
        else if (card.charAt(0) == '7') {points+=7; deck.remove(card);}
        else if (card.charAt(0) == '8') {points+=8; deck.remove(card);}
        else if (card.charAt(0) == '9') {points+=9; deck.remove(card);}
        else if (card.charAt(0) == 'J' || card.charAt(0) == 'Q' || card.charAt(0) == 'K') {points+=10; deck.remove(card);}
        else if (card.charAt(0) == 'A') {
            
            if (typePlayer.equals("PC")){
                Scanner scan = new Scanner(System.in);               
                System.out.println("Your card is 'Ace'. Do you want it to count as a '11' or as '1'? Type 11 or 1:");
                String choice = scan.nextLine();            
                if ("11".equals(choice))  points+=11;
                else points+=1;
                deck.remove(card);
            }
            else {
                if ((11 + pointsPC) >= 22){
                    pointsPC+=1;
                }
                else pointsPC +=11;            
            }
            
            
        }
        randomByte--;
        
         
        if (typePlayer.equals("PC")){
            pointsPC = points;
            return pointsPC;
        }
        else if (typePlayer.equals("Player")){
            pointsPlayer = points;
            return pointsPlayer;
        }
        
        return points;
    }
    
    private static List<String> getDeck() {
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] color = {"\u2663", "\u2666", "\u2665", "\u2660"};
        List<String> thisDeck = new ArrayList<String>();

        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < color.length; j++) {
                thisDeck.add(numbers[i] + "" + color[j]);
            }
        }
        return thisDeck;
    }  
    
    
    private static void creditsLimit(Scanner input) {
        int Credits = input.nextInt();
        int creditsNow=200;
        while ((Credits<0) || (Credits>creditsNow)) {
            System.out.println("Nqmash tolkova crediti");
            Credits=input.nextInt();
        }
    }
    
    
    
    
}
