public class Stopwatch {
	
	private boolean isRunning;
	private long startTime;
	private long stopTime;
	
	public Stopwatch(){
		
		isRunning = false;
		startTime = 0;
		stopTime = 0;
	}
	
	public void start() throws IllegalStateException{
		
		if(isRunning)
			throw new IllegalStateException("Already running...");
		isRunning = true;
		startTime = System.nanoTime();
		stopTime = 0;
	}
	
	public void stop() throws IllegalStateException{
	
	if(!isRunning)
		throw new IllegalStateException("Not Running");
		
		isRunning = false;
		stopTime = System.nanoTime();
		
	}
	
	public String toString(){
	
		if(startTime >= stopTime)
			return "0";
		
		return Long.toString(stopTime - startTime);
	}
}
