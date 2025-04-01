package Recursion.Problems;

public class UppercaseLetter {
    public static void main(String[] args) {
        String str = "geeksForgeeKS";

        char result = findUppercase(str, 0);

        if (result != '\0') {
            System.out.println("First uppercase letter: " + result);
        } else {
            System.out.println("No uppercase letter found");
        }
    }

    static char findUppercase(String str, int i) {
        // Base case: if i reaches end, return '\0' (null character)
        if (i == str.length()) {
            return '\0';
        }

        // If current character is uppercase, return it
        if (Character.isUpperCase(str.charAt(i))) {
            return str.charAt(i);
        }

        return findUppercase(str, i + 1);
    }
}
