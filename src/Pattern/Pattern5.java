package Pattern;

public class Pattern5 {
    public static void main(String[] args) {
        pattern31(4);
    }

    static void pattern31(int n) {
        int ogN = n;
        n *= 2;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int atEveryIndex = Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
