package cc.lee.datastruct.sort;

/**
 * 快速排序
 * 
 * @author lizhitao
 */
public class QuickSort {
	public static final int[] SORT_ARR = new int[] { 22, 1, 55, 98, 88, 33, 4,
			5435, 3443, 99 };

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	private static void sort(int[] a) {
		quickSort(a, 0, a.length - 1);
	}

	private static int median3(int[] a, int left, int right) {
		int center = (left + right) / 2;
		if (a[center] < a[left])
			swapReferences(a, left, center);

		if (a[right] < a[left])
			swapReferences(a, left, right);

		if (a[right] < a[center])
			swapReferences(a, center, right);

		swapReferences(a, center, right - 1);
		return a[right - 1];
	}

	private static void swapReferences(int[] a, int left, int right) {
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}

	private static void quickSort(int[] a, int left, int right) {
		int pivot = median3(a, left, right);

		int i = left + 1;
		int j = right;

		for (;;) {
			while (a[i] < pivot) {
				i++;
			}
			while (a[j] > pivot) {
				j--;
			}
			if (i < j)
				swapReferences(a, i, j);
			else
				break;
		}

		swapReferences(a, i, right - 1);

		quickSort(a, left, i - 1);
		quickSort(a, i + 1, right);
	}

	public static void main(String[] args) {
		printArray(SORT_ARR);
		sort(SORT_ARR);
		printArray(SORT_ARR);
	}

}
