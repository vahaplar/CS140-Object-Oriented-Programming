public class DistanceTester {
	
	public static void main(String[] args){
		
		Meter m = new Meter(1);
		
		System.out.println(m.getDistance()+" meters equals "+m.convertToMeters().getDistance()+" meters");
		
		System.out.println(m.getDistance()+" meters equals "+m.convertToKilometers().getDistance()+" kilometers");
		
		System.out.println(m.getDistance()+" meters equals "+m.convertToInches().getDistance()+" inch");
		
		System.out.println(m.getDistance()+" meters equals "+m.convertToMiles().getDistance()+" miles");
		
		System.out.println(m.getDistance()+" meters equals "+m.convertToFeet().getDistance()+" feet");
		
		System.out.println(m.getDistance()+" meters equals "+m.convertToYards().getDistance()+" yards");

		
		Kilometer km = new Kilometer(-1);
		
		Inch i = new Inch(0);
		
		Mile mi = new Mile(8);
		
		
		System.out.println(mi.getDistance()+" miles equals "+mi.convertToYards().getDistance()+" yards");
		
		
		System.out.println("1 Meter + 1 Mile is " + Inch.sum(new Meter(1), new Mile(1)).getDistance() + " Inches" );
		System.out.println("1 Inch + 1 Kilometer is " + Mile.sum(new Inch(1), new Kilometer(1)).getDistance() + " Miles" );
		System.out.println("1 Foot + 1 Kilometer is " + Meter.sum(new Foot(1), new Kilometer(1)).getDistance() + " Meters" );
		System.out.println("1 Yard + 1 Mile is " + Kilometer.sum(new Yard(1), new Mile(1)) .getDistance() + " Kilometer" );
		System.out.println("1 Inch + 1 Foot is " + Yard.sum(new Inch(1), new Foot(1)).getDistance() + " Yards" );
		System.out.println("The difference between 1 Meter and 1 Inch is " + Foot.compare(new Meter(1), new Inch(1)).getDistance() + " Feet" );
		System.out.println("The difference between 1 Mile and 1 Kilometer is " + Yard.compare(new Mile(1), new Kilometer(1)).getDistance() + " Yards" );
		System.out.println("The difference between 1 Foot and 1 Yard is " + Inch.compare(new Foot(1), new Yard(1)).getDistance() + " Inches" );
		System.out.println("The difference between 1 Inch and 1 Mile is " + Mile.compare(new Inch(1), new Mile(1)).getDistance() + " Miles" );
		System.out.println("The difference between 1 Yard and 1 Inch is " + Meter.compare(new Yard(1), new Inch(1)).getDistance() + " Meter" );
		System.out.println("The difference between 1 Kilometer and 1 Kilometer is " + Kilometer.compare(new Kilometer(1), new Kilometer(1)).getDistance() + " Kilometers" );
		
	}
	
}
