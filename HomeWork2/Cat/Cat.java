package HomeWork2.Cat;

public class Cat extends Animal implements Speak {
	Cat(String name, String ownerName){
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
