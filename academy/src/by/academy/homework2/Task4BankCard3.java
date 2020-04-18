package by.academy.homework2;

import java.util.Scanner;

//Задание 4. Создать иерархию классов, описывающих банковские карточки.
//Иерархия должна иметь хотя бы три уровня. 
public class Task4BankCard3 extends Task4BankCard2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Срок использования карты: ");

		double moreYear = sc.nextDouble();
		System.out.println("Если срок использования карты: " + moreYear);

		if (moreYear < 1) {
			System.out.println("У вас обыычная карта.");
		} else if (moreYear >= 1) {
			System.out.println("Вам выдадут карту: Vip");
		}

	}
}
