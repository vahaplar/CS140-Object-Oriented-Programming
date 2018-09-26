public class ComboLock {

	private int[] combo;
	private int[] attempt;
	private int position; //Symbolizes the value current position of lock.
	private int attemptCount=0; //Counter for filling attempt array.
	
	public ComboLock(int secret1, int secret2, int secret3){
	
		combo = new int[3]; //Lock's combo, filled by random values in Tester class.
		attempt = new int[3]; // User's attempt values, filled by user inputs.
		
		combo[0] = secret1;
		combo[1] = secret2;
		combo[2] = secret3;
		
	}
	
	public void turnLeft(int ticks){ //Ticks one by one to the left side by the tick number.
		
		for(int i=0; i<ticks; i++){
			this.position += 1; //You turn your lock Left (positive) side.
		}
		
		this.position -= 50; // Since you complete a turn, your value will be bigger than 50. Program subtracts it.
		
		if(this.position>0){
			attempt[attemptCount] = this.position; //Your position is now an element of your attempt array.
			attemptCount++;
			System.out.println("Current position is: "+ this.position);
		}
		
		else{
			System.out.println("You have to complete a turn in your lock..."); 
		} //You need to complete one turn to the left, in order to unlock the lock. Else it won't open.
	}
		
	public void turnRight(int ticks){ //Ticks one by one to the right side by the tick number.
		
		if(ticks <= 50){
			for(int i=0; i<ticks; i++){ 
				this.position -= 1; //You turn your lock to the right (negative) side.
			}
			
			if(this.position < 0){
				this.position = 50 + this.position; // Program calculates your exact position by adding 50.
			}

			attempt[attemptCount]=this.position; //Your position is now an element of your attempt array.
			attemptCount++;
			System.out.println("Current position is: "+ this.position);
		}
		
		else{
			System.out.println("You turn your lock more than one turn!");
			} // You can't turn your lock more than one turn, else it won't open.
		
	}

	public void reset(){ //Resets current position
		
		this.position=0;
		this.attemptCount=0;
	}
	
	public boolean open(){
		
		int status = 0; //Status counter
		
		for(int i=0;i<3;i++){
			
			if(combo[i] == attempt[i]){ //if all values are equal to each other
				status++;
			}
		}
		
		return status == 3; //Return true.
	
	}
}
