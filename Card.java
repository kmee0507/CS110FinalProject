public class Card
{
   public final static int SPADES = 0, CLUBS = 1, DIAMONDS = 2, HEARTS = 3;
   public final static int ACE = 14, KING = 13, QUEEN = 12, JACK = 11; 
   
   private int suit, rank;
   
   public Card()
   {
      suit = 0;
      rank = Card.ACE;
   }
   public Card(int s, int r)
   {
      suit = s;
      rank = r;
   }   
   
   public int getSuit()
   {
      return suit;
   }
   
   public int getRank()
   {
      return rank;
   }
   
   public String getSuitString()
   {
      switch (suit)
      {
         case SPADES: return "SPADES";
         case CLUBS: return "CLUBS";
         case DIAMONDS: return "DIAMONDS";
         case HEARTS: return "HEARTS";
         default: return "Invalid";
      }
        
   }
   
   
   public String getRankString()
   {
      switch (rank)
      {
         
         case 2: return "2";
         case 3: return "3";
         case 4: return "4";
         case 5: return "5";
         case 6: return "6";
         case 7: return "7";
         case 8: return "8";
         case 9: return "9";
         case 10: return "10";
         case 11: return "JACK";
         case 12: return "QUEEN";
         case 13: return "KING";
         case 14: return "ACE";
         default: return "JOKER";
         
      }
   }
   public String toString()
   {
      return getRankString() + " of " + getSuitString();
   }
   
   public boolean equals(Card c)
   {
      if (rank == c.rank)
         return true;
      else
         return false;
   }


}