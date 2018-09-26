import java.util.Scanner;

public class DeckTester {
	
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in); //Scanner created
		Player player = new Player("Mr.Vahaplar");
		
		System.out.println("Welcome to the poker table, "+player.getName());
		System.out.println("Your initial bankroll is: "+player.getBankroll());
		player.playHand();
		
		System.out.println("\nDeckTester Begins! Enter any key to continue: ");
		
		String choice = input.next();
		Deck test = new Deck();
		
		test.printDeck();
		test.shuffle();
		test.printDeck();
		
	}
}