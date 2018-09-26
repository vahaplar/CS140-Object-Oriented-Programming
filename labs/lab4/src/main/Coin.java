public class Coin{
	
	private double value;
	public final static double[] coinTypes = new double[]{0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1, 2}; //Coin types defined
	
	public Coin(double value){
		
		boolean coinCheck = false;
		
		System.out.println("Coin Entered: " + value);
		
		for(int i = 0; i < coinTypes.length; i++){ //In the coinTypes array...
			
			
			if(coinTypes[i] == value){ //...if we can find the value we entered...
				
				this.value = value;
				coinCheck = true; //...coin is valid.
			}
		}
		
		if(!coinCheck){	//If not...
			
			System.out.println("Coin type not found. Value set to default: 1.00"); //...invalid coin entered.
			this.value = 1; //Default value.
		}
	}
	
	public double getValue(){
		return this.value;
	}
	
}