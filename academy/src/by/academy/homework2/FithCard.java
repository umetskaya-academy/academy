package by.academy.homework2;

//Задание 4. Создать иерархию классов, описывающих банковские карточки.
//Иерархия должна иметь хотя бы три уровня. 
import java.util.Calendar;

public class FithCard extends BankCard {

	String numberCard;

	public FithCard() {
	}

	public FithCard(String name, Calendar birthdayKlienta, String numberCard) {
		super();
		this.numberCard = numberCard;
	}

	public String getEyesColor() {
		return numberCard;
	}

	public void setEyesColor(String numberCard) {
		this.numberCard = numberCard;
		System.out.println("Класс физ Карты создан ");
	}
}
