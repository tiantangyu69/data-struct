package cc.lee.datastruct.sort;

/**
 * 希尔排序
 * 
 * @author lizhitao
 */
public class ShellSort {
	public static final int[] SORT_ARR = new int[] { 1, 22, 3898, 54, 5, 45,
			3453, 4534, 345, 368, 345, 366, 54, 45, 2, 542, 5, 235, 23, 52, 35,
			25, 4567, 467, 5, 86, 78, 12, 348, 997, 45, 678, 343, 223, 568, 2,
			68675, 345345, 87, 345, 85, 356, 34, 23, 87, 9, 89, 89, 89, 456,
			456, 2345, 857, 678, 578, 44, 67, 245, 7588, 3463, 67, 345, 7878,
			2354, 6, 9045, 898, 57, 69567, 345, 234, 87, 345, 789, 0, 3 };

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	private static void sort(int[] a) {
		int j;
		for (int gap = a.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < a.length; i++) {
				int tmp = a[i];
				for (j = i; j >= gap && tmp < a[j - gap]; j -= gap)
					a[j] = a[j - gap];
				a[j] = tmp;
			}
		}
	}

	public static void main(String[] args) {
		printArray(SORT_ARR);
		sort(SORT_ARR);
		printArray(SORT_ARR);
	}
}
