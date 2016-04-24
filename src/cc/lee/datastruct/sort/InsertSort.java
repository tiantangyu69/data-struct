package cc.lee.datastruct.sort;

/**
 * 插入排序
 * 
 * @author lizhitao
 */
public class InsertSort {
	public static final int[] SORT_ARR = new int[] { 1, 22, 3898, 54, 5, 45,
			3453, 4534, 345, 368, 345, 366, 54, 45, 2, 542, 5, 235, 23, 52, 35,
			25, 4567, 467, 5, 86, 78, 12, 348, 997, 45, 678, 343, 223, 568, 2,
			68675, 345345, 87, 345, 85, 356, 34, 23, 87, 9, 89, 89, 89, 456,
			456, 2345, 857, 678, 578, 44, 67, 245, 7588, 3463, 67, 345, 7878,
			2354, 6, 9045, 898, 57, 69567, 345, 234, 87, 345, 789, 0, 3 };

	private static void sort(int[] array) {
		/*for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}*/
		 
		int j;
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			for (j = i; j > 0 && temp < array[j - 1]; j--)
				array[j] = array[j - 1];
			array[j] = temp;
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printArray(SORT_ARR);
		sort(SORT_ARR);
		printArray(SORT_ARR);
	}
}
