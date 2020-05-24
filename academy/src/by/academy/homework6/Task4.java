package by.academy.homework6;

import java.io.File;
import java.io.IOException;

/* 
 * Задание 4. 
Создайте каталог(папку). Создайте в папке 100 txt файлов (Например, 1.txt, 2.txt ... 100.txt). 
Считываем текст из 2-ого задания, получаем его длинну (576 символов). 
Для каждого файла генерируем рандомное число от 0 до 576, 
достаем из текста (из 2 задания) такое-же количество символов (string.substring()) и сохраняем в наш файл. 
Создайте файл result.txt и запишите туда список всех файлов и их размеры.
*/
public class Task4 {
	public static void main(String[] args) throws IOException {

		File dir = new File("C:\\Users\\Admin\\git\\academy\\academy\\src\\by\\academy\\homework6\\", "FromTask4");
		dir.mkdir();
		for (int i = 0; i < 100; i++) {
			File newFile = new File(dir, (i + ""));
			newFile.createNewFile();
		}
	}
}