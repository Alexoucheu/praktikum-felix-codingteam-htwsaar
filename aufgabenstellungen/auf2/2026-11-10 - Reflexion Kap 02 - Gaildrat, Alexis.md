**Feedback erhalten von:**

`Andreas Schaffhauser`

## Ihre Reflexion

`
Das Review hat mir ermöglicht wie mann eine Superklasse überschreibt. Zum Beispiel: 

```Java
// Person Class

class Person {
	int age;
	String name;
	
	void greet() {
		System.out.println("Hallo ich heiße " + name + "!");
	}
	
	void tellAge() {
		System.out.println("Ich bin " + age + " Jahre alt!");
	}
}
// Student Class

class Student extends Person {
	super.greet();
	void greet() {
		System.out.println("Hallo ich heiße " + name + " und bin Student*innen!");
	}
}
```

durch **extends** und **super.**greet();.
Auch, dass die Instanzvariablen *private* sollen sein und mit getter und setter benutzt werden.
Ich werde jetzt die Unterklassen besser und genauer schreiben, die Instanzvariablen mit private schützen und getter / setter benutzen.
`
