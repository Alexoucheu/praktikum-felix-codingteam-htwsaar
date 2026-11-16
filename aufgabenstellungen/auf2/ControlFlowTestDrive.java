import java.util.*;

public class ControlFlowTestDrive {
	
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Geben Sie Ihren Vornamen ein: ");
		String firstName = inputScanner.nextLine().trim();  /*.trim() hier und nicht mit dem if um gleich den richtige Format zu setzen (damit er formatiert aussieht, wenn der Name 'geprint' wird).*/
		
		if (firstName.isEmpty()) {
			System.out.println("Fehler. Bitte geben Sie einen gültigen Namen ein.");
		} else {
			/*
			for (int i = 0; i < 3; i++) {
				System.out.println("Hallo " + firstName + "!");
			}
			*/
			
			int cnt = 0;
			while (cnt < 3) {
				System.out.println("Hallo " + firstName + "!");
				cnt++;
			}
		}
		
		Person MyPerson = new Person();
		
		MyPerson.age = 20;
		MyPerson.name = "Albert";
		
		MyPerson.greet();
		
		inputScanner.close();
	}
}
