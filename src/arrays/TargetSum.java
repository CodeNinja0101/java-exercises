package src.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Given an array of integers and a target integer,
// find the indices of the two numbers in the array that add up to the target.
public class TargetSum {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int[] result = sumOfNumbers(num, target);
        if (result != null) {
            System.out.println("Indexes (usingBruteForce): " + Arrays.toString(result));
        } else {
            System.out.println("Element is not present");
        }

        int[] indexes = usingHashMap(num, target);
        if (indexes != null) {
            System.out.println("Indexes (usingHashMap): " + Arrays.toString(indexes));
        } else {
            System.out.println("Element is not present");
        }
    }


    //    Using Brute force Approach
    public static int[] sumOfNumbers(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


    //Using HashMap Approach
    public static int[] usingHashMap(int[] num, int target) {
        Map<Integer, Integer> revMap = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int temp = target - num[i];
            if (revMap.containsKey(temp)) {
                return new int[]{revMap.get(temp), i};
            }
            revMap.put(num[i], i);
        }
        return null;
    }


}