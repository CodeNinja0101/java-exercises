package src.interview;

import java.util.*;

//Create a Java program that prompts the user to input a month number (1-12) and outputs the corresponding month name
// (1 = January, 2 = February). If the input is outside the valid range, display an error message indicating that
// invalid input.The program should handle user input and provide appropriate feedback based on the entered number.
public class MonthNameDisplay {
    public static final String INVALID_MONTH_MESSAGE = "Invalid month number. Please enter a number between 1 and 12.";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a month number (1-12 -Switch): ");
        int monthNumber1 = sc.nextInt();
        System.out.println("Using Switch-Case: " + usingSwitchCase(monthNumber1));


        System.out.println("Enter a month number (1-12 -Array): ");
        int monthNumber2 = sc.nextInt();
        System.out.println("Using Array: " + usingArray(monthNumber2));


        System.out.println("Enter a month number (1-12 -List): ");
        int monthNumber3 = sc.nextInt();
        System.out.println("Using List: " + usingList(monthNumber3));


        System.out.println("Enter a month number (1-12 -Map): ");
        int monthNumber4 = sc.nextInt();
        System.out.println("Using Map: " + usingMap(monthNumber4));

        sc.close();
    }

    public static String usingSwitchCase(int monthNumber) {
        return switch (monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> INVALID_MONTH_MESSAGE;
        };
    }

    public static String usingArray(int monthNumber) {
        String[] months = {INVALID_MONTH_MESSAGE, "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        if (monthNumber < 1 || monthNumber > 12) {
            return months[0];
        }
        return months[monthNumber];
    }

    public static String usingList(int monthNumber) {
        List<String> months = new ArrayList<>();
        months.add(INVALID_MONTH_MESSAGE);
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        if (monthNumber < 0 || monthNumber > 12) {
            return months.get(0);
        }
        return months.get(monthNumber);
    }


    public static String usingMap(int monthNumber) {
        Map<Integer, String> months = new HashMap<>();
        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December");
        return months.getOrDefault(monthNumber, INVALID_MONTH_MESSAGE);
    }
}
