package by.academy.homework2;

//Задание 4. Создать иерархию классов, описывающих банковские карточки.
//Иерархия должна иметь хотя бы три уровня. 
import java.util.Scanner;

public class Task4BankCard2 extends Task4BankCard1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите ваш возраст: ");

		int number = sc.nextInt();
		System.out.println("Если ваш возраст: " + number);

		int minAge = 15;
		int maxAge = 45;
		if (number <= minAge) {
			System.out.println("Ваша скидка: 3%.");
		} else if (number <= maxAge) {
			System.out.println("Ваша скидка: 10%.");
		} else if (number > maxAge) {
			System.out.println("Нет скидки.");
		}

		sc.close();
	}

}
