import java.util.Random;

public class LotteryPicker{
	
	public static void main(String[] args){
		

		System.out.println("Play this combination - it'll make you rich!");
		Random luckynumber = new Random();
		
		for(int i = 0; i < 6; i++){
			
			System.out.println(luckynumber.nextInt(49) + 1);
			
		}
		
	}	
	
}