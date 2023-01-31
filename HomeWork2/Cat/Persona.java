package HomeWork2.Cat;

public class Persona implements Speak {
	private String name;
	private String surname;
	private Integer age;
	private String catName;

	Persona(String name, String surname, Integer age, String catName) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.catName = catName;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Integer getAge() {
		return age;
	}

	public String getCatName() {
		return catName;
	}

	public void getInfo() {
		System.out.println("Name: " + name);
		System.out.println("Surname: " + surname);
		System.out.println("Age: " + age);
		System.out.println("CatName: " + catName);
	}

	public void speak(){
		System.out.println(name + ": Здравствуйте!\n");
	}

	public void callTheCat() {
		System.out.println(name + ": Кис-кис");
	}
}
