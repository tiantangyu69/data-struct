package cc.lee.datastruct.sort;

public class Q2 {
	/**
	 * description : 快速排序
	 * @param pData
	 * @param left
	 * @param right
	 * @return
	 */
	static void quicksort(int n[], int left, int right) {
		int dp;
		if (left < right) {
			dp = partition(n, left, right);
			quicksort(n, left, dp - 1);
			quicksort(n, dp + 1, right);
		}
	}

	static int partition(int n[], int left, int right) {
		int pivot = n[left];
		while (left < right) {
			while (left < right && n[right] >= pivot)
				right--;
			if (left < right)
				n[left++] = n[right];
			while (left < right && n[left] <= pivot)
				left++;
			if (left < right)
				n[right--] = n[left];
		}
		n[left] = pivot;
		return left;
	}

	private static void sort(int[] a) {
		quicksort(a, 0, a.length - 1);
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 34, 545, 24, 4, 5, 35, 2342, 6, 3463, 343, 65,
				345, 3, 45, 3, 45, 3, 76, 54, 75, 68, 6767, 96, 89, 78, 4, 6,
				56, 4, 85 };
		printArray(a);
		sort(a);
		printArray(a);
	}
}
