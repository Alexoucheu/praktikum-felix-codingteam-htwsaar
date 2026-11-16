public class DeclarationAssignmentTestDrive {
	public static void main (String[] args) {
		int age = 42;
		double pi = 3.1415;
		boolean isStudying = true;
		String greet = "Hello, World!";
		
		byte length = 100; // byte speichert Zahlen im Bereich -128 bis 127.
		float roundedPi = 3.14f; // float 32 Bit vs double 64 Bit.
		int oneMillion = 1_000_000; // _ trennt Zahlen für bessere Lesbarkeit. int speichert Zahlen im Bereich -2,147,483,648 bis 2,147,483,647.
		boolean isAngry = false; // für True/False nur boolean.
		
		int intValue = 66119;
		// byte byteIntValue = intValue; 
		// error: incompatible types: possible lossy conversion from int to byte
		
		long longy = 12345678912345L; // error: integer number too large --> assumes int type
		float floaty = 2.718f; // error: incompatible types: possible lossy conversion from double to float --> assumes double type
		long smallNumber = 100; // Wird kompiliert da es in int passt.
		
	}
}