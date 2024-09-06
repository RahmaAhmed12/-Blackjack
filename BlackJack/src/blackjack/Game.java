/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Game {
   Player [] players =new Player [4];
   Card[]cards =new Card [52];
   int[]maxscore =new int[4];
   
   int [] suit=new int [4];
   int []rank =new int [13];
   int []value =new int [13];
 
   
  
    
    public void genrator()
    {
         int counter =0 ;
        for(int i=0 ;i<4 ;i++)
        {
            for(int j=0;j<13;j++)
            {
              suit[i]=i;
              rank[j]=j;
              value[j]=j+1;
             if(j>9)
             {
                 value[j]=10;
             }
             Card c = new Card(suit[i],rank[j],value[j]);
          cards[counter]=c;
          counter ++;
            
           }
        }

    }
    
    public Card cardrandom()
  {
         Random rand =new Random();
        int randomchoice=rand.nextInt(52);
        
        while (true){
        if(cards[randomchoice]==null)
        {
          randomchoice=rand.nextInt(52);
          continue;
        }
       
        else{
            Card c1 =new Card (cards[randomchoice]);
         cards[randomchoice]=null;
          
        return c1;
         
       
        }
            
        }
        
        
  
    }

    
    
public void nameanddraw(){
    Scanner k=new Scanner(System.in);
    for(int i=0; i< players.length-1 ;i++){
        System.out .print("Please Enter your name "+(i+1)+":");
        players[i]= new Player();
        players[i].name=k.next();
        for(int j=0 ;j<2 ;j++){
           players[i].newcard( cardrandom());
        }

    }
    players[3]= new Player();
    players[3].name="dealer";
    for(int j=0 ;j<2 ;j++){
           players[3].newcard( cardrandom());
        }
   }
    

public void updatescore(){
    for(int i=0 ;i<maxscore.length ;i++){
        if ( maxscore[i]<=21){
        maxscore[i] = players[i].score;
        }
        else
            maxscore[i]=0;
    }
    
}
        
        
    
    
    
    
    
           
            
   
    
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
   



 