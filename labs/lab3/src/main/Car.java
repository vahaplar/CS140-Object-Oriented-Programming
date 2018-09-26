public class Car {

	private double gasInTank;
	private double fuelEfficiency;
	public static final double FUEL_CAPACITY = 20;

	//Constructors
	public Car(){ 
		this.gasInTank = 0;
		this.fuelEfficiency = 50;
	}

	public Car(double fuelEfficiency){
		this.gasInTank = 0;
		this.fuelEfficiency = fuelEfficiency;
	}
	
	//Getters
	public double getGasInTank(){
		System.out.print("Fuel level: ");
		return this.gasInTank;
	}

	//Methods
	public void drive(double distance){
		System.out.println("Attempting to drive. . . . .");
		double gasNeeded = distance / this.fuelEfficiency;
		
		if(this.gasInTank < gasNeeded){
			
			System.out.println("You may run out of fuel.");
			
		}else{
			
			System.out.println("Wroom Wroom!");
			this.gasInTank -= gasNeeded;
			
		}
		
	}
	
	public void addFuel(double amount){
		System.out.println("Adding fuel. . . . .");
		if (this.gasInTank + amount > FUEL_CAPACITY){
			
			System.out.println("You have reached maximum fuel capacity of 20!");
			this.gasInTank = 20;
			
		}else{
			
			this.gasInTank += amount;
			
		}
		
	}
}
