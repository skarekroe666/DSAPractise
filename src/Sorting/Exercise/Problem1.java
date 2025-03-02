package Sorting.Exercise;
//https://leetcode.com/problems/first-missing-positive/

public class Problem1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0};
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                return index + 1;
            }
        }
        return arr.length + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
