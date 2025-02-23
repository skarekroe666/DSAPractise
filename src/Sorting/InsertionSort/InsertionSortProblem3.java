package Sorting.InsertionSort;

public class InsertionSortProblem3 {
    public static void main(String[] args) {
//        int[] arr = {3, 1, 2};
        int[] arr = {2, 9, 4, 1, 5};
        System.out.println(insertion(arr));
    }

    static int insertion(int[] arr) {
        int count = 0; // Count swaps

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    count++; // Count every swap
                } else {
                    break;
                }
            }
        }
        return count;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
