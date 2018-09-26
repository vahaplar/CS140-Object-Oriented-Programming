public class Distance {
	
	private double universalDistance;
	private double multiplier;
	
	protected Distance(double distance , double multiplier){
		
		if(distance < 0){
			
			System.out.println("Distance is a Scalar quantity. Values smaller than 0 are invalid.");
						
		}
		
		else if(distance == 0){
			System.out.println("You tried to enter/convert the value '0'. Distance '0' is always zero.");
			
			this.universalDistance = 0;
			this.multiplier = multiplier;
			
		}
		
		else{
			this.universalDistance = distance * multiplier;
			this.multiplier = multiplier;
		}
	}

	public Inch convertToInches(){
		
		return new Inch (this.universalDistance / Inch.MULTIPLIER);
				
	}
	
	public Foot convertToFeet(){
		
		return new Foot (this.universalDistance / Foot.MULTIPLIER);
		
	}
	
	public Yard convertToYards(){
		
		return new Yard (this.universalDistance / Yard.MULTIPLIER);
		
	}
	
	public Mile convertToMiles(){

		return new Mile(this.universalDistance / Mile.MULTIPLIER);
		
	}
	
	public Meter convertToMeters(){

		return new Meter (this.universalDistance / Meter.MULTIPLIER);
		
	}
	
	public Kilometer convertToKilometers(){

		return new Kilometer(this.universalDistance / Kilometer.MULTIPLIER);
		
	}
	
	public double getDistance(){
		return this.universalDistance / multiplier;
	}
	
	public double getUniversalDistance(){
		return this.universalDistance;
	}
	
}
