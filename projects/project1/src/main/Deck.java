import java.util.Arrays;
import java.util.Random;

public class Deck {

	private Card[] cards;
	
	public Deck(){
		
		cards = new Card[52]; //Deck
		
		int i=0;
		
		for(int suit=1; suit<=4; suit++){ //4 suits.
			for(int value=2; value<=14; value++){ //14 cards for each suit.
				cards[i] = new Card(suit, value);
				i++;
			}
		}
	}
	
	public void shuffle(){
			
		Card temp;
		Random randomValue = new Random();

		for (int i = 0; i < cards.length; i++) {

			int randomCard = randomValue.nextInt(cards.length); //Picks a random card from deck

			temp = cards[i];
			cards[i] = cards[randomCard]; //Puts it to the beginning of deck.
			cards[randomCard] = temp;
		} //At the end of this loop, we'll have a shuffled deck!
	}
	
	
	public Card drawCard(){
			
		Card nextCard = cards[cards.length - 1]; // Pick a card from deck
		cards = Arrays.copyOf(cards, cards.length - 1); // Creates a new deck, which doesn't include the card we draw.
		return nextCard;
	}
	
	public void printDeck(){
		
		System.out.println("\nSuits    | Values\n");		
		for(int i=0; i<52; i++){ 	
			System.out.println("Suits: "+cards[i].getSuit()+" , Values: "+cards[i].getValue());
		}
	}
}