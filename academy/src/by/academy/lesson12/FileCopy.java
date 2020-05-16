package by.academy.lesson12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

//Переписать класс FileCopy: 

//	a) Добавить блок try-with-resources. 
//	б) Добавить catch блок для обработки IOException. (Задание с урока)

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		FileInputStream fileIn = null;
		FileOutputStream fileOut = null;

		try {
			fileIn = new FileInputStream("file.txt");
			fileOut = new FileOutputStream("copied_file.txt");

			int a;
			while ((a = fileIn.read()) != -1) {
				fileOut.write(a);
			}
		} finally {
			if (fileIn != null) {
				fileIn.close();
			}
			if (fileOut != null) {
				fileOut.close();
			}
		}
	}

	public static void main1(String[] args) throws IOException {

		try (FileInputStream fileIn = new FileInputStream("file.txt");
				BufferedInputStream bufferedInput = new BufferedInputStream(fileIn);
				FileOutputStream fileOut = new FileOutputStream("copied_file.txt");
				BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOut)) {
			int a;
			while ((a = fileIn.read()) != -1) {
				fileOut.write(a);
			}
		} catch (IOException a) {
			System.err.println("Error in method");
		}

	}
}
