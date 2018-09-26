public class Kilometer extends Distance {

	protected static final double MULTIPLIER = 1000;
	
	public Kilometer(double distance) {
		
		super(distance, MULTIPLIER);
		
	}
	
	public static Kilometer sum(Distance d1, Distance d2){
		
		return new Kilometer((d1.getUniversalDistance() + d2.getUniversalDistance()) / MULTIPLIER);
		
	}
	
	public static Kilometer compare(Distance d1, Distance d2){
		
		double result = (d1.getUniversalDistance() - d2.getUniversalDistance()) / MULTIPLIER; 
		
		result *= (result < 0) ? -1 : 1;
		
		return new Kilometer(result);
						
	}


}