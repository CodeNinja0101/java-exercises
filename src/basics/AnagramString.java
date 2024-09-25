package src.basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramString {

    public static void main(String[] args) {
//        String str1 = "Silent is the List";
//        String str2 = "Listen to the Silent";
        String str1 = "A gentleman";
        String str2 = "Elegant man";

        if (checkAnagramStrings(str1, str2)) {
            System.out.println(str1 + " & " + str2 + "\n- are anagram");
        } else {
            System.out.println("Not Anagram");
        }

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " & " + str2 + "\n- are anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

    //Using Sorting Approach
    public static boolean checkAnagramStrings(String str1, String str2) {

        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    //using HashMap Approach
    public static boolean isAnagram(String str1, String str2) {
//        Map<Character, Integer> map = new HashMap<>();
//
//        str1 = str1.replaceAll("\\s+", "").toLowerCase();
//        str2 = str2.replaceAll("\\s+", "").toLowerCase();
//
//        if (str1.length() != str2.length()) {
//            return false;
//        }
//        for (char c : str1.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//
//        for (char c : str2.toCharArray()) {
//            if (!map.containsKey(c) || map.get(c) ==0)
//                return false;
//            map.put(c,map.get(c)-1);
//        }
//return true;
//    }


        Map<Character, Integer> map = new HashMap<>();

        str1 = str1.replaceAll("\\s+","").toLowerCase();
        str2 = str2.replaceAll("\\s+","").toLowerCase();

        if (str1.length() != str2.length()){
        return false;
        }

        for(char c : str1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (char c : str2.toCharArray()){
            if (!map.containsKey(c) || map.get(c) ==0)
                return false;
            map.put(c, map.get(c)-1);
        }
        return true;
    }
}
