import java.util.ArrayList;
import java.util.Scanner;

public class WarGame
{
   final int HANDSIZE = 52;
   private ArrayList<Card> player1 = new ArrayList<Card>();
   private ArrayList<Card> player2 = new ArrayList<Card>();
   private String choice;
   public WarGame()
   {
      PlayerHands p = new PlayerHands();
      
      player1 = p.getPlayer1Hand();
      player2 = p.getPlayer2Hand();
      
      Card p1 = new Card();
      Card p2 = new Card();
      
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Would you like to begin (y/n): ");
      choice = keyboard.nextLine();
      
      while (choice.equalsIgnoreCase("y") && player1.size() > 0 && player2.size() >0)
      {
         p1 = player1.remove(0);
         p2 = player2.remove(0); 
         System.out.println("Player 1: " + p1.toString());
         System.out.println("Player 2: " + p2.toString());
         if(p1.getRank()>p2.getRank())
         {
            player1.add(p1);
            player1.add(p2);
            System.out.print("Flip again (y/n): ");
            choice = keyboard.nextLine();
         }
         
         else if(p1.getRank()<p2.getRank())
         {
            player2.add(p2);
            player2.add(p1);
            
            System.out.print("Flip again (y/n): ");
            choice = keyboard.nextLine();
         }
         else if(p1.getRank()==p2.getRank())
         {
            Card p1WarCard = new Card();
            Card p2WarCard = new Card();
            p1WarCard = player1.remove(0);
            p2WarCard = player2.remove(0);
            System.out.print("War Flip (y/n): ");
            choice = keyboard.nextLine();
            while(choice.equalsIgnoreCase("y")&&p1==p2)
            {
               p1 = player1.remove(0);
               p2 = player2.remove(0);
               
               System.out.println("Player 1: " + p1.toString());
               System.out.println("Player 2: " + p2.toString());
               if(p1.getRank()>p2.getRank())
               {
                  player1.add(p1WarCard);
                  player1.add(p2WarCard);
                  player1.add(p1);
                  player1.add(p2);
                  System.out.print("Flip again (y/n): ");
                  choice = keyboard.nextLine();
               }
         
                else if(p1.getRank()<p2.getRank())
                {
                  player2.add(p1WarCard);
                  player2.add(p2WarCard);
                  player2.add(p2);
                  player2.add(p1);
            
                  System.out.print("Flip again (y/n): ");
                  choice = keyboard.nextLine();
                }

            }
              
         }
      }
      
      
      if(player1.size() > player2.size())
         System.out.println("Player 1 wins!");
      else if(player2.size() > player1.size())
         System.out.println("Player 2 wins!");
      else
         System.out.println("Its a tie!");
   }
   
   public static void main(String[] args)
   {
      WarGame g = new WarGame();
   }

}