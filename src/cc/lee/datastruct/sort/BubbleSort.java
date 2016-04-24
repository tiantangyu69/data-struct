package cc.lee.datastruct.sort;

/**
 * @author lizhitao 冒泡排序
 */
public class BubbleSort {
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
		/*int temp = 0;
		for (int i = a.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (a[j + 1] < a[j]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}*/
		
		/*for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}*/
		
		int temp;  
        // 第一层循环： 表明要比较的次数，比如list.count个数，肯定要比较count-1次  
        for (int i = 0; i < a.length - 1; i++) {  
            // list.count-1：取数据最后一个数下标，  
            // j>i: 从后往前的的下标一定大于从前往后的下标，否则就超越了。  
            for (int j = a.length - 1; j > i; j--) {  
                // 如果前面一个数大于后面一个数则交换  
                if (a[j - 1] > a[j]) {  
                    temp = a[j - 1];  
                    a[j - 1] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
	}

	public static void main(String[] args) {
		printArray(SORT_ARR);
		sort(SORT_ARR);
		printArray(SORT_ARR);
	}
}
