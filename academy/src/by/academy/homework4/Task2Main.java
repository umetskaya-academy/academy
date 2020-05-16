package by.academy.homework4;

import java.util.Arrays;

public class Task2Main {
	public static <T> void main(String[] args) {

		Task2<String> test = new Task2<String>();

		test.add("One");
		test.add("Two");
		test.add("Three");

		System.out.println(test.get(0));
		System.out.println(test.getLast());
		System.out.println(test.getFirst());
		System.out.println(test.size());
		System.out.println(test.getLastIndex());
		test.remove(index);
		test.remove(obj);
	}
}