package by.academy.homework7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
public class Main {
	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, NoSuchMethodException {

		Class<Person> person = Person.class;
		Class<User> user = User.class;

		Class<? extends Class> userClass = user.getClass();
		Class<? extends Class> personClass = person.getClass();
		Method[] userMethods = userClass.getMethods();
		Field[] userFields = userClass.getFields();

		Method[] userDeclaredMethods = userClass.getDeclaredMethods();
		Field[] userDeclaredFields = userClass.getDeclaredFields();

		for (Method method : userMethods) {
			method.setAccessible(true);
			System.out.println(method);
		}
		System.out.println();

		for (Method method : userDeclaredMethods) {
			method.setAccessible(true);
			System.out.println(method);
		}

		for (Field field : userFields) {
			field.setAccessible(true);
			System.out.println(field);
		}
		System.out.println();

		for (Field field : userDeclaredFields) {
			field.setAccessible(true);
			System.out.println(field);

		}

		for (Field field : userDeclaredFields) {
			field.setAccessible(true);
			System.out.println((String) field.get(user));
		}

		try {
			Method getPrintUserInfoMethod = userClass.getMethod("printUserInfo");
			getPrintUserInfoMethod.setAccessible(true);
			getPrintUserInfoMethod.invoke(user);
		} catch (SecurityException | InvocationTargetException e) {
			e.printStackTrace();
		}

		try {
			Method getPrintUserInfoMethod = userClass.getMethod("toString");
			getPrintUserInfoMethod.setAccessible(true);
			System.out.println(getPrintUserInfoMethod.invoke(user));
		} catch (SecurityException | InvocationTargetException e) {
			e.printStackTrace();
		}

		try {
			Field getLogin = userClass.getField("login");
			getLogin.setAccessible(true);
			System.out.println(getLogin.get(user));
		} catch (Exception e) {
			System.err.println();
		}

		try {
			Field getDeclaredLogin = userClass.getDeclaredField("login");
			getDeclaredLogin.setAccessible(true);
			System.out.println(getDeclaredLogin.get(user));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
