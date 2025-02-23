package Sorting.InsertionSort;

public class InsertionSortProblem4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr = {5, 3, 4, 1, 2};
        System.out.println(insertion(arr));
    }

    static boolean insertion(int[] arr){
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j -1]){
                    swap(arr, j, j - 1);
                    isSorted = false;
                }else {
                    break;
                }
            }
        }
        return isSorted;
    }

//    static boolean insertion(int[] arr) {
//        boolean isSorted = true;
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < arr[i - 1]) {
//                isSorted = false; // At least one swap is needed
//            }
//
//            // Perform insertion sort step
//            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
//                swap(arr, j, j - 1);
//            }
//        }
//        return isSorted; // Returns true if the array was sorted from the start
//    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
