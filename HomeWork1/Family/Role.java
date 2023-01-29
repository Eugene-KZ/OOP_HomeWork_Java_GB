package HomeWork1.Family;

class Role extends Persona {
	private String role;
	private String fioSpouse;

	Role(String fio, Integer age, String gender, String role, String fioSpouse) {
		super(fio, age, gender);
		this.role = role;
		this.fioSpouse = fioSpouse;
	}

	public String getRole() {
		return role;
	}

	public String getFioSpouse() {
		return fioSpouse;
	}

	public void getFullInfo() {
		System.out.println("Fio: " + getFio());
		System.out.println("Age: " + getAge());
		System.out.println("Gender: " + getGender());
		System.out.println("Role: " + role);
		System.out.println("FioSpouse: " + fioSpouse);
	}

	public void getSpouse(){
		System.out.println("Я " + getFio() + ", я " + role + " для " + fioSpouse);
	}

}
