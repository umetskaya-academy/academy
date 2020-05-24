package by.academy.homework6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/* 
 * Задание 3.
Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст). 
В классе Main создайте ArrayList<User>, добавьте 10 пользователей в коллекцию. 
Создайте каталог(папку) users и для каждого пользователя создайте файл в этом каталоге. 
Назовите файл Имя_Фамилия.txt. Сериализуйте информацию о пользователе и положите в файл пользователя. 
Не забываем закрывать потоки. 
В блоке catch выводим сообщение ошибки на экран (System.err.println(e.getMessage());)
*/
public class Main {
	public static void main(String[] args) {
		ArrayList<User> userList = new ArrayList<>();
		File usersFile;
		userList.add(new User("Ab", "Abc", 1));
		userList.add(new User("Abc", "Abcd", 2));
		userList.add(new User("Abcd", "Abcde", 3));
		userList.add(new User("Abcdev", "Abcdevj", 4));
		userList.add(new User("Abcdevjq", "Abcdevjqw", 5));
		userList.add(new User("Abcdevjqwe", "Abcdevjqwer", 6));
		userList.add(new User("Abcdevjqwert", "Abcdevjqwerty", 7));
		userList.add(new User("Abcdevjqwertyu", "Abcdevjqwertyui", 8));
		userList.add(new User("Abcdevjqwertyuio", "Abcdevjqwertyuiop", 9));
		userList.add(new User("Abcdevjqwertyuiopa", "Abcdevjqwertyuiopas", 10));

		File dirUser = new File("C:\\Users\\Admin\\git\\academy\\academy\\src\\by\\academy\\homework6\\Main");
		File dirNew = new File(dirUser, "Users");
		dirUser.mkdir();

		if (!dirNew.exists()) {
			dirNew.mkdir();

			for (int i = 0; i < userList.size(); i++) {
				usersFile = new File(dirUser, (userList.get(i).getName() + "_" + userList.get(i).getName() + ".txt"));

				try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(usersFile))) {
					obj.writeObject(i);

				} catch (IOException e) {
					System.err.println(e.getMessage());
				}
			}
		}
	}
}
