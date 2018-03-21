package by.epam.tr.start;

import java.util.Random;
import java.util.Scanner;

public class DivisibleK {
	
	public static void main(String[] args) {
		int[] a = new int[10];

		enterArrayWithRandom(a);
		printArray(a);

	}

	public static void enterArrayWithRandom(int[] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(44);
		}
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]=" + a[i] + ";");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите k: ");
		int k = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % k == 0) {
				sum += a[i];
				System.out.println("Сумма чисел кратных k : " + sum); // не получается вывести только один единственный
																	//конечный результат без вывода приращений :(

			}
		}
	}
}
