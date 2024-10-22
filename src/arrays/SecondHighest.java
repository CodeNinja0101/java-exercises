package src.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class SecondHighest {

    public static void main(String[] args) {
        int[] num = {10, 2, 0, 20, 30, 4, 5, 50};
        findSecondHighUsingStream(num);
        findSecondHighUsingStream2(num);
    }

    public static void findSecondHighUsingStream(int[] num) {
        OptionalInt secondHigh = Arrays.stream(num)
                .distinct()
                .sorted()
                .skip(num.length - 2)
                .findFirst();

        if (secondHigh.isPresent()) {
            System.out.println("Second Highest Number: " + secondHigh.getAsInt());
        } else {
            System.out.println("No element present");
        }
    }


    public static void findSecondHighUsingStream2(int[] num) {
        Optional<Integer> secondHigh = Arrays.stream(num)
                .distinct()
                .boxed()
                .sorted((a, b) -> b.compareTo(a))
                .skip(1)
                .findFirst();

        if (secondHigh.isPresent()) {
            System.out.println("Second Highest Number: " + secondHigh);
        } else {
            System.out.println("No element present");
        }
    }
}
