package src.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Given an array of integers and a target integer,
// find the indices of the two numbers in the array that add up to the target.
public class TargetSum {
    public static void main(String[] args) {
        int target = 25;
        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15};
        int[] result = findTargetSum(target, numArray);
        System.out.println("The targeted sum is: " + target + " and " + "indexes: " + Arrays.toString(result));

        int[] res = getSumUsingHashMap(numArray, target);
        System.out.println("The targeted sum is: " + target + " and " + "indexes: " + Arrays.toString(res));

    }

    public static int[] findTargetSum(int target, int[] numArray) {

        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                if (numArray[i] + numArray[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int[] getSumUsingHashMap(int[] numArray, int target) {
        Map<Integer, Integer> resMap = new HashMap<>();
        for (int i = 0; i < numArray.length; i++) {
            int temp = numArray[i] - target;
            if (resMap.containsKey(temp)) {
                return new int[]{resMap.get(temp), i};
            }
            resMap.put(numArray[i], i);
        }
        return null;
    }
}
