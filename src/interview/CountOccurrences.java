package src.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrences {
    public static void main(String[] args) {
        String[] items = {"pen", "eraser", "notebook", "pen", "pencil", "notebook"};

        System.out.println("Using HashMap:");
        countWithHashMap(items);

        System.out.println("\nUsing Streams:");
        countWithStreams(items);

//        System.out.println("\nUsing Simple Array:");
//        countWithSimpleArray(items);
    }

    //    Using HashMap
    public static void countWithHashMap(String[] items) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String item : items) {
            wordCount.put(item, wordCount.getOrDefault(item, 0) + 1);
        }
        wordCount.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    //    Using Streams
    public static void countWithStreams(String[] items) {
        Map<String, Long> wordCount = Arrays.stream(items)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        wordCount.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    //    Using Simple Array
//    public static void countWithSimpleArray(String[] items) {
//        String[] uniqueItems = {"pen", "eraser", "notebook", "pencil"};
//        int[] counts = new int[uniqueItems.length];
//
//        for (String item : items) {
//            for (int i = 0; i < uniqueItems.length; i++) {
//                if (item.equals(uniqueItems[i])) {
//                    counts[i]++;
//                }
//            }
//        }
//        for (int i = 0; i < uniqueItems.length; i++) {
//            System.out.println(uniqueItems[i] + ": " + counts[i]);
//        }
//    }
}
