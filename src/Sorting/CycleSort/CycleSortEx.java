package Sorting.CycleSort;

import java.util.Arrays;

public class CycleSortEx {
    public static void main(String[] args) {
//        int[] arr = {10, 3, 5, 1, 9};
        int[] arr = {4, 1, 3, 5, 2};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
