/** 	Murach, J. ( 2011).  Murachs Java Programming, Training and Reference, 
		4th Edition, Fresno, CA: Mike Murach & Associates, Inc.
        Modifications by W. Bowers, 2013
        Additional modifications by J. Claessens, 2013
        using Fisher-Yates shuffle algorithm
*/


import java.util.*;

public class CardDeckApp
{
    public static String [] suits = {"H","C","D","S"};;
    public static String[] cards = new String[52];
    public static String[][] hands = new String[4][5];
    
    public static void main(String[] args)
    {
        loadCardArray();
        System.out.println("  Suits are as follows -> H - Hearts  C - Clubs D - Diamonds S - Spades");
        System.out.println("  Card values          -> Ace = 1     Jack = 11 Queen = 12   King = 13\n");
        System.out.println("  New Deck of Cards\n");
        printCardArray();
        System.out.println("");
        shuffleCards(cards);
        System.out.println("  Shuffled Deck of Cards\n");
        printCardArray();
        dealCards();
        System.out.println("\n  Dealing Player's Hands\n");
        showCards();
        System.out.println("");
        
    }//end of main
    
    public static void loadCardArray()
    {
        for(int a = 0; a < 13; a++)
            {
                cards[a] = suits[0] + (a+1);
            }
        for(int b = 13; b < 26; b++)
            {
                cards[b] = suits[1] + (b-12);
            }
        for(int c = 26; c < 39; c++)
            {
                cards[c] = suits[2] + (c-25);
            }
        for(int d = 39; d < 52; d++)
            {
                cards[d] = suits[3] + (d-38);
            }
    }//end of loadCardArray
    
    public static void printCardArray()
    {   
        int x = 0;
        for (int i = 0; i < suits.length; i++)
        {
            for(int j = 0; j < 13; j++)
                {
                    System.out.printf("  %-3s", cards[x] );
                    x++;
                }System.out.println("");
        }
    }//end of printCardArray
    
    public static void shuffleCards(String[] shuf)
    {
        Random rnd = new Random();
            for (int i = shuf.length - 1; i > 0; i--)
            {
              int index = rnd.nextInt(i + 1);
           // randomly changes the values in Array cards   
              String a = shuf[index];
              shuf[index] = shuf[i];
              shuf[i] = a;
            }

    }//end of shuffleCards
    
    public static void dealCards()
    {
         int x = 0;
         for(int j = 0; j < 5; j++)
         {
            for (int i = 0; i < hands.length; i++)
            {   
                hands[i][j] = cards[x++];
            }
         }
    }//end of dealCards
    
    public static void showCards()
    {
        for (int i = 0; i < hands.length; i++) {
            System.out.printf("  Player %d ->  ", i + 1);
        for (int j = 0; j < hands[i].length; j++) 
        {
            System.out.printf("%-5s", hands[i][j]);
        }
        System.out.println();
            }
    }//end of showCards
    
}//end of CardDeckApp
