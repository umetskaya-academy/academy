package by.academy.homework4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import by.academy.homework4.Date.DayOfWeek;

//Задание 1.

//Создать объект класса Date, используя вложенные классы Год, Месяц, День. 
//Методы: задать дату, вывести на консоль день недели по заданной дате. 
//День недели представить в виде перечисления. 
//Рассчитать количество дней, в заданном временном промежутке.
//Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки. 
//После валидации в конструкторе создаем объекты класса Year, Month, Day.
//Добавить метод, который проверяет высокосный ли год или нет.

public class Date {
	private String dateValid = ("([012][1-9]|[3][01])([-/])([0][1-9]|[1][012])([-/)])([0-9]{4})");

	void test() {

		Date date = new Date();

		Calendar calendarOne = Calendar.getInstance();

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");

		class Year {
			private String strYear;
			private int intYear;

			private int getIntYear() {
				intYear = Integer.parseInt(getStrYear());
				return intYear;
			}

			private void setIntYear(int intYear) {
				this.intYear = intYear;
			}

			public String getStrYear() {
				return strYear;
			}

			private void setStrYear(String strYear) {
				this.strYear = strYear;

			}
		}

		class Month {
			private String strMonth;
			private int intMonth;

			private int getIntMonth() {
				intMonth = Integer.parseInt(getStrMonth());
				return intMonth;
			}

			private void setIntMonth(int intMonth) {
				this.intMonth = intMonth;
			}

			public String getStrMonth() {
				return strMonth;
			}

			private void setStrMonth(String strMonth) {
				this.strMonth = strMonth;
			}
		}
		class Day {
			private String strDay;
			private int intDay;

			private int getIntDay() {
				intDay = Integer.parseInt(getStrDay());
				return intDay;
			}

			private void setIntDay(int intDay) {
				this.intDay = intDay;
			}

			public String getStrDay() {
				return strDay;
			}

			private void setStrDay(String strDay) {
				this.strDay = strDay;
			}

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
		private void DayOfWeek(int number) {
			switch (number - 1) {
			case (1):
				System.out.println(MONDAY);
				break;
			case (2):
				System.out.println(TUESDAY);
				break;
			case (3):
				System.out.println(WEDNESDAY);
				break;
			case (4):
				System.out.println(THURSDAY);
				break;
			case (5):
				System.out.println(FRIDAY);
				break;
			case (6):
				System.out.println(SATURDAY);
				break;
			case (7):
				System.out.println(SUNDAY);
				break;
			default:
				return;
			}
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

	public char[] dayOfWeek() {
		// TODO Auto-generated method stub
		return null;
	}
}