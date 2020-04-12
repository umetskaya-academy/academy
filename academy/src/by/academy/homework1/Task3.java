package by.academy.homework1;

import java.util.Scanner;

public class Task3 {
	//Задание 3.
	//Ввести с консоли число от 1 до 10, вывести на экран таблицу умножения для этого числа. (10 чисел).

	public static void main(String[] args) {
		 
		     Scanner sc = new Scanner(System.in);
		          System.out.print("Введите число от 1 до 10: ");
		         int num = sc.nextInt();

		          for (int i = 1; i<=10; i++) {
		             System.out.println (num + "*" + i + "=" + num*i);
		          
		          }
		          sc.close();
		   }
		
	}

