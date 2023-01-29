package HomeWork1.Family;

class Persona {
	private String fio;
	private Integer age;
	private String gender;

	Persona(String fio, Integer age, String gender) {
		this.fio = fio;
		this.age = age;
		this.gender = gender;
	}

	public String getFio() {
		return fio;
	}

	public Integer getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public void getInfoPersona() {
		System.out.println("Fio: " + fio);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
	}

}
