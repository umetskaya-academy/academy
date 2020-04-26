package by.academy.homework3chapter2;

import java.util.Scanner;

//Задание 7.
//Добавить в наше приложение, которое писали на прошлом уроке меню. 
//Которое позволяет добавить продукт, удалить продукт из массива по названию продукта.
//Добавить выбор типа объекта через switch/case. 

public class Task7 {

	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		int x = 0;
		String s = "";

		while (!"3".equals(s)) {
			System.out.println("1. Чтобы добавить продукт, для создания массива по названию продукта, введите 1");
			System.out.println("2. Чтобы удалить продукт из массива, по названию продукта, введите 2");
			System.out.println("3. Чтобы выйти из приложения введите 3");
			s = scan.next();

			try {
				x = Integer.parseInt(s);
			} catch (NumberFormatException e) {
				System.out.println("Неверный ввод");
			}

			switch (x) {
			case 1:
				// вызов метода 1
				break;
			case 2:
				// вызов метода 2
				break;
			case 3:
				// вызов метода 3
				break;
			}
		}
		System.out.println("Пока!");
		scan.close();
	}
}
