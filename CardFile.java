import java.util.ArrayList;
import javax.swing.*;
public class CardFile 
{
   final int HANDSIZE = 52;
   private ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
   private Card c;
   private ImageIcon im;
   public CardFile()
   {
      DeckOfCards d = new DeckOfCards();
      
      d.shuffle();
      
      for(int i = 0; i<HANDSIZE;i++)
      {
         c = d.dealCard();
         if(c.getRank() == 2 && c.getSuit() == 0)
         {
            ImageIcon im  = new ImageIcon("2s.jpg");
            images.add(im);
         }
         else if(c.getRank() == 2 && c.getSuit() == 1)
         {
            ImageIcon im  = new ImageIcon("2c.jpg");
            images.add(im);
         }
         else if(c.getRank() == 2 && c.getSuit() == 2)
         {
            ImageIcon im  = new ImageIcon("2d.jpg");
            images.add(im);
         }
         else if(c.getRank() == 2 && c.getSuit() == 3)
         {
            ImageIcon im  = new ImageIcon("2h.jpg");
            images.add(im);
         }
         else if(c.getRank() == 3 && c.getSuit() == 0)
         {
            ImageIcon im  = new ImageIcon("3s.jpg");
            images.add(im);
         }
         else if(c.getRank() == 3 && c.getSuit() == 1)
         {
            ImageIcon im  = new ImageIcon("3c.jpg");
            images.add(im);
         }
         else if(c.getRank() == 3 && c.getSuit() == 2)
         {
            ImageIcon im  = new ImageIcon("3d.jpg");
            images.add(im);
         }
         else if(c.getRank() == 3 && c.getSuit() == 3)
         {
            ImageIcon im  = new ImageIcon("3h.jpg");
            images.add(im);
         }
         else if(c.getRank() == 4 && c.getSuit() == 0)
         {
            ImageIcon im  = new ImageIcon("4s.jpg");
            images.add(im);
         }
         else if(c.getRank() == 4 && c.getSuit() == 1)
         {
            ImageIcon im  = new ImageIcon("4c.jpg");
            images.add(im);
         }
         else if(c.getRank() == 4 && c.getSuit() == 2)
         {
            ImageIcon im  = new ImageIcon("4d.jpg");
            images.add(im);
         }
         else if(c.getRank() == 4 && c.getSuit() == 3)
         {
            ImageIcon im  = new ImageIcon("4h.jpg");
            images.add(im);
         }
         else if(c.getRank() == 5 && c.getSuit() == 0)
         {
            ImageIcon im  = new ImageIcon("5s.jpg");
            images.add(im);
         }
         else if(c.getRank() == 5 && c.getSuit() == 1)
         {
            ImageIcon im  = new ImageIcon("5c.jpg");
            images.add(im);
         }
         else if(c.getRank() == 5 && c.getSuit() == 2)
         {
            ImageIcon im  = new ImageIcon("5d.jpg");
            images.add(im);
         }
         else if(c.getRank() == 5 && c.getSuit() == 3)
         {
            ImageIcon im  = new ImageIcon("5h.jpg");
            images.add(im);
         }
         else if(c.getRank() == 6 && c.getSuit() == 0)
         {
            ImageIcon im  = new ImageIcon("6s.jpg");
            images.add(im);
         }
         else if(c.getRank() == 6 && c.getSuit() == 1)
         {
            ImageIcon im  = new ImageIcon("6c.jpg");
            images.add(im);
         }
         else if(c.getRank() == 6 && c.getSuit() == 2)
         {
            ImageIcon im  = new ImageIcon("6d.jpg");
            images.add(im);
         }
         else if(c.getRank() == 6 && c.getSuit() == 3)
         {
            ImageIcon im  = new ImageIcon("6h.jpg");
            images.add(im);
         }
         else if(c.getRank() == 7 && c.getSuit() == 0)
         {
            ImageIcon im  = new ImageIcon("7s.jpg");
            images.add(im);
         }
         else if(c.getRank() == 7 && c.getSuit() == 1)
         {
            ImageIcon im  = new ImageIcon("7c.jpg");
            images.add(im);
         }
         else if(c.getRank() == 7 && c.getSuit() == 2)
         {
            ImageIcon im  = new ImageIcon("7d.jpg");
            images.add(im);
         }
         else if(c.getRank() == 7 && c.getSuit() == 3)
         {
            ImageIcon im  = new ImageIcon("7h.jpg");
            images.add(im);
         }
         else if(c.getRank() == 8 && c.getSuit() == 0)
         {
            ImageIcon im  = new ImageIcon("8s.jpg");
            images.add(im);
         }
         else if(c.getRank() == 8 && c.getSuit() == 1)
         {
            ImageIcon im  = new ImageIcon("8c.jpg");
            images.add(im);
         }
         else if(c.getRank() == 8 && c.getSuit() == 2)
         {
            ImageIcon im  = new ImageIcon("8d.jpg");
            images.add(im);
         }
         else if(c.getRank() == 8 && c.getSuit() == 3)
         {
            ImageIcon im  = new ImageIcon("8h.jpg");
            images.add(im);
         }
         else if(c.getRank() == 9 && c.getSuit() == 0)
         {
            ImageIcon im  = new ImageIcon("9s.jpg");
            images.add(im);
         }
         else if(c.getRank() == 9 && c.getSuit() == 1)
         {
            ImageIcon im  = new ImageIcon("9c.jpg");
            images.add(im);
         }
         else if(c.getRank() == 9 && c.getSuit() == 2)
         {
            ImageIcon im  = new ImageIcon("9d.jpg");
            images.add(im);
         }
         else if(c.getRank() == 9 && c.getSuit() == 3)
         {
            ImageIcon im  = new ImageIcon("9h.jpg");
            images.add(im);
         }
         else if(c.getRank() == 10 && c.getSuit() == 0)
         {
            ImageIcon im  = new ImageIcon("10s.jpg");
            images.add(im);
         }
         else if(c.getRank() == 10 && c.getSuit() == 1)
         {
            ImageIcon im  = new ImageIcon("10c.jpg");
            images.add(im);
         }
         else if(c.getRank() == 10 && c.getSuit() == 2)
         {
            ImageIcon im  = new ImageIcon("10d.jpg");
            images.add(im);
         }
         else if(c.getRank() == 10 && c.getSuit() == 3)
         {
            ImageIcon im  = new ImageIcon("10h.jpg");
            images.add(im);
         }
         else if(c.getRank() == 11 && c.getSuit() == 0)
         {
            ImageIcon im  = new ImageIcon("jacks.jpg");
            images.add(im);
         }
         else if(c.getRank() == 11 && c.getSuit() == 1)
         {
            ImageIcon im  = new ImageIcon("jackc.jpg");
            images.add(im);
         }
         else if(c.getRank() == 11 && c.getSuit() == 2)
         {
            ImageIcon im  = new ImageIcon("jackd.jpg");
            images.add(im);
         }
         else if(c.getRank() == 11 && c.getSuit() == 3)
         {
            ImageIcon im  = new ImageIcon("jackh.jpg");
            images.add(im);
         }
         else if(c.getRank() == 12 && c.getSuit() == 0)
         {
            ImageIcon im  = new ImageIcon("queens.jpg");
            images.add(im);
         }
         else if(c.getRank() == 12 && c.getSuit() == 1)
         {
            ImageIcon im  = new ImageIcon("queenc.jpg");
            images.add(im);
         }
         else if(c.getRank() == 12 && c.getSuit() == 2)
         {
            ImageIcon im  = new ImageIcon("queend.jpg");
            images.add(im);
         }
         else if(c.getRank() == 12 && c.getSuit() == 3)
         {
            ImageIcon im  = new ImageIcon("queenh.jpg");
            images.add(im);
         }
         else if(c.getRank() == 13 && c.getSuit() == 0)
         {
            ImageIcon im  = new ImageIcon("kings.jpg");
            images.add(im);
         }
         else if(c.getRank() == 13 && c.getSuit() == 1)
         {
            ImageIcon im  = new ImageIcon("kingc.jpg");
            images.add(im);
         }
         else if(c.getRank() == 13 && c.getSuit() == 2)
         {
            ImageIcon im  = new ImageIcon("kingd.jpg");
            images.add(im);
         }
         else if(c.getRank() == 13 && c.getSuit() == 3)
         {
            ImageIcon im  = new ImageIcon("kingh.jpg");
            images.add(im);
         }
         else if(c.getRank() == 14 && c.getSuit() == 0)
         {
            ImageIcon im  = new ImageIcon("aces.jpg");
            images.add(im);
         }
         else if(c.getRank() == 14 && c.getSuit() == 1)
         {
            ImageIcon im  = new ImageIcon("acec.jpg");
            images.add(im);
         }
         else if(c.getRank() == 14 && c.getSuit() == 2)
         {
            ImageIcon im  = new ImageIcon("aced.jpg");
            images.add(im);
         }
         else if(c.getRank() == 14 && c.getSuit() == 3)
         {
            ImageIcon im  = new ImageIcon("aceh.jpg");
            images.add(im);
         }
         else
            System.out.println("error");
         
   
      }
      
      
     }
     
     public void DisplayCards()
     {
         for(ImageIcon names : images)
            System.out.println(names);
     }
     public ImageIcon dealImage()
     {
         return images.remove(0);
     }
      public static void main(String[] args)
      {
         CardFile c = new CardFile();
         c.DisplayCards();
      }
   
}