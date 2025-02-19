package Sorting;

import java.util.Arrays;

public class BubbleSortEx {
    public static void main(String[] args) {
        int[] nums = {4 ,6, 1, 3, 2, 5};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubbleSort(int[] nums){
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
