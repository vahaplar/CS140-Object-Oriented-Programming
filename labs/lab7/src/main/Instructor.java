public class Instructor extends Person {
	
	private int salary;
	
	public Instructor(String name, int salary) {
		
		super(name);
		this.salary = salary;
	
	}
	
	public String toString(){
		
		return super.getName() + " - " + this.salary;
		
	}
}
