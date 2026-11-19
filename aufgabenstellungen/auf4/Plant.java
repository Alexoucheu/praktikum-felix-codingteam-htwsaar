public class Plant {
	private double height;
	private String type;
	private int waterLevel;	
	/*
	double height;
	String type;
	int waterLevel;
	*/
	
	//Getters and Setters
	
	//heigth
	double getHeight() {
		return height;
	}
	void setHeight(double height) {
		if (height >= 0) {
			this.height = height;
		} else {
			System.out.println("Error: height must be positive.");
		}
	}
	
	//type
	String getType() {
		return type;
	}
	void setType(String type) {
		this.type = type;
	}
	
	//waterLevel
	int getWaterLevel() {
		return waterLevel;
	}
	void setWaterLevel(int waterLevel) {
		if(waterLevel >= 0 && waterLevel <= 10) {
			this.waterLevel = waterLevel;
		} else {
			System.out.println("Error: waterLevel must be between 0 and 10!!!");
		}
	}
	
	
	void grow(int sunLightHours) {
		if (sunLightHours >= 0) {
			height = height + (0.5 * sunLightHours);
		} else {
			System.out.println("Error: sunLightHours must be positive.");
		}
	}
	
	void water(int amount) {
		if (amount >= 0 && (waterLevel + amount) <= 10) {
			waterLevel += amount;
		} else {
			System.out.println("Error: waterLevel must be positive and <= 10");
		}
	}
	
	boolean needsWater() {
		if (waterLevel < 5) {
			return true;
		} else {
			return false;
		}
	}
}