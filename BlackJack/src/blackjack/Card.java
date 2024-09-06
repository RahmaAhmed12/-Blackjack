/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

/**
 *
 * @author DELL
 */
public class Card {
    private final  int suit;
     private final int rank;
     private final int value;
    
    public Card(int suit , int rank ,int value )
    {
        this.suit= suit ;
        this.rank =rank ;
        this.value =value;
    }

   public Card ( Card car){
       this.suit=car.suit;
       this.rank =car.rank;
       this .value =car.value;
   }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }

   
    
   
}

