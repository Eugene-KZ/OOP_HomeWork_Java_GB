package HomeWork1.Family;

public class Program {
	public static void main(String[] args) {
		Role man = new Role("Сидоров А.А.", 25, "мужчина", "муж", "Сидорова Н.А.");
		Role woman = new Role("Сидорова Н.А.", 21, "женщина", "жена", "Сидоров А.А.");



		man.getInfoPersona();
		System.out.println();
		man.getFullInfo();
		System.out.println();
		man.getSpouse();

		System.out.println("--------------------");

		woman.getInfoPersona();
		System.out.println();
		woman.getFullInfo();
		System.out.println();
		woman.getSpouse();
	}
}
