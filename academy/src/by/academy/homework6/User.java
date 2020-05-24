package by.academy.homework6;

//Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст). 
public class User {
	private String name;
	private String familia;
	private int age;

	public User(String name, String familia, int age) {
		super();
		this.name = name;
		this.familia = familia;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
