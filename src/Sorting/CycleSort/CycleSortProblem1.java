package Sorting.CycleSort;

//https://leetcode.com/problems/missing-number/description/

import java.util.Arrays;

public class CycleSortProblem1 {
    public static void main(String[] args) {
//        int[] arr = {3, 0, 1};
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }

//    static int missingNumber(int[] arr){
//        int i = 0;
//        while (i < arr.length) {
//            int correct = arr[i];
//            if (arr[i] < arr.length && arr[i] != arr[correct]) {
//                swap(arr, i, correct);
//            } else {
//                i++;
//            }
//        }
//
//        for (int index = 0; index < arr.length; index++) {
//            if (arr[index] != index){
//                return index;
//            }
//        }
//        return arr.length;
//    }
//
//    static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

    static int missingNumber(int[] arr) {
        int n = arr.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
