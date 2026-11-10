import java.util.*;

public class CFTD2 {
	
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Geben Sie Ihren Vornamen ein: ");
		String firstName = inputScanner.nextLine();
		System.out.println("Geben Sie Ihr Alter ein: ");
		int alter = inputScanner.nextInt();
		
		if (firstName.trim().isEmpty()) {
			throw new IllegalArgumentException("Geben Sie einen gültigen Namen ein.");
		} else if (alter != (int)alter) {
			throw new IllegalArgumentException("Geben Sie eine ganze Zahl als Alter ein.");
		}
		
		
		Person MyPerson = new Person();
		
		MyPerson.age = alter;
		MyPerson.name = firstName;
		
		MyPerson.greet();
		MyPerson.tellAge();
		
		inputScanner.close();
	}
}