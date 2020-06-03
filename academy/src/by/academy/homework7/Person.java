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
public class Person {
	private String firstName;
	public String lastName;
	private short age;
	private Date dateOfBirth;

	public Person(String firstName, String lastName, short age, Date dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;

	}

	public Person() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
