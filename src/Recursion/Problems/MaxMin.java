package Recursion.Problems;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, -50, 10, 2};
        int n = arr.length;

        System.out.println("Minimum number is: " + findMin(arr, n));
        System.out.println("Maximum number is: " + findMax(arr, n));
    }

    static int findMin(int[] arr, int n){
        if (n == 1){
            return arr[0];
        }
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }

    static int findMax(int[] arr, int n){
        if (n == 1){
            return arr[0];
        }
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }
}
