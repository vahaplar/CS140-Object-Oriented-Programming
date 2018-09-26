public class PersonTester {

	public static void main(String[] args){
		
		Person[] person = new Person[6];
		person[0] = new Instructor("Yusuf", 150000);
		person[1] = new Student("Tolgahan", "Computer Science");
		person[2] = new Student("Ali", "Computer Science");
		person[3] = new Student("Ahmet", "Computer Science");
		person[4] = new Student("Hasan", "Computer Science");
		person[5] = new Student("Osman", "Computer Science");		
		
		printClass(person);
		
		}
	
	public static void printClass(Person person[]){
		
		for(int i=0;i<6;i++){
			
			System.out.println(person[i]);
			
		}	
	}
}