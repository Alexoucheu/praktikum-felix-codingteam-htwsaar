public class DataTypesTestDrive {
	public static void main (String[] args) {
		int year = 2026;
		Dog myDog1 = new Dog();
		myDog1.size = 20;
		myDog1.breed = "Labrador";
		myDog1.name  = "Yupla";
		Dog myDog2 = myDog1;
		
		myDog1.bark(); // Erwartung: "Yupla barks: Ruff! Ruff!"
		myDog1.name = "Karl";
		myDog2.bark(); // Erwartung: "Karl barks: Ruff! Ruff!"
		// Erwartung = Ergebnis
		
		myDog2 = new Dog();
		myDog2.name = "Rex";
		
		myDog1.bark(); // Erwartung: "Karl barks: Ruff! Ruff!"
		myDog2.bark(); // Erwartung: "Rex barks: Ruff! Ruff!"
		// Erwartung = Ergebnis
		
		
		int num1 = 10;
		int num2 = num1;
		num1 = 30;
		System.out.println("num1 = " + num1 + " num2 = " + num2);
		// Erwartung: num1 = 30 und num2 = 10.
	
		String string1 = "10";
		String string2 = string1;
		string1 = "30";
		System.out.println("string1 = " + string1 + " string2 = " + string2);
	
	}
}