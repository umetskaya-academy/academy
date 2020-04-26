package by.academy.homework3;

import java.text.ParseException;
//Задание 3.
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//С помощью SimpleDateFormat пропарсить данные, введеные с консоли, в зависимости от паттерна, к которому дата подходит. 
//	Вывести строку в следующем формате:
//	День: <Day>
//	Месяц: <Month>
//	Year: <Year>

import java.util.Scanner;

public class Task3 {
	public static void main(String... args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ввести параметры: день, месяц и год");
		Date date = null;
		Calendar calendarOne = Calendar.getInstance();
		String s = scan.nextLine();
		boolean itog = s.matches("([012][1-9]|[3][01])([-/])([0][1-9]|[1][012])([-/)])([0-9]{4})");

		if (itog) {
			if (s.charAt(2) == '-' && s.charAt(5) == '-') {
				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
				date = format.parse(s);
			} else if (s.charAt(2) == '/' && s.charAt(5) == '/') {
				SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
				date = format.parse(s);
			}
		} else {
			System.out.println("Некоректная дата.");
			return;
		}
		calendarOne.setTime(date);

		System.out.println("День: \t" + calendarOne.get(Calendar.DAY_OF_MONTH) + "\r\n" + "Месяц: \t"
				+ (calendarOne.get(Calendar.MONTH) + 1) + "\r\n" + "Год: \t" + calendarOne.get(Calendar.YEAR));

		scan.close();
	}
}