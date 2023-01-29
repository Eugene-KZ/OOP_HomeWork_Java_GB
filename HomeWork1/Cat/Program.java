package HomeWork1.Cat;

public class Program {
	public static void main(String[] args) {
		Persona pers1 = new Persona("Pavel", "Pavlovich", 24, "Murka");
		Cat cat1 = new Cat("Murka", "Pavel");

		pers1.getInfo();
		System.out.println();
		cat1.getInfo();
		System.out.println();

		pers1.callTheCat();
		System.out.println();
		cat1.goTo();
	}
}
