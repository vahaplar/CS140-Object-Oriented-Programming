public class PermutationCounter {

	private int n;
	
	public PermutationCounter(int numberOfItems){
		n = numberOfItems;
	}

	// Recursive Count getter.
	
	public long getRecursiveCount(){
		
		if(n == 0){
			return 1;
		}
		
		else{
			
			return n * new PermutationCounter(n-1).getRecursiveCount();
			
		}	
	}
	
	// Iterative Count getter.
	
	public long getIterativeCount(){
		
		long result = 1;
		
		if(n == 0){
			
			return 1;
			
		}
		
		else{
			
			for(int i = n; i >=0 ; i--){
				
				result *= i;
				
			}
		
			return result;
	
		}
	}
}