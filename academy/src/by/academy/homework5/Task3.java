package by.academy.homework5;

import java.util.Iterator;
import java.util.NoSuchElementException;

//Задача 3.

//Написать итератор по двумерному массиву. (Отдельный класс. Наследуемся от Iterator<T>)
//Протестировать в main.

public class Task3<T> implements Iterator<T> {
	private T[][] array;
	private int i, j;

	public Task3(T[][] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		for (int i = this.i; i < array.length; i++) {
			for (int j = this.j; j < array[i].length;) {
				return true;
			}
		}
		return false;
	}

	@Override
	public T next() {
		if (!hasNext())
			throw new NoSuchElementException();
		T t = array[i][j];
		j++;
		for (int i = this.i; i < array.length; i++) {
			for (int j = (i == this.i ? this.j : 0); j < array[i].length;) {
				this.i = i;
				this.j = j;
				return t;
			}
		}

		return t;
	}

}
