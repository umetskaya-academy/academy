package by.academy.homework4;

import java.util.Arrays;

//Задание 2.

//Создать класс, который параметризуется любым типом (T). Имеет массив объектов нашего типа T.
//Содержит пустой конструктор, который по дефолту инициализирует пустой массив размерности 16.
//Содержит конструктор, принимающий значение int и инитает им размер нашего массива.
//
//Содержит методы:
//1) добавления в наш массив объекта типа T - add(T obj) (нужно помнить, что если массив заполнен, нам нужно его расширить с помощью Arrays.copyOf)
//2) взятие по индексу get(int i)
//3) взятие последнего элемента getLast()
//4) взятие первого элемента getFirst()
//5) вывод размера массива
//6) вывод индекса последнего заполненого элемента (не путать с размерностью)
//7) удаление элемента по индексу (remove(int i)
//8) удаление элемента по значению (remove(T obj))

public class Task2<T> {

	private T[] array;
	private int size;

	public Task2() {
		super();

		T[] array = (T[]) new Object[16];
		size = 16;
		this.array = array;
	}

	public Task2(int size) {
		super();

		T[] array = (T[]) new Object[size];
		this.array = array;
		this.size = size;
	}

	public void add(T obj) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				array[i] = obj;
				size++;
				return;
			}
		}
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = obj;
		size++;

	}

	public T get(int index) {
		return (T) array[index];
	}

	public T getLast() {
		return array[array.length - 1];
	}

	public T getFirst() {
		return array[0];
	}

	public int size() {
	return size;
	}

	public int getLastIndex() {
		return size - 1;
	}

	public void remove(int index) {

		try {
			array[index] = null;
		} catch (RuntimeException e) {
			System.out.println(this.size);
		}
	}

	public void remove(T obj) {

		boolean check = false;
		for (int i = 0; i < size; i++) {
			if (array[i] == obj) {
				array[i] = null;
				check = true;
				break;
			}
		}
	}
}
