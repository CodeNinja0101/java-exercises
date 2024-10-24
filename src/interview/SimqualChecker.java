package src.interview;

import java.util.HashMap;
import java.util.Map;

public class SimqualChecker {
    public static void main(String[] args) {
        // Test cases
        checkSimqual("ACAB", "XCXY"); // Output: simqual
        checkSimqual("ACAB", "XCXC"); // Output: not simqual
        checkSimqual("ACAB", "XCCY"); // Output: not simqual
        checkSimqual("ACAB", "XCX");  // Output: not simqual
    }

    public static void checkSimqual(String s, String t) {
        if (s.length() != t.length()) {
            System.out.println("Not Simqual");
            return;
        }

        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (mapS.containsKey(charS)) {
                if (mapS.get(charS) != charT) {
                    System.out.println("Not Simqual");
                    return;
                }
            } else {
                mapS.put(charS, charT);
            }

            if (mapT.containsKey(charT)) {
                if (mapT.get(charT) != charS) {
                    System.out.println("Not Simqual");
                    return;
                }
            } else {
                mapT.put(charT, charS);
            }
        }
        System.out.println("Simqual");
    }
}
