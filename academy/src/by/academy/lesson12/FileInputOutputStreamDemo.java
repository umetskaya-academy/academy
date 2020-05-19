package by.academy.lesson12;

import java.io.File;
//Переписать класс FileInputOutputStreamDemo: 
//a) Добавить блок try-with-resources. 
//б) Замените for (int i = 0; i < c.length; i++) на блок for-each.  
//в) Пусть file.txt записывается в каталог src/io. (Задание с урока)
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputOutputStreamDemo {
	public static void main(String[] args) {

		try {
			char[] symbols = { 'a', 'b', 'c' };
			OutputStream output = new FileOutputStream("a.txt");
			for (char c : symbols) {
				// Запись каждого символа в текстовый файл
				output.write(c);
			}
			output.close();

			InputStream input = new FileInputStream("a.txt");
			int size = input.available();

			for (int i = 0; i < size; i++) {
				// Чтение текстового файла посимвольно
				System.out.print((char) input.read() + " ");
			}
			input.close();

			File dir = new File("src");
			File dir2 = new File(dir, "io");
			if (!dir.exists()) {
				dir.mkdir();
			}
			if (!dir2.exists()) {
				dir2.mkdir();
			}

			try (FileOutputStream output1 = new FileOutputStream("src\\io\\file.txt");
					FileInputStream input1 = new FileInputStream("src\\io\\file.txt");) {
			}

		} catch (IOException e) {
			System.out.print("Exception");
		}
	}
}
//BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOut);
//BufferedInputStream bufferedInput = new BufferedInputStream(fileIn))