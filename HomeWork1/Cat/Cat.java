package HomeWork1.Cat;

public class Cat {
	private String name;
	private String ownerName;

	Cat(String name, String ownerName){
		this.name = name;
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public String getOwnerName(){
		return ownerName;
	}

	public void getInfo(){
		System.out.println("Name: " + name);
		System.out.println("OwnerName: " + ownerName);
	}

	void goTo(){
		System.out.println(name + ": Иду к хозяину.");
	}
}
