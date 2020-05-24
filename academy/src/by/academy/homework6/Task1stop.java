package by.academy.homework6;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 
 * Задание 1. 
Прочесть информацию введенную с клавиатуры и записать в созданный вами txt файл, 
если введена "stop" строка тогда закончить запись в файл. 
*/
public class Task1stop {

	public static void main(String[] args) throws Throwable {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите путь куда разместить файл:");
		FileOutputStream fileWriter = new FileOutputStream(reader.readLine(), true);

		System.out.println("Введите, что записать в файл ");
		StringTokenizer st = new StringTokenizer(reader.readLine());

		while (st.hasMoreTokens()) {
			String temp = st.nextToken();
			if (temp.equals("stop"))
				break;
			fileWriter.write((temp + " ").getBytes());
		}
		fileWriter.close();
	}
}
