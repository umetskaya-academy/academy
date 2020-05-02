package by.academy.lesson9;

//Переписать класс Query используя статический класс.
public class UserStatic {

	private static String login;
	private static String password;

	static public void createQuery() {

		Query.printToLog();
	}

	static class Query {

		static void printToLog() {
			login = "rembo";
			password = "12345";
			System.out.println("Пользователь с таким " + login + " и" + password + " отправил запрос");
		}

	}

}
