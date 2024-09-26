package src.basics;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int num = 153;
        if (isArmstrongNumber(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

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
}
