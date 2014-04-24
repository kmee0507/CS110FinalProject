import java.util.ArrayList;

public class PlayerHands
{
   final int HANDSIZE = 26;
   private ArrayList<Card> player1 = new ArrayList<Card>();
   private ArrayList<Card> player2 = new ArrayList<Card>();
   
   public PlayerHands()
   {
      DeckOfCards deck = new DeckOfCards();
      deck.shuffle();
      for(int i = 0; i<HANDSIZE;i++)
      {
         player1.add(deck.dealCard());
      }
      
      for(int i = 0; i<HANDSIZE;i++)
      {
         player2.add(deck.dealCard());
      }

   }
   
   public ArrayList<Card> getPlayer1Hand()
   {
      return player1;
   }
   
   public ArrayList<Card> getPlayer2Hand()
   {
      return player2;
   }
   
   public void DisplayPlayer1Hand()
   {
      for (Card names : player1)
         System.out.println(names);
   }
   
   public void DisplayPlayer2Hand()
   {
      for (Card names : player2)
         System.out.println(names);
   }    
   public static void main(String[] args)
   {
      PlayerHands p = new PlayerHands();
      p.DisplayPlayer1Hand();
      System.out.println("\n\n\n\n");
      p.DisplayPlayer2Hand();
      
   }

}