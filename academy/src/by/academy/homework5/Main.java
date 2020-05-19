package by.academy.homework5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

//Задача 1.

//Можно писать все в main. Не нужно создавать новых классов.
//Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.

public class Main {
	public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
		return new HashSet<>(collection);
	}

//	Задача 2.
//	Можно писать все в main. Не нужно создавать новых классов.
//	Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. 
//	Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз. 
//	Замерьте время, которое потрачено на это. 
//	Сравните результаты и предположите, почему они именно такие.
	public static void task2Lists() {
		ArrayList<Double> arrayList = new ArrayList<>();
		LinkedList<Double> linkedList = new LinkedList<>();
		final int N = 1000000;
		final int M = 1000;
		for (int i = 0; i < N; i++) {
			arrayList.add(Math.random());
			linkedList.add(Math.random());
		}
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < M; i++) {
			arrayList.get((int) (Math.random() * (N - 1)));
		}
		System.out.println(System.currentTimeMillis() - startTime);

		startTime = System.currentTimeMillis();
		for (int i = 0; i < M; i++) {
			linkedList.get((int) (Math.random() * (N - 1)));
		}
		System.out.println(System.currentTimeMillis() - startTime);
	}

//	Задача 4.
//	Создать список оценок учеников с помощью ArryList, заполнить случайными
//	оценками. Найти самую высокую оценку с использованием итератора.
	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Integer> mark = new ArrayList<Integer>();
		Iterator<Integer> iterator = arrayList.iterator();
		for (int i = 1; i < 10; i++) {
			list.add(rand.nextInt(11));

			int max = list.get(0);
			int now = 1;

			while (iterator.hasNext()) {
				//Iterator run = iterator;

				int now = (int) iterator.next();
				if (max < now) {
					max = now;
				}
			}
		}

		System.out.println("Max " + max);

	}

//	Задача 5. 
//	Можно писать все в main. Не нужно создавать новых классов.
//	Имеется текст. Следует составить для него частотный словарь:
//	Создать Map<Character, Integer> для символов, в который мы заносим символ и его количество.

	public class Task5 {

		String text = "ArrayList — реализация изменяемого массива интерфейса List, "
				+ "часть Collection Framework, который отвечает за список (или динамический массив), "
				+ "расположенный в пакете java.utils. "
				+ "Этот класс реализует все необязательные операции со списком и предоставляет методы управления размером массива, "
				+ "который используется для хранения списка.";
		Map<Character, Integer> map = new HashMap<>();
		// ArrayList<Character> chars = new ArrayList<>();
		char c = 0;for(
		int i = 0;i<text.length();i++)
		{
			char c = text.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}System.out.println(map.toString());
	}

//	Задача 6.
//	Попробовать добавить в массив int на 8 элементов 10 чисел. 
//	Обернуть в try/catch, словить ArrayIndexOutOfBoundsException и вывести на экран сообщение:
//	"Array is to small, expand the array".

	public class Task6 {
		int[] arrayInt = new int[8];
	int i = 0;try
		{
			for (int i = 0; i < 10; i++) {
				arrayInt[i] = i;

			}
		}catch(

		ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Array is to small, expand the array");
		}
	}
}}}