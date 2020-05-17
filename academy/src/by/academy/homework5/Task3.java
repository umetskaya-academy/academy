package by.academy.homework5;

import java.util.Iterator;
import java.util.NoSuchElementException;

//Задача 3.

//Написать итератор по двумерному массиву. (Отдельный класс. Наследуемся от Iterator<T>)
//Протестировать в main.

public class Task3<T> implements Iterator<T> {
	private T[][] array;

	public Task3(T[][] array) {
		this.array = array;
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {

			private int i, j;

			@Override
			public boolean hasNext() {
				for (int i = this.i; i < array.length; i++) {
					for (int j = this.j; j < array[i].length; j++) {
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
					for (int j = (i == this.i ? this.j : 0); j < array[i].length; j++) {
						this.i = i;
						this.j = j;
						return t;
					}
				}

				return t;
			}
		};
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		return null;
	}
}
