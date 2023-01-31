package HomeWork2.Cat;

public abstract class Animal {
	private String name;
	private String ownerName;

	Animal(String name, String ownerName){
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
}
