package src.basics;

import java.util.stream.IntStream;

//checking if a string is a palindrome
public class PalindromeString {
    public static void main(String[] args) {

        System.out.println(isPalindromeStringBuilder("madam")); // true
        System.out.println(isPalindromeStringBuilder("hello")); // false

        System.out.println(isPalindromeTwoPoint("madam")); // true
        System.out.println(isPalindromeTwoPoint("hello")); // false

//        System.out.println(isPalindromeStreamAPI("madam")); // true
//        System.out.println(isPalindromeStreamAPI("hello"));
    }

    public static boolean isPalindromeStringBuilder(String s) {
        StringBuilder reversed = new StringBuilder(s).reverse();
        return s.equalsIgnoreCase(reversed.toString());
    }
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }

    //    Two-Pointer Approach (Optimal)
    public static boolean isPalindromeTwoPoint(String s) {
        s = s.toLowerCase(); // Case-insensitive comparison
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //    Using Stream API
//    public static boolean isPalindromeStreamAPI(String s) {
//        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        return IntStream.range(0, s.length() / 2)
//                .allMatch(i -> s.charAt(i) == s.charAt(s.length() - i - 1));
//    }
}
