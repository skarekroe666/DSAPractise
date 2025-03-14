package Pattern;

public class Pattern3 {
    public static void main(String[] args) {
        pattern28(4);
    }

    static void pattern5(int n){
        for (int i = 0; i < 2 * n; i++) {
            int totalCols = i > n ? 2 * n - i : i;
            for (int j = 0; j < totalCols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for (int i = 0; i < 2 * n; i++) {
            int totalCols = i > n ? 2 * n - i : i;

            int noOfSpaces = n - totalCols;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < totalCols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
