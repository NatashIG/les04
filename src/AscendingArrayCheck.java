package by.epam.tr.array;

public class AscendingArrayCheck {

	public static void main(String[] args) {
		int[] a = new int[] { 20, 27, 40, 64, 73, 90, 105, 487, 701, 1000 };
		boolean flag = true;
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) {
				flag = false;
				break;
			}
		}

		if (flag == false) {
			System.out.println("Последовательность не является возрастающей");
		} else {
			System.out.println("Последовательность является возрастающей");
		}

	}
}