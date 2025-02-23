package Sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSortProblem2 {
    public static void main(String[] args) {
        int[] arr = {2, 9, 4, 1, 5};
//        int[] arr = {10, 3, 5, 1, 9};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] > arr[j -1]){
                    swap(arr, j, j - 1);
                }else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
