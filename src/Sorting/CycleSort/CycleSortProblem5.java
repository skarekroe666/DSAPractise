package Sorting.CycleSort;

import java.util.Arrays;

public class CycleSortProblem5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            // Swap only if the number is not in the correct position and no duplicate exists
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Now, find the missing and duplicate numbers
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[] {nums[index], index + 1}; // {duplicate, missing}
            }
        }
        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
