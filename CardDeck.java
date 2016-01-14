/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.*;

/**
 *
 * @author Adriel Naidoo
 * 11 December 2015
 * Version 1.0
 * 
 * This class represents a Deck Blueprint that accepts a set of
 * cards and can be used for any card game.
 * 
 * Version History
 * Version 1.0- Initial Build
 */


public  class CardDeck
{
    // Adriel Naidoo - Represents a set of cards. Expects a list of type PlayingCard
    private List<PlayingCard> deck;
    
   /*
       Adriel Naidoo - Represents a card pointer that tracks the position of a card. When ever a card is
       drawn from the deck and thrown to the pile this variable tracks the logical
       card that follows for a user to draw next
    */ 
    private int cardPointer=0;
    
    
    
    // Adriel Naidoo - Constructor to initialize deck
    public CardDeck(List<PlayingCard> card)
    {
        this.deck=card;
        this.cardPointer=card.size();
       
    }
    
    // Adriel Naidoo - Add a card on top of deck
    public void addCard(PlayingCard card)
    {
        this.deck.add(card);  
        cardPointer++;
    }
    
    // Adriel Naidoo - Add many cards on top of deck
    public void addMultipleCard(List<PlayingCard> cardSet)
    {
       int numberOfCards = cardSet.size();
      
       for(int i=0; i<numberOfCards; i++)
       {
           this.deck.add(cardSet.get(i));
           cardPointer++;
       }
    }
    
    //Adriel Naidoo - Pick a card from top of deck
    public PlayingCard drawCard()
    {
        this.cardPointer--;
        return this.deck.get(this.cardPointer);       
    }
    
    // Adriel Naidoo - Get the total amount of cards currently in deck
    public int getDeckSize()
    {
        return this.deck.size();
    }
    
    //Adriel Naidoo - Performs a standard random card shuffle
    public void shuffleDeck()
    {
        Collections.shuffle(this.deck);
    }
}
