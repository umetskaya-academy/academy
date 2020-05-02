package by.academy.lesson9;

//2
//Переписать предыдущее задание, используя локальный класс. 
public class UserLocal {
	private String login;
	private String password;

	public UserLocal(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void createQuery() {
		Query query = new Query();
		query.printToLog();
	}

	class Query {

		public void printToLog() {
			login = "rembo";
			password = "qwer";
			System.out.println("Пользователь с таким " + getLogin() + " и" + getPassword() + " отправил запрос");
		}

	}

	public void createQueryLocal() {

		class QueryLocal {

			public void printToLog() {
				String loginLocal = "see";
				String passwordLocal = "123456000";
				System.out.println("Пользователь с таким " + loginLocal + " и" + passwordLocal + " отправил запрос");
			}
		}
		QueryLocal queryLocal = new QueryLocal();
		queryLocal .printToLog();
	}

}
