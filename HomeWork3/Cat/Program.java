package HomeWork3.Cat;

public class Program {
	public static void main(String[] args) {
		Persona<String, Integer> pers1 = new Persona<String, Integer>("Pavel", "Pavlovich", 22, "Murka");
		Cat<String> cat1 = new Cat<String>("Murka", "Pavel");

		pers1.getInfo();
		System.out.println();
		cat1.getInfo();
		System.out.println();
		pers1.speak();
		cat1.speak();

		pers1.callTheCat();
		System.out.println();
		cat1.goTo();
	}
}
