package src.interview;

import java.util.Arrays;
import java.util.List;

//You are given a list of integers and a single digit. Write a program to count
//how many times the given digit appears across all the integers in the list.
public class CountAppearance {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10, 12, 22, 222, 2002, 52, 51);
        int digit = 2;

        int finalCount = countAppearanceOfNumbers(integerList, digit);
        System.out.println(digit + " is repeated: " + finalCount + " times");
    }

    public static int countAppearanceOfNumbers(List<Integer> integerList, int digit) {
        int count = 0;

        for (int num : integerList) {
            while (num > 0) {
                int lastDigit = num % 10;
                if (lastDigit == digit) {
                    count++;
                }
                num /= 10;
            }
        }
        return count;
    }
}
