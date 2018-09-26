public class CashRegisterTester {
	
	public static void main (String[] args){
		
		Coin[] coins = new Coin[20]; //Array for the coins we're going to use in our payment
		coins[0] = new Coin(2); //Coins
		coins[1] = new Coin(2);
		coins[2] = new Coin(1);
		coins[3] = new Coin(1);
		coins[4] = new Coin(1);
		coins[5] = new Coin(1);
		coins[6] = new Coin(26);
		coins[7] = new Coin(0.5);
		coins[8] = new Coin(0.5);		
		
		CashRegister cashReg = new CashRegister(); //New cash register
		
		cashReg.purchase(6.12); //Cost of our purchase
		cashReg.receivePayment(coins); //Simply an addition of the coin values we entered.
		
		System.out.println("Your purchase is: " + (cashReg.getPurchase()));
		System.out.println("Your payment is: " + (cashReg.getPayment()));
		System.out.println("Your change is: "+(cashReg.getPayment() - cashReg.getPurchase()));
		System.out.println("Coin box: ");
		
		Coin[] printChange = cashReg.giveChange(); //Our change array 
		
		for(int i=0; i < printChange.length; i++ ){ 
			if(printChange[i]!= null) //If there is any change...
				System.out.println(printChange[i].getValue()); //...print it!
		
		}
	}
}