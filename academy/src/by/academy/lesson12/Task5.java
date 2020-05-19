package by.academy.lesson12;

import java.io.File;
/*Написать метод который циклически просматривает содержимое заданного каталога
и выводит на печать информацию о всех файлах и каталогах, находящихся в нем и в его подкаталогах. 
Используем рекурсию.*/

public class Task5 {
	public static void main(String[] args) {
		File file = new File("file");
		printContent(file);
	}

	public static void printContent(File file) {

		if (file.isDirectory()) {

			File[] file1 = file.listFiles();

			System.out.println(file.getName());

			for (File file2 : file1) {
				printContent(file);
			}

		} else {
			System.out.println(file.getName());
		}
	}
}
