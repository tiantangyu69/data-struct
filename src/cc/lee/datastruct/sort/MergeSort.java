package cc.lee.datastruct.sort;

/**
 * 归并排序
 * 
 * @author lizhitao
 */
public class MergeSort {
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
		int[] tmpArray = new int[a.length];
		mergeSort(a, tmpArray, 0, a.length - 1);
	}

	private static void mergeSort(int[] a, int[] tmpArray, int left, int right) {
		if (left < right) {
			int center = (left + right) / 2;
			mergeSort(a, tmpArray, left, center);
			mergeSort(a, tmpArray, center + 1, right);
			merge(a, tmpArray, left, center + 1, right);
		}
	}

	private static void merge(int[] a, int[] tempArray, int leftPos,
			int rightPos, int rightEnd) {
		int leftEnd = rightPos - 1;
		int tmpPos = leftPos;
		int numElements = rightEnd - leftPos + 1;

		while (leftPos <= leftEnd && rightPos <= rightEnd)
			if (a[leftPos] <= a[rightPos])
				tempArray[tmpPos++] = a[leftPos++];
			else
				tempArray[tmpPos++] = a[rightPos++];

		while (leftPos <= leftEnd)
			tempArray[tmpPos++] = a[leftPos++];

		while (rightPos <= rightEnd)
			tempArray[tmpPos++] = a[rightPos++];

		for (int i = 0; i < numElements; i++, rightEnd--) {
			a[rightEnd] = tempArray[rightEnd];
		}
	}

	public static void main(String[] args) {
		printArray(SORT_ARR);
		sort(SORT_ARR);
		printArray(SORT_ARR);
	}
}
