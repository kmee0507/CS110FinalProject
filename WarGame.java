import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WarGame extends JFrame 
{
   final int HANDSIZE = 52;
   private ArrayList<ImageIcon> player1 = new ArrayList<ImageIcon>();
   private ArrayList<ImageIcon> player2 = new ArrayList<ImageIcon>();
   private JLabel label1, label2, player1Card, player2Card, player1CardCount, player2CardCount;
   private JPanel panel1, panel2;
   private JButton flipButton, quitButton;
   
   public WarGame()
   {
      final int WINDOW_WIDTH = 500;
      final int WINDOW_HEIGHT = 700;
      PlayerHands p = new PlayerHands();
      
      player1 = p.getPlayer1Hand();
      player2 = p.getPlayer2Hand();
      
      setTitle("WAR");
      
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);  
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JLabel label1 = new JLabel("Press to flip Cards");
      JLabel label2 = new JLabel("Press to quit & end game");
      
      setLayout(new GridLayout(2,3));
      
      
      
      ImageIcon im = new ImageIcon("back.jpg");
      player1Card = new JLabel(im);
      player2Card = new JLabel(im);
      
      flipButton = new JButton("Flip");
      flipButton.addActionListener(new FlipButtonListener());
      panel1 = new JPanel();
      panel1.add(label1);
      panel1.add(flipButton);
      
      
      quitButton = new JButton("quit");
      quitButton.addActionListener(new QuitButtonListener());
      panel2 = new JPanel();
      panel2.add(label2);
      panel2.add(quitButton);
      
      player1CardCount = new JLabel("Cards Remaining " + player1.size());
      
      player2CardCount = new JLabel("Cards Remaining "+ player2.size());
      add(panel1);
      add(player1Card);
      add(player1CardCount);
      add(panel2);
      add(player2Card);
      add(player2CardCount);
      
      setVisible(true);
      
   }
   
   
   private class QuitButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);

      }
   }
   
   private class FlipButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         
         player1Card.setIcon(player1.remove(0));
         
         player2Card.setIcon(player2.remove(0));
         
         player1CardCount.setText("Cards Remaining " + player1.size());
         
         player2CardCount.setText("Cards Remaining " + player2.size());

      }
   }

   
   public static void main(String[] args)
   {
      new WarGame();
   }
   
}
      
      //Card p1 = new Card();
      //Card p2 = new Card();
      
      
      // Scanner keyboard = new Scanner(System.in);
//       System.out.print("Would you like to begin (y/n): ");
//       choice = keyboard.nextLine();
//       
//       while (choice.equalsIgnoreCase("y") && player1.size() > 0 && player2.size() >0)
//       {
//          p1 = player1.remove(0);
//          p2 = player2.remove(0); 
//          System.out.println("Player 1: " + p1.toString());
//          System.out.println("Player 2: " + p2.toString());
//          if(p1.getRank()>p2.getRank())
//          {
//             player1.add(p1);
//             player1.add(p2);
//             System.out.print("Flip again (y/n): ");
//             choice = keyboard.nextLine();
//          }
//          
//          else if(p1.getRank()<p2.getRank())
//          {
//             player2.add(p2);
//             player2.add(p1);
//             
//             System.out.print("Flip again (y/n): ");
//             choice = keyboard.nextLine();
//          }
//          else if(p1.getRank()==p2.getRank())
//          {
//             Card p1WarCard = new Card();
//             Card p2WarCard = new Card();
//             p1WarCard = player1.remove(0);
//             p2WarCard = player2.remove(0);
//             System.out.print("War Flip (y/n): ");
//             choice = keyboard.nextLine();
//             while(choice.equalsIgnoreCase("y")&&p1==p2)
//             {
//                p1 = player1.remove(0);
//                p2 = player2.remove(0);
//                
//                System.out.println("Player 1: " + p1.toString());
//                System.out.println("Player 2: " + p2.toString());
//                if(p1.getRank()>p2.getRank())
//                {
//                   player1.add(p1WarCard);
//                   player1.add(p2WarCard);
//                   player1.add(p1);
//                   player1.add(p2);
//                   System.out.print("Flip again (y/n): ");
//                   choice = keyboard.nextLine();
//                }
//          
//                 else if(p1.getRank()<p2.getRank())
//                 {
//                   player2.add(p1WarCard);
//                   player2.add(p2WarCard);
//                   player2.add(p2);
//                   player2.add(p1);
//             
//                   System.out.print("Flip again (y/n): ");
//                   choice = keyboard.nextLine();
//                 }
// 
//             }
//               
//          }
//       }
//       
//       
//       if(player1.size() > player2.size())
//          System.out.println("Player 1 wins!");
//       else if(player2.size() > player1.size())
//          System.out.println("Player 2 wins!");
//       else
//          System.out.println("Its a tie!");
//    }
//    
//    public static void main(String[] args)
//    {
//       WarGame g = new WarGame();
//    }
// 
// }