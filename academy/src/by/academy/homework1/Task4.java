
package by.academy.homework1;



public class Task4 {
	//Задание 4.
	//Выводить на консоль степень двойки, пока результат не будет больше, чем 1_000_000. 
	public static void main(String[] args) {	
		
	
		int e;
		int result;

		
		for (int i = 1; i < 20; i ++) {

		    result = 1;
		    e = i;
		    while (e > 0) {

		        result *= 2;
		        e --;
		       
		    }

		    System.out.println(result);
		}
	}
}
	
		          
		      
		      	
		
		