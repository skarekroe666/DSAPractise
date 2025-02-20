package Sorting.BubbleSort;

public class BubbleSortProblem2 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
//        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(bubbleSort(arr));
    }

    static boolean bubbleSort(int[] arr) {
        boolean isSwapped;
        boolean isSorted = true; // Assume it's sorted

        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped = true;
                    isSorted = false; // If swapping occurs, it was not sorted
                }
            }
            if (!isSwapped) {
                break; // No swaps means it's sorted, exit early
            }
        }
        return isSorted;
    }
}
