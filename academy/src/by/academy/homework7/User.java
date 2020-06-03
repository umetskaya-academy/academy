package by.academy.homework7;

import java.util.Date;

/*Задача 2. Reflection API.
a)	Создать свой класс Person с полями: firstName, lastName, age, dateOfBirth 
b)	Добавить класс User, который наследуется от Person, с полями: login, password, email
c)	Добавить гетеры, сетеры. Добавить метод printUserInfo в User. Вывести с помощью рефлексии все поля и методы, сначала через 
getMethod("name")
getMethods()
getField("name")
getFields()
а затем через 
getDeclaredMethod("name")
getDeclaredMethods()
getDeclaredField("name")
getDeclaredFields()
Посмотреть разницу. 
Просетать все значения через Reflection. (set метод класса Field). 
Вывести значения полей через Reflection. (get метод класса Field). 
Вызвать toString через invoke.
*/
public class User extends Person {
	private String login;
	private String password;
	private String email;

	public User() {
		super();
	}

	public User(String firstName, String lastName, short age, Date dateOfBirth, String login, String password,
			String email) {
		super(firstName, lastName, age, dateOfBirth);
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void printUserInfo() {
		System.out.println("login" + " " + email + " " + password);
	}

}
