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
		ArrayList<User> users = new ArrayList<>();
		users.add(new User("Ab", "Abc", 1));
		users.add(new User("Abc", "Abcd", 2));
		users.add(new User("Abcd", "Abcde", 3));
		users.add(new User("Abcdev", "Abcdevj", 4));
		users.add(new User("Abcdevjq", "Abcdevjqw", 5));
		users.add(new User("Abcdevjqwe", "Abcdevjqwer", 6));
		users.add(new User("Abcdevjqwert", "Abcdevjqwerty", 7));
		users.add(new User("Abcdevjqwertyu", "Abcdevjqwertyui", 8));
		users.add(new User("Abcdevjqwertyuio", "Abcdevjqwertyuiop", 9));
		users.add(new User("Abcdevjqwertyuiopa", "Abcdevjqwertyuiopas", 10));

		

		File dirUser = new File("C:\\Users\\Admin\\git\\academy\\academy\\src\\by\\academy\\homework6\\Main");
		File dirNew = new File(dirUser, "Users");
		dirUser.mkdir();

		if (!dirNew.exists()) {
			dirNew.mkdir();

			for (int i = 0; i < userList.size(); i++) {
				userFile = new File(dirUser, (userList.get(i).getName() + "_" + userList.get(i).getSoName() + ".txt"));
				userFile.createNewFile();

				try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(file))) {
					obj.writeObject(i);

				} catch (IOException e) {
					System.err.println(e.getMessage());
				}
			}
		}
	}
}
