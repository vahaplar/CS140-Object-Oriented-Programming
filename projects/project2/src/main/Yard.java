public class Yard extends Distance {

	protected static final double MULTIPLIER = 0.9144;
	
	public Yard(double distance) {
		
		super(distance, MULTIPLIER);
		
	}
	
	public static Yard sum(Distance d1, Distance d2){
		
		return new Yard((d1.getUniversalDistance() + d2.getUniversalDistance()) / MULTIPLIER);
		
	}
	
	public static Yard compare(Distance d1, Distance d2){
		
		double result = (d1.getUniversalDistance() - d2.getUniversalDistance()) / MULTIPLIER; 
		
		result *= (result < 0) ? -1 : 1;
		
		return new Yard(result);
						
	}


}