import java.util.Random;
import java.util.Scanner;

public class ComboLockTester {
	
	public static void main (String[] args){
		
		Random randomValue = new Random();
		Scanner turnValue = new Scanner(System.in);
		
		int randomSecret1 = randomValue.nextInt(50); //RandomValues
		int randomSecret2 = randomValue.nextInt(50);
		int randomSecret3 = randomValue.nextInt(50);
		
		ComboLock combolock = new ComboLock(randomSecret1, randomSecret2, randomSecret3);
		
		while(true){ //Loops until user finds the right combination!
		
		System.out.println("Lock combination is: "+randomSecret1+", "+randomSecret2+", "+randomSecret3);
			
		System.out.println("Number of ticks to the right: "); //User inputs values!
		int value1 = turnValue.nextInt();
		combolock.turnRight(value1);
		System.out.println("Number of ticks to the left: ");
		int value2 = turnValue.nextInt();
		combolock.turnLeft(value2);
		System.out.println("Number of ticks to the right: ");
		int value3 = turnValue.nextInt();
		combolock.turnRight(value3);
		
			if(combolock.open()){ //Lock opened successfully...
				System.out.println("The lock is open!");
				break; //...loop ended!
			}
		
			else{ //It's still locked...
				System.out.println("Invalid combination, try again!");
				combolock.reset(); //Program resets position and attempt array counter, in order to start again.
				continue; //...loop continues.
			}
		}
	}
}
