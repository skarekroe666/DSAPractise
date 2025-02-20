package Sorting.SelectioSort;

public class SelectionSortProblem2 {
    public static void main(String[] args) {
        int[] nums = {10, 3, 5, 1, 9};
        int k = 2; // Find the 2nd smallest element
        System.out.println("Kth Smallest Element: " + findKthSmallest(nums, k));
    }

    static int findKthSmallest(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < k; i++) { // Only sort up to k elements
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
        return arr[k - 1]; // Kth smallest element
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
