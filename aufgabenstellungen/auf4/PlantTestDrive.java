public class PlantTestDrive {
	public static void main(String[] args) {
		// Aufgabe 1
		Plant plant1 = new Plant();
		/*
		System.out.println(plant1.height); // Erwartung: 0.0
		System.out.println(plant1.type); // Erwartung: null
		System.out.println(plant1.waterLevel); // Erwartung: 0
		
		double localHeight = 20;
		System.out.println(localHeight); // Erwartung: error
		
		plant1.height = 10.69;
		plant1.type = "Bees plant";
		plant1.waterLevel = 3;
		
		System.out.println(plant1.height);
		System.out.println(plant1.type);
		System.out.println(plant1.waterLevel);
		
		plant1.grow(10);
		System.out.println(plant1.height); // Erwartung: 15.69
		plant1.grow(60);
		System.out.println(plant1.height); // Erwartung: 15.69 + 60 * 0.5 = 45.69
		plant1.grow(122);
		System.out.println(plant1.height); // Erwartung: 45.69 + 122 * 0.5 = 106.69
		plant1.grow(50);
		System.out.println(plant1.height); // Erwartung: 106.69 + 50 * 0.5 = 131.69
		
		// Aufgabe 2
		int waterAmount = 2;
		plant1.water(waterAmount); // Erwartung: amount = 0
		
		System.out.println(waterAmount); // Erwartung: waterAmount = 2 denn die Methode macht nur eine Kopie vom Wert
		
		short smallAmount = 2;
		
		
		//1. Wird kompiliert.
		//2. Wird nicht kompiliert, da kein Wert in der Methode.
		//3. Wird nicht kompiliert, da zu viele Argumente in der Methode.
		//4. Wird nicht kompiliert, da Typ nicht übereinstimmt (double vs. int).
		//5. Wird kompiliert, da short --> int Konvertierung funktioniert (short ist kleiner als int).
		
		
		// plant1.water(2); // funktioniert
		// plant1.water(); // Fehler, kein Argument
		// plant1.water(2, 3); // Fehler, zu viele Argumente
		// plant1.water(2.0); // error: incompatible types: possible lossy conversion from double to int
		// plant1.water(smallAmount); // funktioniert
		
		//plant1.waterLevel = 4;
		//plant1.waterLevel = 5;
		//plant1.waterLevel = 6;
		//System.out.println(plant1.needsWater());
		
		if (plant1.needsWater()) {
			plant1.water(3);
		}
		System.out.println(plant1.waterLevel);
		*/
		/*
		// Aufgabe 3
		plant1.getHeight();
		plant1.setHeight(6.0);
		System.out.println(plant1.getHeight());
		
		plant1.getType();
		plant1.setType("Orchid");
		System.out.println(plant1.getType());
		
		plant1.getWaterLevel();
		plant1.setWaterLevel(5);
		System.out.println(plant1.getWaterLevel());
		
		// water() Test
		plant1.water(4);
		System.out.println(plant1.getWaterLevel());
		
		//grow() Test
		plant1.grow(-1);
		System.out.println(plant1.getHeight());
		
		plant1.grow(1);
		System.out.println(plant1.getHeight());
		*/
		// Aufgabe 4
		double height1 = 1.0;
		double height2 = 1.0;
		
		System.out.println(height1 == height2);
		
		Plant plant2 = new Plant();
		Plant plant3 = new Plant();
		
		plant2.setHeight(1.0);
		plant2.setType("Cactus");
		plant2.setWaterLevel(3);

		plant3.setHeight(1.0);
		plant3.setType("Cactus");
		plant3.setWaterLevel(3);
		
		System.out.println(plant2 == plant3); // false da es die Speicheradressen bzw. Referenzen vergleicht
		
		Plant plant4 = plant2;
		System.out.println(plant2 == plant4);
		
		plant4.water(3);
		
		plant3.setType("Palm Tree");
		System.out.println(plant2.getType().equals(plant3.getType()));
	}
}