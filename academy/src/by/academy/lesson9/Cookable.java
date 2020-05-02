package by.academy.lesson9;

//Создать интерфейс Cookable, содержащий метод void cook(String str). 
//Создать класс Food, содержащий метод 
//public void prepare(Cookable c, String str) { c.cook(str);} 
//Создать экземпляр класса Food и вызвать его метод prepare(). 
//На вход метода prepare() передать экземпляр анонимного класса, 
//расширяющего интерфейс Cookable. 
public interface Cookable {
	void cook(String str);
}

class Food {
	Food() {
		super();
	}

	public void prepare(Cookable c, String str) {
		c.cook(str);
	}
}
