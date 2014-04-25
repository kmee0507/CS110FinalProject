import java.util.ArrayList;
import javax.swing.*;
public class PlayerHands
{
   final int HANDSIZE = 26;
   private ArrayList<ImageIcon> player1 = new ArrayList<ImageIcon>();
   private ArrayList<ImageIcon> player2 = new ArrayList<ImageIcon>();
   
   public PlayerHands()
   {
      //DeckOfCards deck = new DeckOfCards();
      //deck.shuffle();
      CardFile c = new CardFile();
      for(int i = 0; i<HANDSIZE;i++)
      {
         
         player1.add(c.dealImage());
      }
      
      for(int i = 0; i<HANDSIZE;i++)
      {
         
         player2.add(c.dealImage());
      }

   }
   public int sizeOfPlayer1Hand()
   {
      return player1.size();
   }
   
   public int sizeOfPlayer2Hand()
   {
      return player2.size();
   }
   public ArrayList<ImageIcon> getPlayer1Hand()
   {
      return player1;
   }
   
   public ArrayList<ImageIcon> getPlayer2Hand()
   {
      return player2;
   }
   
   public void DisplayPlayer1Hand()
   {
      for (ImageIcon names : player1)
         System.out.println(names);
   }
   
   public void DisplayPlayer2Hand()
   {
      for (ImageIcon names : player2)
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