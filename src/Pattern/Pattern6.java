package Pattern;

public class Pattern6 {
    public static void main(String[] args) {
        pattern6(4);
    }

    static void pattern6(int n){
        for (int i = 1; i <= n; i++) {
//            int totalCols = i > n ? 2 * n - i : i;

            int noOfSpaces = n - i;
            for (int s = 0; s <= noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
