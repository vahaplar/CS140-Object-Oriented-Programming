public class Card {
	
	private int suit;
	private int value; //Cards will have suit and values.
	
	public Card (int suit, int value){
		
		this.suit=suit;
		this.value=value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public int getSuit(){
		return this.suit;
	}
}