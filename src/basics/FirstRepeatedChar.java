package src.basics;

import java.util.HashSet;

public class FirstRepeatedChar {
    public static void main(String[] args) {
        String str = "java2java";

        System.out.println("First Repeated Character: " + firstRepeatedCharacter(str));
        System.out.println("First Repeated Character: " + firstRepeatedCharacter1(str));
    }

    public static char firstRepeatedCharacter(String str) {
        int l = str.length();
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return str.charAt(i);
                }
            }
        }
        return '\0';
    }
//}


//class FirstRepeatingCharacter {
//    // Step 1: Brute-force solution to find the first repeating character
//    public static char firstRepeatingChar(String str) {
//        int n = str.length();
//
//        // Step 2: Nested loop to compare each character with all subsequent characters
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (str.charAt(i) == str.charAt(j)) {
//                    return str.charAt(i);  // Step 3: Return the first repeating character
//                }
//            }
//        }
//        return '\0';  // Return null character if no repeating character found
//    }
//
//    public static void main(String[] args) {
//        String input = "JAVAJ2EE";
//        char result = firstRepeatingChar(input);
//        System.out.println("First Repeating Character: " + result);
//    }
//}




//
//public class FirstRepeatedChar {
//    public static void main(String[] args) {
//        String str = "java2java";
//        System.out.println("First Repeated Character: " + firstRepeatedCharacter(str));
//    }
//
    public static char firstRepeatedCharacter1(String str) {
        HashSet<Character> seenChars = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (seenChars.contains(c)) {
                return c;
            }
            seenChars.add(c);
        }
        return '\0'; // Return null character if no repeated character is found
    }
}
