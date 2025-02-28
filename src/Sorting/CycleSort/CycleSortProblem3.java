package Sorting.CycleSort;
//https://leetcode.com/problems/find-the-duplicate-number/description/

public class CycleSortProblem3 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(cycleSort(arr));
    }
    static int cycleSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            if (arr[i] != i + 1){
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }else {
                    return arr[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
