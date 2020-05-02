package by.academy.lesson9;

//В методе main(): создать экземпляр класса User и вызвать метод createQuery(); 
//создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию user.new Query(); 
//создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию new User().new Query(); 
public class Main {
	public static void main(String[] args) {

		String login = "rembo";
		String password = "12345";
		User user = new User(login, password);
		user.createQuery();

		String loginLocal = "see";
		String passwordLocal = "123456000";
		UserLocal userLocal = new UserLocal(loginLocal, passwordLocal);
		userLocal.createQuery();

		Printable printable = new Printable() {

			public void print() {
				System.out.println("Salut");
			}
		};
		printable.print();

		user.new Query().printToLog();

	}

}
