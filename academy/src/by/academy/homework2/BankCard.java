package by.academy.homework2;

//Задание 4. Создать иерархию классов, описывающих банковские карточки.
//Иерархия должна иметь хотя бы три уровня. 
import java.util.Calendar;

public class BankCard {

	Integer BankCard_id;
	String name;

	Calendar birthdayKlienta;

	public BankCard() {
	}

	public BankCard(String name, Calendar birthdayKlienta) {
		this.name = name;
		this.birthdayKlienta = birthdayKlienta;
		System.out.println("Класс Карты создан ");
	}

}
