public class CarTester{
	
	public static Car myCar;
	
    public static void main (String[] args){
        
		myCar = new Car(50);
		System.out.println("TestAll() begins with normal values:");
		TestAll();
    }
	
	public static void TestAddFuel(int x){
	myCar.addFuel(x);	
	}
	
	public static void TestgetGasInTank(){
	myCar.getGasInTank();	
	}
	
	public static void TestDrive(int x){
	myCar.drive(x);		
	}
	
	
	public static void TestAll(){
		
		TestAddFuel(20);
        TestDrive (1);
        System.out.println(myCar.getGasInTank());
		System.out.println("TestAll() begins with experimental values:");
		TestAddFuel(21);
        TestDrive (10000);
        System.out.println(myCar.getGasInTank());
	}
}