package by.academy.lesson12;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*Написать класс, который копирует содержимое из одного файла в другой.

Используем классы BufferedReader, FileReader, BufferedWriter, FileWriter.*/

public class Task3 {
	public static void main(String[] args) {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("a.txt"));
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ab.txt"))) {

			int a;
			while ((a = bufferedReader.read()) != -1) {
				bufferedWriter.write(a);

			}

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}
}
