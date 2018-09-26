public class CashRegister { 
	
	//This class will get payment as coins, with the help of an array, and again return the change as an array.
	
	private double purchase;
	private double payment;
	
	public void purchase(double amount){
		this.purchase = amount;
	}
	
	public void receivePayment(Coin[] coins){
		for(int i = 0 ; i < coins.length ; i++){
			if(coins[i] != null)
				payment += coins[i].getValue(); //Receives and adds the coin values we defined in tester class (as an array).
		}
	}
	
	public Coin[] giveChange(){
		
		double giveBack = payment - purchase; //Our total change
		
		Coin[] change = new Coin[20]; //Array of change coins
				
		int x = 0;
		
		for(int i = Coin.coinTypes.length - 1; i >= 0 ; i--){
			
			double currentValue = Coin.coinTypes[i]; //We set a pre-defined coin value as a current value (Highest first)
			
			while(giveBack >= currentValue){ //While we have more change than this value...
				change[x] = new Coin(currentValue); // Program gives us the highest coin possible...
				giveBack -= currentValue; // And subtracts this value from our total change.
				x++; // Next slot in the array of change coins							
			}
		}

		return change;
		}
	
	
	//Getters will provide us the values, that we going to print on the screen in tester class.
	
	public double getPurchase(){
		
		return purchase;
		
	}
	
	public double getPayment(){
		
		return payment;
		
	}
}