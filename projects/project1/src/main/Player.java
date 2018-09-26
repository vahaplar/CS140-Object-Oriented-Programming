import java.util.Scanner;

public class Player {
	
	private String name;
	private int bankroll; //Player will have name and bankroll attributes.
	
	public Player (String name){
		
		this.name = name;
		this.bankroll = 1500; //Bankroll has a default value.
		
	}
	
	public int bet (int amount){
		
		this.bankroll -= amount; //Betting will decrease a particular amount of money from bankroll.
		return this.bankroll;
	
		
	}
	
	public void winnings(int amount){
		
		this.bankroll += amount*2; //Winning will return some money.

	}
	
	public void playHand(){
		
		Scanner input = new Scanner(System.in); //Scanner created
		
		HandCheck handCheck = new HandCheck(); //HandCheck created
		
		Deck deck = new Deck(); //Created a default deck...
		deck.shuffle(); //...and shuffled it.
		
		Card[] playerHand = new Card[5];
		Card[] computerHand = new Card[5]; //Computer and Player hands created.
		
		System.out.println("Here is your hand: ");
		
		for (int i=0; i<5; i++){
			
			playerHand[i] = deck.drawCard(); //Player draws a card.
			System.out.println("Suit: "+playerHand[i].getSuit()+" Value: "+playerHand[i].getValue()); //It's shown on the screen.
			computerHand[i] = deck.drawCard(); //Computer draws a card too.
		} //At the end of the loop, both players will have 5 cards.
		
		System.out.println("Hand Score: "+handCheck.check(playerHand));
		
		System.out.println("Would you like to redraw your hand? Type Yes: ");
		
		String choice = input.next();
		
		if(choice.equals("Yes")){
			
			System.out.println("Your new hand is: ");
			
			for (int i=0; i<5; i++){
				
				playerHand[i] = deck.drawCard(); //Same drawing process, just for player.
				System.out.println("Suit: "+playerHand[i].getSuit()+" Value: "+playerHand[i].getValue());
			}
		
		System.out.println("Hand Score: "+handCheck.check(playerHand));
		
		}
		
		System.out.println("Would you like to bet? Type Yes: ");
		
		choice = input.next(); 
		
		if(choice.equals("Yes")){
			
			System.out.println("How much do you want to bet? Type amount: ");	
		
			int betAmount = input.nextInt(); //Player will enter the bet amount.
			
			if(betAmount == this.bankroll){
				System.out.println("All in!"); // :)
			}
	
			this.bet(betAmount);			
			

			System.out.println("You trick the computer and take a quick glance on her hand: ");
			
			for (int i=0; i<5; i++){
			System.out.println("Suit: "+computerHand[i].getSuit()+" Value: "+computerHand[i].getValue());
			}
			
			System.out.println("Hand Score: "+handCheck.check(computerHand));
			
			System.out.println("Computer will decide whether redrawing or not. Enter any key to continue: ");
			choice = input.next();

						
			if(handCheck.check(computerHand) < 300){ // Computer redraws if she doesn't have a good hand.
				
				for (int i=0; i<5; i++){
					
					computerHand[i] = deck.drawCard();
				}
			}
			
			System.out.println("Here is computer's hand: ");
			for (int i=0; i<5; i++){ //Computer's final hand shown on screen.
				
				computerHand[i] = deck.drawCard();
				System.out.println("Suit: "+computerHand[i].getSuit()+" Value: "+computerHand[i].getValue());
			}
			System.out.println("Hand Score: "+handCheck.check(computerHand));
			
			if(handCheck.check(playerHand) < handCheck.check(computerHand)){
				
				System.out.println("Computer wins!"); //You already lost the money you bet.
				
			}
			
			else{
				
				System.out.println("Congratulations, you won!");
				
				this.winnings(betAmount); //You get your bet back, and win extra money, which is equal to your bet.
			}
		}
		
		if(this.bankroll>0){ //Here you'll decide if you want to continue.
			System.out.println("Your current bankroll is: "+this.bankroll);
			System.out.println("Would you like to continue playing? Type Yes: ");
		
			String decision = input.next();
		
			if(decision.equals("Yes")){
			
				this.playHand();
			}
			else{
				System.out.println("Goodbye!");
			}
		}
		else{ //Or if you lost all of your money, game will end.
			System.out.println("You lost all of your money...");
			
			System.out.println("Goodbye!");
			
		}
	}
	
	//Getters for your name and bankroll.
	
	public String getName(){
		
		return this.name;
		
	}
	
	public int getBankroll(){
		
		return this.bankroll;
		
	}
}
