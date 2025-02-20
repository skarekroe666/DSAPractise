package Sorting.SelectioSort;

import java.util.Arrays;

public class SelectionSortProblem1 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 1, 5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int last = arr.length - i - 1;
            int maxIndex = getLowest(arr, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int getLowest(int[] arr, int end) {
        int low = 0;
        for (int i = 1; i <= end; i++) {
            if (arr[i] < arr[low]) {
                low = i;
            }
        }
        return low;
    }
}
