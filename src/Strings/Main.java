package Strings;

public class Main {
    public static void main(String[] args) {
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < 26; i++) {
//            char ch = (char) ('a' + i);
//            builder.append(ch);
//        }
//        System.out.println(builder);

        String str = "abceba";
        System.out.println(palindrome(str));
    }

    static boolean palindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end){
            if (text.charAt(start) == text.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }
}
