package HomeWork3.Cat;

// Добавил обощение, понимаю что тут в принципе кроме String вряд-ли что-то другое использовать будут, но все равно оставлю)

public class Cat<T> extends Animal implements Speak {
	Cat(T name, T ownerName){
			super(name, ownerName);
	}

	@Override
	public void speak(){
		System.out.println(getName() + ": Мяу\n");
	}


	void goTo(){
		System.out.println(getName() + ": Иду к хозяину.");
	}
}
