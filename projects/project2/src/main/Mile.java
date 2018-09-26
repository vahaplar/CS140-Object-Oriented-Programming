public class Mile extends Distance {

	protected static final double MULTIPLIER = 1609.344;
	
	public Mile(double distance) {
		
		super(distance, MULTIPLIER);
		
	}
	
	public static Mile sum(Distance d1, Distance d2){
		
		return new Mile((d1.getUniversalDistance() + d2.getUniversalDistance()) / MULTIPLIER);
		
	}
	
	public static Mile compare(Distance d1, Distance d2){
		
		double result = (d1.getUniversalDistance() - d2.getUniversalDistance()) / MULTIPLIER; 
		
		result *= (result < 0) ? -1 : 1;
		
		return new Mile(result);
						
	}


}