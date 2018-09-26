public class Inch extends Distance {

	protected static final double MULTIPLIER = 0.0254;
	
	public Inch(double distance) {
		
		super(distance, MULTIPLIER);
		
	}
	
	public static Inch sum(Distance d1, Distance d2){
		
		return new Inch((d1.getUniversalDistance() + d2.getUniversalDistance()) / MULTIPLIER);
		
	}
	
	public static Inch compare(Distance d1, Distance d2){
		
		double result = (d1.getUniversalDistance() - d2.getUniversalDistance()) / MULTIPLIER; 
		
		result *= (result < 0) ? -1 : 1;
		
		return new Inch(result);
						
	}


}