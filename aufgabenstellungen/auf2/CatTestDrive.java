 public class CatTestDrive {
	
	public static void main(String[] args) {
		
		Cat myCat1 = new Cat();
		Cat myCat2 = new Cat();

		myCat1.name = "Rufus";
		myCat1.age = 3;
		myCat1.colour = "Orange";

		myCat2.name = "Joe";
		myCat2.age = 5;
		myCat2.colour = "Black";

		System.out.println("Diese Katze heißt " + myCat1.name + ", ist " + myCat1.age + " Jahre alt und hat die Farbe " + myCat1.colour + ".");
		System.out.println("Diese Katze heißt " + myCat2.name + ", ist " + myCat2.age + " Jahre alt und hat die Farbe " + myCat2.colour + ".");

		myCat2.name = "Joel";

		System.out.println("Diese Katze heißt jetzt " + myCat2.name + ", ist " + myCat2.age + " Jahre alt und hat die Farbe " + myCat2.colour + ".");

		myCat1.meow();
		myCat2.meow();

	}
 }
