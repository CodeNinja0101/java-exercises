package src.interview;

import java.util.ArrayList;
import java.util.List;

//Given an array of integers (both positive and negative), find the contiguous subarray
//(containing at least one number) which has the largest sum and return the sum of that subarray.
public class MaxSubArraySum {
    public static List<Object> findMax(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0;
        int tempStart = 0;
        int end = 0;

        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            // Reset currentSum if it goes negative, but only if all elements are not negative
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        // Special case for arrays where all numbers are negative
        if (maxSum == Integer.MIN_VALUE) {
            maxSum = array[0];
            start = 0;
            end = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maxSum) {
                    maxSum = array[i];
                    start = end = i;
                }
            }
        }

        // Prepare result with maxSum and subarray indices
        List<Object> result = new ArrayList<>();
        result.add(maxSum); // The maximum sum
        result.add(start);  // The starting index of the subarray
        result.add(end);    // The ending index of the subarray

        return result;
    }

    public static void main(String[] args) {
        // Test with both positive and negative numbers
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        List<Object> result = findMax(arr);

        int maxSum = (int) result.get(0);
        int startIndex = (int) result.get(1);
        int endIndex = (int) result.get(2);

        System.out.println("Maximum Sum: " + maxSum);
        System.out.print("Subarray with the maximum sum: ");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(arr[i] + " ");
        }

        // Test with an array of all negative numbers
        System.out.println("\n\nTest with all negative numbers:");
        int[] negativeArr = {-5, -2, -3, -4, -1};
        result = findMax(negativeArr);

        maxSum = (int) result.get(0);
        startIndex = (int) result.get(1);
        endIndex = (int) result.get(2);

        System.out.println("Maximum Sum: " + maxSum);
        System.out.print("Subarray with the maximum sum: ");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(negativeArr[i] + " ");
        }
    }
}

