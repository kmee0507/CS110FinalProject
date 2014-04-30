import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WarGame extends JFrame 
{
   final int HANDSIZE = 52;
   private ArrayList<ImageIcon> player1 = new ArrayList<ImageIcon>();
   private ArrayList<ImageIcon> player2 = new ArrayList<ImageIcon>();
   private JLabel label1, label2, player1Card, player2Card, player1CardCount, player2CardCount, nullLabel1, nullLabel2, nullLabel3, nullLabel4;
   private JPanel panel1, panel2;
   private JButton flipButton, quitButton; 
   private ImageIcon p1, p2;
   
   public WarGame()
   {
      final int WINDOW_WIDTH = 1000;
      final int WINDOW_HEIGHT = 700;
      PlayerHands p = new PlayerHands();
      
      player1 = p.getPlayer1Hand();
      player2 = p.getPlayer2Hand();
      
      setTitle("WAR GAME");
      
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);  
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JLabel label1 = new JLabel("Press to Flip Cards");
      JLabel label2 = new JLabel("Press to Quit & End Game");
      
      setLayout(new GridLayout(2,4));
      
      
      
      ImageIcon im = new ImageIcon("back.jpg");
      player1Card = new JLabel(im);
      player2Card = new JLabel(im);
      
      
      
      flipButton = new JButton("Flip");
      player1CardCount = new JLabel("Player 1 Cards Remaining: " + player1.size());
      flipButton.addActionListener(new FlipButtonListener());
      panel1 = new JPanel();
      panel1.add(label1);
      panel1.add(flipButton);
      panel1.add(player1CardCount);
      
      
      quitButton = new JButton("Quit");
      quitButton.addActionListener(new QuitButtonListener());
      panel2 = new JPanel();
      player2CardCount = new JLabel("Player 2 Cards Remaining: "+ player2.size());
      panel2.add(label2);
      panel2.add(quitButton);
      panel2.add(player2CardCount);
      
      nullLabel1 = new JLabel();
      nullLabel2 = new JLabel();
      nullLabel3 = new JLabel();
      nullLabel4 = new JLabel();
      panel1.setBackground(Color.GREEN);
      panel2.setBackground(Color.GREEN);
      player1Card.setBackground(Color.CYAN); 
      player1Card.setOpaque(true); 
      player2Card.setBackground(Color.CYAN);
      player2Card.setOpaque(true);
      nullLabel1.setBackground(Color.CYAN);
      nullLabel1.setOpaque(true);
      nullLabel2.setBackground(Color.CYAN);
      nullLabel2.setOpaque(true);
      nullLabel3.setBackground(Color.CYAN);
      nullLabel3.setOpaque(true);
      nullLabel4.setBackground(Color.CYAN);
      nullLabel4.setOpaque(true);
      
      add(panel1);
      add(player1Card);
      add(nullLabel1);
      add(nullLabel2);
      add(panel2);
      add(player2Card);
      add(nullLabel3);
      add(nullLabel4);
      
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
         try{
            nullLabel1.setIcon(null);
            nullLabel2.setIcon(null);
            nullLabel3.setIcon(null);
            nullLabel4.setIcon(null);
            
            p1 = player1.get(0);
            p2 = player2.get(0);
            
            String string1 = p1.getDescription();
            String string2 = p2.getDescription();
            int sub1 = 0;
            int sub2 = 0;
            while (sub1 == 0)
            {
            if (string1.startsWith("2"))
               sub1 = 2;
            else if(string1.startsWith("3"))
               sub1 = 3;
            else if(string1.startsWith("4"))
               sub1 = 4;
            else if(string1.startsWith("5"))
               sub1 = 5;
            else if(string1.startsWith("6"))
               sub1 = 6;
            else if(string1.startsWith("7"))
               sub1 = 7;
            else if(string1.startsWith("8"))
               sub1 = 8;
            else if(string1.startsWith("9"))
               sub1 = 9;
            else if(string1.startsWith("10"))
               sub1 = 10;
            else if(string1.startsWith("jack"))
               sub1 = 11;
            else if(string1.startsWith("queen"))
               sub1 = 12;
            else if(string1.startsWith("king"))
               sub1 = 13;
            else if(string1.startsWith("ace"))
               sub1 = 14;
            }
            
            while (sub2 == 0)
            {
            if (string2.startsWith("2"))
               sub2 = 2;
            else if(string2.startsWith("3"))
               sub2 = 3;
            else if(string2.startsWith("4"))
               sub2 = 4;
            else if(string2.startsWith("5"))
               sub2 = 5;
            else if(string2.startsWith("6"))
               sub2 = 6;
            else if(string2.startsWith("7"))
               sub2 = 7;
            else if(string2.startsWith("8"))
               sub2 = 8;
            else if(string2.startsWith("9"))
               sub2 = 9;
            else if(string2.startsWith("10"))
               sub2 = 10;
            else if(string2.startsWith("jack"))
               sub2 = 11;
            else if(string2.startsWith("queen"))
               sub2 = 12;
            else if(string2.startsWith("king"))
               sub2 = 13;
            else if(string2.startsWith("ace"))
               sub2 = 14;
            }
             
            
            player1Card.setIcon(player1.remove(0));
            
            player2Card.setIcon(player2.remove(0));
            
            player1CardCount.setText("Player 1 Cards Remaining: " + player1.size());
            
            player2CardCount.setText("Player 2 Cards Remaining: " + player2.size());
            
            
            if(sub1 > sub2)
            {
               player1.add(p1);
               player1.add(p2);
               
               player1CardCount.setText("Player 1 Cards Remaining: " + player1.size() + " \nWINNER!");
               player2CardCount.setText("Player 2 Cards Remaining: " + player2.size());
               
               
               
            }
            else if(sub2 > sub1)
            {
               player2.add(p1);
               player2.add(p2);
               
               player1CardCount.setText("Player 1 Cards Remaining: " + player1.size());
               player2CardCount.setText("Player 2 Cards Remaining: " + player2.size() + " \nWINNER!");
        
            }
            
            else if(sub1 == sub2)
            {
             War();  
            }
            if(player1.size() == 0)
            {
               JOptionPane.showMessageDialog(null, "Player 2 wins!!!");
            }
            else if(player2.size() == 0)
               JOptionPane.showMessageDialog(null, "Player 1 wins!!!");
          }
       catch(RuntimeException m)
       {
         JOptionPane.showMessageDialog(null, "There are no cards left to flip");
       }
   
      }
   }
   
   public void War()
   {
      ImageIcon back1 = player1.remove(0);
               if(player1.size() == 0)
                  JOptionPane.showMessageDialog(null, "Player 2 wins!!!");
               ImageIcon back2 = player2.remove(0);
               if(player2.size() == 0)
                  JOptionPane.showMessageDialog(null, "Player 1 wins!!!");
               ImageIcon back3 = player1.remove(0);
               if(player1.size() == 0)
                  JOptionPane.showMessageDialog(null, "Player 2 wins!!!");
               ImageIcon back4 = player2.remove(0);
               if(player2.size() == 0)
                  JOptionPane.showMessageDialog(null, "Player 1 wins!!!");
               nullLabel2.setIcon(back3);
               nullLabel4.setIcon(back4);
               
               ImageIcon im = new ImageIcon("back.jpg");
               nullLabel1.setIcon(im);
               nullLabel3.setIcon(im);
               
               String ss1 = back3.getDescription();
               String ss2 = back4.getDescription();
               
               int i = 0;
               int ii = 0;
               
               while (i == 0)
               {
                  if (ss1.startsWith("2"))
                     i = 2;
                  else if(ss1.startsWith("3"))
                     i = 3;
                  else if(ss1.startsWith("4"))
                     i = 4;
                  else if(ss1.startsWith("5"))
                     i = 5;
                  else if(ss1.startsWith("6"))
                     i = 6;
                  else if(ss1.startsWith("7"))
                     i = 7;
                  else if(ss1.startsWith("8"))
                     i = 8;
                  else if(ss1.startsWith("9"))
                     i = 9;
                  else if(ss1.startsWith("10"))
                     i = 10;
                  else if(ss1.startsWith("jack"))
                     i = 11;
                  else if(ss1.startsWith("queen"))
                     i = 12;
                  else if(ss1.startsWith("king"))
                     i = 13;
                  else if(ss1.startsWith("ace"))
                     i = 14;
               }
            
               while (ii == 0)
               {
                  if (ss2.startsWith("2"))
                     ii = 2;
                  else if(ss2.startsWith("3"))
                     ii = 3;
                  else if(ss2.startsWith("4"))
                     ii = 4;
                  else if(ss2.startsWith("5"))
                     ii = 5;
                  else if(ss2.startsWith("6"))
                     ii = 6;
                  else if(ss2.startsWith("7"))
                     ii = 7;
                  else if(ss2.startsWith("8"))
                     ii = 8;
                  else if(ss2.startsWith("9"))
                     ii = 9;
                  else if(ss2.startsWith("10"))
                     ii = 10;
                  else if(ss2.startsWith("jack"))
                     ii = 11;
                  else if(ss2.startsWith("queen"))
                     ii = 12;
                  else if(ss2.startsWith("king"))
                     ii = 13;
                  else if(ss2.startsWith("ace"))
                     ii = 14;
                }
            
            if(i > ii)
            {
               player1.add(p1);
               player1.add(p2);
               player1.add(back1);
               player1.add(back2);
               player1.add(back3);
               player1.add(back4);
               
               player1CardCount.setText("Player 1 Cards Remaining: " + player1.size() + " \nWINNER!");
               player2CardCount.setText("player 2 Cards Remaining: " + player2.size());
               
               
               
            }
            else if(ii > i)
            {
               player2.add(p1);
               player2.add(p2);
               player2.add(back1);
               player2.add(back2);
               player2.add(back3);
               player2.add(back4);
               
               player1CardCount.setText("Player 1 Cards Remaining: " + player1.size());
               player2CardCount.setText("Player 2 Cards Remaining: " + player2.size() + " \nWINNER!");
        
            }
            else if (ii == i)
            {
               player1.add(p1);
               player2.add(p2);
               player1.add(back1);
               player2.add(back2);
               player1.add(back3);
               player2.add(back4); 
               
               player1CardCount.setText("Player 1 Cards Remaining: " + player1.size());
               player2CardCount.setText("Player 2 Cards Remaining: " + player2.size()); 

            }
               
               
               
            }   
   

   
   
   
}
      
      