import java.util.ArrayList;
import java.util.Random;

/**
   The DeckOfCards class simulates a 52 card deck with shuffle and deal 
   methods
*/
public class DeckOfCards
{
   final int CARDS = 52; 
   ArrayList<Card> deck;
   
   /**
      The default constructor puts 52 cards into the deck in order
   */
   public DeckOfCards()
   {
      deck = new ArrayList<Card>();
      
      for (int r = 2; r<=Card.ACE;r++)
      {
         for (int s=Card.SPADES;s<=Card.HEARTS;s++)
         {
           deck.add(new Card(s,r));
         }
      }
   }
   
   /**
      The dealCard method deals the top card from the deck and returns it
      @return a Card object
   */
   public Card dealCard()
   {
      Card c = deck.remove(0);
      return c;
   }  
   
   /**  
      The isEmpty method returns either true or false if the deck is empty
      @return a boolean value
   */
   public boolean isEmpty()
   {
      return (deck.size() ==0);
   }
   
   /**
      The shuffle method shuffles the deck in a random order
   */
   public void shuffle()
   {
      int randNum;
      Card temp;
      Random r = new Random();
      for (int i = 0; i < deck.size(); i++)
      {
         randNum = r.nextInt(deck.size());
         temp = deck.get(i);
         deck.set(i,deck.get(randNum));
         deck.set(randNum,temp);
      }      
   }
      
   public static void main(String[] args)
   {
      DeckOfCards d = new DeckOfCards();
      d.shuffle();
      display(d);
      
      
   }
   
   public static void display(DeckOfCards d)
   {
      int i = 0;
      while (!(d.isEmpty()))
      {
         System.out.println(i++ +" : " + d.dealCard().toString()); 
      }
   }


}