/**
   The Card class has static variables to help rank the face cards and
   make it easier to determine suits of the cards.  It has a default and 
   alternate constructor and appropriate get methods
*/
public class Card
{
   public final static int SPADES = 0, CLUBS = 1, DIAMONDS = 2, HEARTS = 3;
   public final static int ACE = 14, KING = 13, QUEEN = 12, JACK = 11; 
   
   private int suit, rank;
   
   /**
      The default constructor sets a new Card to be the Ace of spades
   */
   public Card()
   {
      suit = 0;
      rank = Card.ACE;
   }
   
   /**
      The alternate constructor accepts two integers and sets them
      to suit and rank
      @param s an int for suit
      @param r an int for rank
   */
   public Card(int s, int r)
   {
      suit = s;
      rank = r;
   }   
   
   /**
      The getSuit method returns the suit of the card
      @return an integer suit
   */
   public int getSuit()
   {
      return suit;
   }
   
   /**
      The getRank method returns the rank of the Card
      @return an integer rank
   */ 
   public int getRank()
   {
      return rank;
   }
   
   /**
      The getSuitString method returns a string for the Suit
      @return a String
   */
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
   
   /**
      The getRankString method returns a rank as a string
      @return a String
   */
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
   /**
      The toString method returns a string containing suit and rank
      @return a String
   */
   public String toString()
   {
      return getRankString() + " of " + getSuitString();
   }
   
   /**
      The equals method accepts another Card and determines if the two are
      equal
      @param c a Card object
      @return a boolean value
   */
   public boolean equals(Card c)
   {
      if (rank == c.rank)
         return true;
      else
         return false;
   }


}