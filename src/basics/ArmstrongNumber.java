package src.basics;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int num = 153;
        if (isArmstrongNumber(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }


        if (identifyArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }


    //Using Brute Force Approach
    public static boolean isArmstrongNumber(int num) {
        int sum = 0;
        int originalNum = num;
        int count = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, count);
            num /= 10;
        }
        return originalNum == sum;
    }

    //Using List

    public static boolean identifyArmstrong(int num) {

        List<Integer> digits = new ArrayList<>();
        int temp = num;

        while (temp > 0) {
            digits.add(temp % 10);
            temp /= 10;
        }
        int sum = 0;
        int digitCount = digits.size();

        for (int digit : digits) {
            sum += Math.pow(digit, digitCount);

        }

        return sum == num;
    }
}
