package Pattern;

public class Pattern4 {
    public static void main(String[] args) {
        pattern17(5);
    }

    static void pattern30(int n) {
        for (int i = 1; i <= n; i++) {

            for (int s = 0; s < n - i; s++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int i = 1; i <= 2 * n; i++) {

            int totalCols = i > n ? 2 * n - i : i;

            for (int space = 0; space < n - totalCols; space++) {
                System.out.print(" ");
            }

            for (int j = totalCols; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= totalCols; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
