/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

/**
 *
 * @author DELL
 */
public class Player  {
     public String name;
     public int score=0;
    Card[]handcards =new Card [11];
    int count=0;

    
    public void newcard(Card car){
        if (count <11){
            handcards[count]=car;
            count++;
            score+=car.getValue();
        }
    }
//    public Player(String name, int score) {
//        this.name = name;
//        this.score = score;
//    }
//
//    
//
//   public void setName(String name) {
//       this.name = name;
//   }
//
//    public void setScore(int score) {
//        this.score = score;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getScore() {
//        return score;
//    }

    
    
    
    
    
    
    
    
    
    
    
    
    }           
    

