package src.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IdenticalList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);

        if (IdenticalListUsingEquals(list1, list2)) {
            System.out.println(list1 + " & " + list2 + " are identical");
        } else {
            System.out.println("Not-identical lists");
        }

        if (isIdentical(list1, list2)) {
            System.out.println(list1 + " & " + list2 + " are identical");
        } else {
            System.out.println("Not-identical lists");
        }
    }

    //1. Using equals() Method (Built-in)
    public static boolean IdenticalListUsingEquals(List<Integer> list1, List<Integer> list2) {

        return list1.equals(list2);
    }


    public static boolean isIdentical(List<Integer> list1, List<Integer> list2) {

        if (list1.size() != list2.size()) {
            return false;
        }

        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
