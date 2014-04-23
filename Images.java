import javax.swing.*;
import java.awt.*;

public class Images extends JFrame
{
   private JPanel panel;
   public Images()
   {
      setTitle("Picture Tester");
   
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
      setLayout(new BorderLayout());
      
      ImageIcon image = new ImageIcon("10c.jpg");
   
      JLabel j = new JLabel(image);
      panel = new JPanel();
      panel.add(j);
      add(panel);
      
      pack();
      setVisible(true);
   }
   public static void main(String[] args)
   {
      new Images();
   }
   
   
   
   
     
   

}