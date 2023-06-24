import java.util.ArrayList; // import the ArrayList class
import java.util.Random;
import java.util.HashSet; // import the HashMap class

class Deck {

    private static final double PRICE=234.90;
    private static final int DeckUpperBound = 6 ;


    public static String fCard(int iRandomCard, int iRandomSuit, int iRandomDeck, String sCard ) {
       //Integer iRandomSuit = 0 ; 
       String sSuit = "";
       String sFaceCard = ""; 
       //Integer iRandomCard = 0;
       //Integer iRandomDeck = 0; 
       String sCardMU = ""; 
       //String sCard = ""; 

               if (iRandomSuit == 0) 
                  sSuit = "C";
                  // (char)'\u2663'
               if (iRandomSuit == 1) 
                  sSuit = (char)'\u2660' +""; //"S";
               if (iRandomSuit == 2) 
                  sSuit = "H";
		  // (char)'\u2764'
               if (iRandomSuit == 3) 
                  sSuit = "D";
                  // (char)'\u2666'

                sFaceCard = "" + iRandomCard;
                if (iRandomCard == 0)
			sFaceCard = "J";
                if (iRandomCard == 1)
			sFaceCard = "A";
                if (iRandomCard == 11)
			sFaceCard = "Q";
                if (iRandomCard == 12)
			sFaceCard = "K";
        	sCard   = sCard + sFaceCard + " " + sSuit + " d=" + iRandomDeck + "";
                sCardMU = sCard ; 

		return( sCard );
 
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
      int iRandomCard   = rand.nextInt(upperbound); 
      int iRandomSuit  = rand2.nextInt(4); 
      int iRandomDeck = randDeck.nextInt(DeckUpperBound); 
      String sCard = "";
      String sCardMU = "";
      String sSuit = "";
      String sFaceCard = "";
 
		if (iRandomCard <= 9 || iRandomCard >= 11) {
			sCard = " " ;
		}

                sCardMU = fCard( iRandomCard, iRandomSuit,  iRandomDeck, sCard ) ; 
                sCard = sCardMU ;

	/* https://stackoverflow.com/questions/21654581/trying-to-get-a-hand-of-cards-to-display-suit-symbol */
      	/* Collision ? ToDo replace duplicate (2x) code with singular function, called in two locations */
      while (hashDeckOfCards.contains(sCard)) {
                System.out.println("duplicate card j=" + j + " sCard=" + sCard);

	        iRandomCard  = rand.nextInt(upperbound); 
      	        iRandomSuit = rand2.nextInt(4); 
                iRandomDeck = randDeck.nextInt(DeckUpperBound); 

		sCard = "";
		if (iRandomCard <= 9 || iRandomCard >= 11) {
			sCard = " " ;
		}


                sCardMU  = fCard( iRandomCard, iRandomSuit,  iRandomDeck, sCard )  ; 
                sCard = sCardMU ; 
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
