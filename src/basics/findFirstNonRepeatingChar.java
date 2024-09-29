package src.basics;

import java.util.*;

//find the first non-repeated character in a string
public class findFirstNonRepeatingChar {

    public static void main(String[] args) {
        String input = "swiss";
        System.out.println("First non-repeated character: " + firstNonRepeatedCharUsingHashMap(input));

        System.out.println("First non-repeated character: " + firstNonRepeatedCharUsingLinkedHashMap(input));

        System.out.println("First non-repeated character: " + FirstNonRepeatedCharBruteForce(input));

        System.out.println("First non-repeated character: " + firstNonRepeatedCharUsingHashSet(input));

        System.out.println("First non-repeated character: " + firstNonRepeatedCharArray(input));
    }

    //    Using a HashMap
    public static char firstNonRepeatedCharUsingHashMap(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        // Step 1: Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        // Step 2: Find the first character with a count of 1
        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }
        return '\0'; // Return null character
    }

    //    Using a LinkedHashMap
    public static char firstNonRepeatedCharUsingLinkedHashMap(String str) {
        Map<Character, Integer> charCountLHMap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            charCountLHMap.put(c, charCountLHMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountLHMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }

    //    Using Arrays (Brute Force)
    public static char FirstNonRepeatedCharBruteForce(String str) {

        int length = str.length();

        for (int i = 0; i < length; i++) {
            boolean isRepeated = false;

            for (int j = 0; j < length; j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                return str.charAt(i);
            }
        }
        return '\0'; // Return null character if no non-repeated character is found
    }

    //    Using a Set for Checking Duplicates
    public static char firstNonRepeatedCharUsingHashSet(String str) {
        HashSet<Character> repeated = new HashSet<>();
        LinkedHashSet<Character> nonRepeated = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            if (repeated.contains(c)) {
                continue;
            }
            if (nonRepeated.contains(c)) {
                nonRepeated.remove(c);
                repeated.add(c);
            } else {
                nonRepeated.add(c);
            }
        }
        return nonRepeated.isEmpty() ? '\0' : nonRepeated.iterator().next();
    }

    //    Using Character Array and IndexOf
    public static char firstNonRepeatedCharArray(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                return c;
            }
        }
        return '\0'; // Return null character if no non-repeated character is found
    }
}

