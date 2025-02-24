package Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSortEx {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 2, 5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean isSwapped;

        //run the steps n - 1 times
        for (int i = 0; i < arr.length; i++) {
            isSwapped =false;
            //for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than the previous item
                if (arr[j] < arr[j -1]){
                    int temp = arr[j];                                 //swap
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped){
                break;
            }
        }
    }
}
