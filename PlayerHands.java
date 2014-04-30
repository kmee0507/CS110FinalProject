import java.util.ArrayList;
import javax.swing.*;
/**
   The PlayerHands class deals each player 26 cards that are of the
   ImageIcon type.  It has methods to get how many cards each player has
*/
public class PlayerHands
{
   final int HANDSIZE = 26;
   private ArrayList<ImageIcon> player1 = new ArrayList<ImageIcon>();
   private ArrayList<ImageIcon> player2 = new ArrayList<ImageIcon>();
   
   /**
      The default constructor deals each player 26 cards alternating each time
   */
   public PlayerHands()
   {
      
      CardFile c = new CardFile();
      for(int i = 0; i<HANDSIZE;i++)
      {
         
         player1.add(c.dealImage());
         player2.add(c.dealImage());
      }
      
   }
   
   /**
      The getPlayer1Hand method returns the players hand
      @return an ArrayList with type ImageIcon
   */
   public ArrayList<ImageIcon> getPlayer1Hand()
   {
      return player1;
   }
   
   /**
      The getPlayer2Hand method returns the players hand
      @return an ArrayList with type ImageIcon
   */
   public ArrayList<ImageIcon> getPlayer2Hand()
   {
      return player2;
   }
   
   

}