package src.basics;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = 1234567;
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println(reverse);
    }
}
