package src.interview;

import java.util.*;
import java.util.stream.Collectors;

public class SecondHigh {
    public static void main(String[] args) {
        int[] numbs = {1, 2, 3, 4, 5, 6, 7};
        usingStreamApi(numbs);
        usingForLoop(numbs);
        usingSet(numbs);
    }

    public static void usingStreamApi(int[] numbs) {
        Optional<Integer> secHigh = Arrays.stream(numbs)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        secHigh.ifPresent(System.out::println);
    }


//    public static void usingStreamApi(int[] numbs){
//        Optional<Integer> secHigh = Arrays.stream(numbs)
//                .distinct()
//                .boxed()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst();
//        System.out.println(secHigh);
//        secHigh.ifPresent(n-> System.out.println(n));
//    }

    public static void usingForLoop(int[] numbs) {
        if (numbs.length < 2) {
            System.out.println("Not enough elements");
            return;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : numbs) {
            if (num > first) {
                second = first;
                first = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second highest element");
        } else {
            System.out.println("second highest: " + second);
        }
    }


    public static void usingSet(int[] numbs) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : numbs) {
            uniqueNumbers.add(num);
        }

        List<Integer> sortedList = new ArrayList<>(uniqueNumbers);
        Collections.sort(sortedList);

        if (sortedList.size() < 2) {
            System.out.println("Not enough unique elements");
        } else {
            System.out.println(sortedList.get(sortedList.size() - 2));
        }
    }
}
