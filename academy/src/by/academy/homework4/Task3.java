package by.academy.homework4;
//Задание 3. 

//Написать свой итератор для массива.

public class Task3<T> {

	private T[] array;
	private int size;
	private int index;

	public Task3(T[] array) {
		this.array = array;
		this.size = array.length;
		this.index = 0;
	}

	public boolean hasNext() {
		return size < index;
	}

	public T next() {
		if (size < index) {
			return array[size++];
		}
		return null;
	}
}
