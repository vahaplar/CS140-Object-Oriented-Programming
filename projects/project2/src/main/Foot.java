public class Foot extends Distance {

	protected static final double MULTIPLIER = 0.3048;
	
	public Foot(double distance) {
		
		super(distance, MULTIPLIER);
		
	}
	
	public static Foot sum(Distance d1, Distance d2){
		
		return new Foot((d1.getUniversalDistance() + d2.getUniversalDistance()) / MULTIPLIER);
		
	}
	
	public static Foot compare(Distance d1, Distance d2){
		
		double result = (d1.getUniversalDistance() - d2.getUniversalDistance()) / MULTIPLIER; 
		
		result *= (result < 0) ? -1 : 1;
		
		return new Foot(result);
						
	}
	
}