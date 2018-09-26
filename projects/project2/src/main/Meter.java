public class Meter extends Distance {

	protected static final double MULTIPLIER = 1;
	
	public Meter(double distance) {
		
		super(distance, MULTIPLIER);
		
	}
	
	public static Meter sum(Distance d1, Distance d2){
		
		return new Meter((d1.getUniversalDistance() + d2.getUniversalDistance()) / MULTIPLIER);
		
	}
	
	public static Meter compare(Distance d1, Distance d2){
		
		double result = (d1.getUniversalDistance() - d2.getUniversalDistance()) / MULTIPLIER; 
		
		result *= (result < 0) ? -1 : 1;
		
		return new Meter(result);
						
	}

}