package HomeWork3.Cat;

//Так же добавил обощение.

public class Persona<T, R> implements Speak {
	private T name;
	private T surname;
	private R age;
	private T catName;

	Persona(T name, T surname, R age, T catName) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.catName = catName;
	}

	public T getName() {
		return name;
	}

	public T getSurname() {
		return surname;
	}

	public R getAge() {
		return age;
	}

	public T getCatName() {
		return catName;
	}

	public void getInfo() {
		System.out.println("Name: " + name);
		System.out.println("Surname: " + surname);
		System.out.println("Age: " + age);
		System.out.println("CatName: " + catName);
	}

	public void speak() {
		System.out.println(name + ": Здравствуйте!\n");
	}

	public void callTheCat() {
		System.out.println(name + ": Кис-кис");
	}
}
