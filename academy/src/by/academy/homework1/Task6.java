package by.academy.homework1;

import java.util.Scanner;

public class Task6 {
	// Задание 6.
	// Ввести две строки с консоли. Определить, является ли одна строка
	// перестановкой символов другой строки.
	// Учитываем регистр. Не использовать сортировку :)
	// Например:
	// 1. “hello” и “hlleo” -> true
	// 2. “hello” и “art” -> false

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String number1 = sc.nextLine();
		String number2 = sc.nextLine();

		char[] st1 = number1.toCharArray();
		char[] st2 = number2.toCharArray();
		boolean isPerestonovka = true;
		int[] checker1 = new int[256];

		for (int i = 0; i < st1.length; i++) {
			checker1[st1[i]]++;
		}
		for (int i = 0; i < st1.length; i++) {
			checker1[st2[i]]--;
		}

		for (int i = 0; i < checker1.length; i++) {
			if (checker1[i] != 0) {
				isPerestonovka = false;
				break;
			}
		}
		System.out.println("Perestonovka: " + isPerestonovka);
		sc.close();

	}

}
