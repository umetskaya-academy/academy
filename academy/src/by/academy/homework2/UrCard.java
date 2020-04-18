package by.academy.homework2;

//Задание 4. Создать иерархию классов, описывающих банковские карточки.
//Иерархия должна иметь хотя бы три уровня. 
import java.util.Calendar;

public class UrCard extends FithCard {

	String onlyUr;

	public UrCard() {
	}

	public UrCard(String name, Calendar birthday, String onlyUr) {
		super();
		this.onlyUr = onlyUr;
		System.out.println("Класс юр Карты создан ");
	}
}
