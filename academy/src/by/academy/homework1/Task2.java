//ВОПРОС ЧТО ПЕРЕВОДИТ CHAR И ВО ЧТО ОН ПЕРЕВОДИТ ЧТО-ТО, КАК ЕГО НУЖНО ЗАПИСЫВАТЬ?
package by.academy.homework1;

import java.util.Scanner;

public class Task2 {
	//Задание 2.
	//Используем switch/case. Ввести с консоли тип данных(созраняем в String) и переменную, вывести на экран:
		//a) если тип данных int, вывести остаток от деления на 2
		//b) если double, вывести 70% от числа 
		//c) если float, возвести в квадрат
		//d) если char, вывести код символа
		//e) String, вывести на экран строку в виде ("Hello " + переменная)
		//f) во всех остальных случаях вывести на экран ("Unsupported type");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Введите тип данных: ");
		String dataType = sc.nextLine(); 
		
		
		switch (dataType) {
		case "int":
			System.out.println("Введите переменную: ");
			int a = sc.nextInt();
			System.out.println("Остаток от деления на 2 равен: " + (a % 2 ));
			break;
		case "double": 
			System.out.println("Введите переменную: ");
			double b = sc.nextDouble();
			System.out.println("70% от числа равно: " + (b * 70 / 100));
			break;
		case "float":
			System.out.println("Введите переменную: ");
			float c = sc.nextFloat();
			System.out.println("Число в квадрате равно: " + (c * c));
			break;
		case "char":
			System.out.println("Введите переменную: ");
			char d = sc.next().charAt(0);
			System.out.println("Код символа равен: " + (char) d);
			break;
		case "String":
			System.out.println("Введите переменную: ");
			String e = sc.nextLine();
			System.out.println("Hello " + e);
			break;
			
		default:
				System.out.println("Unsupported type");
		}
		
		
		
		
		sc.close();
		
		}
	}
