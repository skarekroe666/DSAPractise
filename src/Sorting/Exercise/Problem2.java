package Sorting.Exercise;
//https://leetcode.com/problems/majority-element/

import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    static int majorityElement(int[] nums) {
        bubble(nums);
        return nums[nums.length / 2]; // Middle element is always the majority
    }

    static void bubble(int[] nums) {
        boolean isSwapped;

        //run the steps n - 1 times
        for (int i = 0; i < nums.length; i++) {
            isSwapped =false;
            //for each step, max item will come at the last respective index
            for (int j = 1; j < nums.length - i; j++) {
                //swap if the item is smaller than the previous item
                if (nums[j] < nums[j -1]){
                    int temp = nums[j];                                 //swap
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped){
                break;
            }
        }
    }
}
