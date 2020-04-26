package by.academy.homework3;
//Задание 2. 

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Написать RegExp который проверял бы введенную дату на соответствие патерна:
//   a) dd/MM/yyyy
//   b) dd-MM-yyyy 

public class Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите дату: ");
		String data = scan.nextLine();

		String dateRegEx = "^[0-3]{1}[0-9]{1}/[0-1]{1}[1-2]{1}/[1-9]{1}[0-9]{3}$";
		String dateRegEx1 = "^[0-3]{1}[0-9]{1}-[0-1]{1}[1-2]{1}-[1-9]{1}[0-9]{3}$";
		System.out.println(Pattern.matches(dateRegEx, "01/01/1990"));
		System.out.println(Pattern.matches(dateRegEx1, "01-01-1990"));

//		
//		if ( "(\\d{1,2}\\/\\d{1,2}\\/\\d{4}) || (\\d{1,2}\\-\\d{1,2}\\-\\d{4})" == data) {
//			System.out.println("true");	
//		} else
//			System.out.println("Не соответсвует формату");
//		{
//		 System.out.println(checkWithRegExp("dd/MM/yyyy"));
//		 System.out.println(checkWithRegExp("dd-MM-yyyy"));
		scan.close();
	}

	public static boolean checkWithRegExp(String taskString) {
		Pattern p = Pattern.compile("(\\d{1,2}\\/\\d{1,2}\\/\\d{4}) || (\\d{1,2}\\-\\d{1,2}\\-\\d{4})");
		Matcher m = p.matcher(taskString);
		return m.find();

	}
}
