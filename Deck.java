import java.util.ArrayList; // import the ArrayList class
import java.util.Random;
import java.util.HashSet; // import the HashMap class

class Deck {

    private static final double PRICE=234.90;
    private static final int DeckUpperBound = 6 ;


    public static String fCard(String sInput) {
       Integer int_random2 = 0 ; 
       String sSuit = "";
       String sFaceCard = ""; 
       Integer int_random = 0;
       Integer int_randDeck = 0; 
       String sCardMU = ""; 
       String sCard = ""; 

               if (int_random2 == 0) 
                  sSuit = "C";
               if (int_random2 == 1) 
                  sSuit = (char)'\u2660' +""; //"S";
               if (int_random2 == 2) 
                  sSuit = "H";
               if (int_random2 == 3) 
                  sSuit = "D";

                sFaceCard = "" + int_random;
                if (int_random == 0)
			sFaceCard = "J";
                if (int_random == 1)
			sFaceCard = "A";
                if (int_random == 11)
			sFaceCard = "Q";
                if (int_random == 12)
			sFaceCard = "K";
        	sCard   = sCard + sFaceCard + " " + sSuit + " d=" + int_randDeck + "";
                sCardMU = sCard ; 

		return("");
 
    }

    public static void main(String[] args) {


	ArrayList<String> deckOfCards   = new ArrayList<String>(); // Create an ArrayList object

	HashSet<String> hashDeckOfCards = new HashSet<String>();

  	Random rand     = new Random(); 
        Random rand2    = new Random(); 
	Random randDeck = new Random(); 

//for (int iDeck =5 ; iDeck<5 ;iDeck++) {
for (int j =0 ; j<(52 *DeckUpperBound) ; j++) {
      // Setting the upper bound to generate the
      // random numbers in specific range
      int upperbound     = 13; // Generating random values from 0 - 12 
       
      // using nextInt()
      int int_random   = rand.nextInt(upperbound); 
      int int_random2  = rand2.nextInt(4); 
      int int_randDeck = randDeck.nextInt(DeckUpperBound); 
      String sCard = "";
      String sCardMU = "";
      String sSuit = "";
      String sFaceCard = "";
 
		if (int_random <= 9 || int_random >= 11) {
			sCard = " " ;
		}

               if (int_random2 == 0) 
                  sSuit = "C";
               if (int_random2 == 1) 
                  sSuit = (char)'\u2660' + "" ; //"S";
               if (int_random2 == 2) 
                  sSuit = "H";
               if (int_random2 == 3) 
                  sSuit = "D";

                sFaceCard = "" + int_random;
                if (int_random == 0)
			sFaceCard = "J";
                if (int_random == 1)
			sFaceCard = "A";
                if (int_random == 11)
			sFaceCard = "Q";
                if (int_random == 12)
			sFaceCard = "K";
        	sCard   = sCard + sFaceCard + " " + sSuit + " d=" + int_randDeck + "";
                sCardMU = sCard ; 

/* https://stackoverflow.com/questions/21654581/trying-to-get-a-hand-of-cards-to-display-suit-symbol */
      /* Collision ? ToDo replace duplicate (2x) code with singular function, called in two locations */
      while (hashDeckOfCards.contains(sCard)) {
                System.out.println("duplicate card j=" + j + " sCard=" + sCard);

	        int_random  = rand.nextInt(upperbound); 
      	        int_random2 = rand2.nextInt(4); 
                int_randDeck = randDeck.nextInt(DeckUpperBound); 

		sCard = "";
		if (int_random <= 9 || int_random >= 11) {
			sCard = " " ;
		}

               if (int_random2 == 0) 
                  sSuit = "C";
               if (int_random2 == 1) 
                  sSuit = (char)'\u2660' +""; //"S";
               if (int_random2 == 2) 
                  sSuit = "H";
               if (int_random2 == 3) 
                  sSuit = "D";

                sFaceCard = "" + int_random;
                if (int_random == 0)
			sFaceCard = "J";
                if (int_random == 1)
			sFaceCard = "A";
                if (int_random == 11)
			sFaceCard = "Q";
                if (int_random == 12)
			sFaceCard = "K";
        	sCard   = sCard + sFaceCard + " " + sSuit + " d=" + int_randDeck + "";
                sCardMU = sCard ; 
	}

	deckOfCards.add(sCardMU);
	hashDeckOfCards.add(sCard);	
}
    for (int i = 0; i < deckOfCards.size() ; i++) {
      System.out.println(deckOfCards.get(i));
    }

    System.out.println("deckOfCards.size() [ArrayList] =" + deckOfCards.size() );


    System.out.println("hashDeckOfCards.size() [HashSet] =" + hashDeckOfCards.size() );

    System.out.println(hashDeckOfCards);


    } /* Main */



} /* Class */

//}