package by.academy.homework4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

//Задание 1.

//Создать объект класса Date, используя вложенные классы Год, Месяц, День. 
//Методы: задать дату, вывести на консоль день недели по заданной дате. 
//День недели представить в виде перечисления. 
//Рассчитать количество дней, в заданном временном промежутке.
//Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки. 
//После валидации в конструкторе создаем объекты класса Year, Month, Day.
//Добавить метод, который проверяет высокосный ли год или нет.

public class Date {

	void test() {

		Date date = new Date();

		Calendar calendarOne = Calendar.getInstance();

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");

		class Year {

		}

		class Month {

		}
		class Day {
		}
	}

	public enum DayOfWeek {

		MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

		private int value;

		private DayOfWeek(int number) {
			this.value = number;
		}

		public int getValue() {
			return value;
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(number);
		int number = calendar.get(Calendar.DAY_OF_WEEK);
	}

	class WhatDay {

		private DayOfWeek dayOfWeek;

		public DayOfWeek getDayOfWeek() {
			return dayOfWeek;
		}

		public void setDayOfWeek(DayOfWeek dayOfWeek) {
			this.dayOfWeek = dayOfWeek;

		}

		class Year {

			public void bissextile() {

				Scanner sc = new Scanner(System.in);
				int year = sc.nextInt();
				if (year % 4 == 0) {
					if (year % 100 == 0) {
						if (year % 400 == 0) {
							System.out.println("bissextile");
						}
					}
				} else {
					System.out.println("not bissextile");
				}
				Year yearO = new Year();
				yearO.bissextile();
				sc.close();
			}

		}

	}
}