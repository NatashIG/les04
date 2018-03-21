package by.epam.tr.array;

import java.util.Arrays;

public class NewArray {

	public static void main(String[] args) {
		int[] a = new int[] { 2, 7, 0, 6, 3, 0, 1, 4, 7, 0 };
		String str = "";
		for (int i = 1; i < a.length; i++) {
			if (a[i] == 0) {
				str = str + i + '-';
			}
		}
		String[] array = str.split("-");
		System.out.println(Arrays.toString(array));
	}
}



