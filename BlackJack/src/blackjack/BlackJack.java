/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blackjack;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    
    static Game game= new Game();
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        GUI gui = new GUI();
        
        
        
        game.genrator();
        game.nameanddraw();
        
        gui.runGUI( game.cards,
                game.players[0].handcards,
                game.players[1].handcards,
                game.players[2].handcards,
                game.players[3].handcards);
        
        turnofplayers(gui);
        
        game.updatescore();
        
        turnofdealer(gui);
        
       game.updatescore();
       
       check();
                 
    }
    
    public static void turnofplayers(GUI gui){
        Scanner s =new Scanner(System.in);
       
        for(int i = 0 ; i<game.players.length -1 ;i++){
              String input ="" ;
            while(!input.toLowerCase().equals("0")){
                System.out.println("player "+(i+1)+"{hit or stand}");
                input = s .next();
                if(input.toLowerCase().equals("1")){
                 newcardtoplayers(i ,gui);
                  System.out.println("your score"+game.players[i].score);
                 if(game.players[i].score>21){
                     System.out.println("player is BUSTED");
                     break;
                 }
                 if(game.players[i].score==21){
                      System.out.println("player has BLACKJACK");
                      break;
                     
                 }
                 
                }
                
            }
        }
      
    
}
    
    public static void newcardtoplayers(int index ,GUI gui){
        Card card = game.cardrandom();
        game.players[index].newcard(card);
        gui.updatePlayerHand(card ,index);
    }
    
    
    public static void turnofdealer(GUI gui){
        boolean dwin=true;
        int maxscore=0;
        
        for(int i =0 ; i< game.players.length -1 ; i++){
            if(game.maxscore[i]>=game.players[3].score){
                dwin=false;
            }
            if(game.maxscore[i]>maxscore){
                
                maxscore =game.maxscore[i];
            }
      
        }
        if(!dwin){
            newcardtodealer(gui, maxscore);
            
        }
        else
            
        return;
        
        
       
        
            
        
    }
    
    public static void newcardtodealer(GUI gui ,int maxscore  ){
        
        while(game.players[3].score < maxscore){
            
        Card card = game.cardrandom();
        game.players[3].newcard(card);
        gui.updateDealerHand(card , game.cards);
            
        }
    }
    
 public static void check(){
     int maxscore = 0 ;
     int winner =-1 ;
     for (int i = 0 ;i<game.players .length ;i++){
         
         if (game.maxscore[i] > maxscore && game.maxscore[i]<=21 ){
             maxscore =game.maxscore[i];
             winner=i;
         }
     }
     if (winner >=0){
         System.out.println("\n********************************************************");
         System.out.println("the winner is "+game.players[winner].name+" with score :"+ maxscore);
     }
     
 }   
 
}