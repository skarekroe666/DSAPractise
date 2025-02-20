package Sorting.SelectioSort;

import java.util.Arrays;

public class SelectionSortEx {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 3, 2, 5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int last = arr.length - i - 1;
            int maxIndex = getMax(arr, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int getMax(int[] arr, int end) {
        int max = 0;
        for (int i = 1; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
