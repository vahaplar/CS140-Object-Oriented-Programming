public class PermutationTester {
	
	public static void main (String[] args){
		
		Stopwatch stopwatch = new Stopwatch();
		
		PermutationCounter p = new PermutationCounter(10);
		stopwatch.start();
		p.getRecursiveCount();
		stopwatch.stop();
		System.out.println(10 + " recursively took: " + stopwatch);
		stopwatch.start();
		p.getIterativeCount();
		stopwatch.stop();
		System.out.println(10 + " iteratively took: " + stopwatch);
		
		p = new PermutationCounter(100);
		stopwatch.start();
		p.getRecursiveCount();
		stopwatch.stop();
		System.out.println(100 + " recursively took: " + stopwatch);
		stopwatch.start();
		p.getIterativeCount();
		stopwatch.stop();
		System.out.println(100 + " iteratively took: " + stopwatch);
		
		p = new PermutationCounter(1000);
		stopwatch.start();
		p.getRecursiveCount();
		stopwatch.stop();
		System.out.println(1000 + " recursively took: " + stopwatch);
		stopwatch.start();
		p.getIterativeCount();
		stopwatch.stop();
		System.out.println(1000 + " iteratively took: " + stopwatch);


		
	}
	
}
