package src.collections;

import java.util.*;
import java.util.stream.IntStream;

public class IdenticalList {
    public IdenticalList() {
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> list01 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list02 = Arrays.asList(5, 4, 3, 2, 1);  // Elements in different order

        if (IdenticalListUsingEquals(list1, list2)) {
            System.out.println(" " + list1 + " & " + list2 + " are identical");
        } else {
            System.out.println("Not-identical lists");
        }

        if (isIdentical(list1, list2)) {
            System.out.println(" " + list1 + " & " + list2 + " are identical");
        } else {
            System.out.println("Not-identical lists");
        }

        if (areIdenticalUsingSet(list1, list2)) {
            System.out.println(list1 + " & " + list2 + " are identical");
        } else {
            System.out.println("Not-identical lists");
        }

        identicalListUsingContainsAll(list01, list02);


        if (areIdenticalUsingStream(list01, list02)) {
            System.out.println(list1 + " & " + list2 + " are identical");
        } else {
            System.out.println("Not-identical lists");
        }

        if (Objects.deepEquals(list1, list2)) {
            System.out.println(list1 + " & " + list2 + " are identical");
        } else {
            System.out.println("Not-identical lists");
        }
    }

    public static boolean IdenticalListUsingEquals(List<Integer> list1, List<Integer> list2) {
        return list1.equals(list2);
    }


    public static boolean isIdentical(List<Integer> str1, List<Integer> str2) {
        if (str1.size() != str2.size()) {
            return false;
        }

        for (int i = 0; i < str1.size(); i++) {
            if (!str1.get(i).equals(str2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean areIdenticalUsingSet(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        return set1.equals(set2);  // Ignores order but checks if both sets are the same
    }


    public static void identicalListUsingContainsAll(List<Integer> list01, List<Integer> list02) {
        if (list01.containsAll(list02) && list02.containsAll(list01)) {
            System.out.println(list01 + " & " + list02 + " are identical");
        } else {
            System.out.println("Not-identical lists");
        }
    }

    public static boolean areIdenticalUsingStream(List<Integer> list01, List<Integer> list02) {
        if (list01.size() != list02.size()) {
            return false;
        }

        return IntStream.range(0, list01.size())
                .allMatch(i -> list01.get(i).equals(list02.get(i)));
    }
}