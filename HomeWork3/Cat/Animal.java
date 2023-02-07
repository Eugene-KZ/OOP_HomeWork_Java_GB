package HomeWork3.Cat;

// Добавил интерфейс, переопределил методы, добавил обощение.

public abstract class Animal<T> implements GetInfoAnimal<T> {
	private T name;
	private T ownerName;

	Animal(T name, T ownerName) {
		this.name = name;
		this.ownerName = ownerName;
	}

	@Override
	public T getName() {
		return name;
	}

	@Override
	public T getOwnerName() {
		return ownerName;
	}

	@Override
	public void getInfo() {
		System.out.println("Name: " + name);
		System.out.println("OwnerName: " + ownerName);
	}
}
