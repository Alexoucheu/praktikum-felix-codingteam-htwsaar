 public class PersonTestDrive {
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		Person person2 = new Person();

		person1.name = "Markus";
		person1.age = 35;

		person2.name = "Jane";
		person2.age = 58;

		person1.greet();
		person2.greet();

		person2.name = "Joel";

		person1.greet();
		person2.greet();


	}
 }
