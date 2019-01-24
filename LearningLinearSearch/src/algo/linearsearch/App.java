package algo.linearsearch;

public class App {

	public static void main(String[] args) {
		int[] array = { 1, 5, 7, 4, 2, 8, 12, 55, 75, 23, 67 };
		System.out.println(linearSearch(array, 23));
	}

	public static int linearSearch(int[] array, int value) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}

}
