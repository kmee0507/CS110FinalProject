import java.util.ArrayList;
import java.util.Random;

public class DeckOfCards
{
   final int CARDS = 52; 
   ArrayList<Card> deck;
   
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
   public Card dealCard()
   {
      Card c = deck.remove(0);
      return c;
   }  
   
   public boolean isEmpty()
   {
      return (deck.size() ==0);
   }
   
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