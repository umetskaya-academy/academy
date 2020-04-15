package by.academy.lesson5;

import java.util.Scanner;

//1.Найти в массиве чисел элементы с наибольшим(max) и наименьшим(min) значениями. 
//Вывести эти 2 элемента на экран, а также посчитать и вывести сумму всех остальных элементов 
//(min и max в сумму не входят).
public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Введите числа: ");
		
		int max=10;
		int min=1;
	
		int array[] = new int[10];
		for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
		if (min > array[i]) {
			 min = array[i];
			}
		 if (max < array[i]){
             max = array[i];
         }
		 sc.close(); 
	}
	}	
}
//Integer.parseInt

