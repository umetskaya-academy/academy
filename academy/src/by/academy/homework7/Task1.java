package by.academy.homework7;

import java.util.List;
import java.util.stream.Stream;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Map;

/*Задача 1. 
 * Stream/Lambda.
 * Не использовать циклы (for/while/do-while). 
 * Сгенерировать 100 рандомных Long чисел в диапазоне от 0 до 100. 
 * Каждое число умножить на PI и отнять 20. 
 * Отфильтровать, оставив числа меньшие 100. 
 * Отсортировать по возрастанию. 
 * Пропустив первые 3 числа произвести следующие операции:
 * Преобразовать (операция map) лист чисел в Map, где ключем является строка: ("Number: " + value).
 * Собрать значения в list с помощью collect, где значениями оставить строковые представления ("Number: " + value).
*/
public class Task1 {
	public static void main(String[] arg) {

		List<Long> list = Stream.generate(() -> (long) new Random().nextInt(101)).limit(100)
				.map(i -> (long) (i * Math.PI - 20)).filter(i -> i < 100).sorted().skip(3).collect(Collectors.toList());

		Map<String, Long> map = list.stream().distinct()
				.collect(Collectors.toMap(i -> "Number:" + i, (i) -> i.longValue()));

		List<String> StrList = map.keySet().stream().collect(Collectors.toList());

		System.out.println(list);
		System.out.println(map);
		System.out.println(StrList);

	}

}
