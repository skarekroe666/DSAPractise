package Sorting.BubbleSort;

public class BubbleSortProblem1 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        System.out.println(bubbleSort(arr));
    }

    static int bubbleSort(int[] arr){

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    count++;
                }
            }
        }
        return count;
    }
}
