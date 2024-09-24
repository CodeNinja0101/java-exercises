package src.arrays;

import java.util.*;
import java.util.stream.Collectors;

//Reverse the given array using streams
public class ReverseArray {
    public static void main(String[] args) {
        int[] basicArray = {1, 2, 3, 4, 5, 6, 7};

        reverseUsingSwapping(basicArray);
        reverseInputArray();
        List<Integer> numArray = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        reverseArrayUsingStreams(numArray);
        reverseArrayUsingList(numArray);
    }

//    using while loop and swapping numbers

    public static void reverseUsingSwapping(int[] basicArray) {
        int start = 0;
        int end = basicArray.length - 1;

        while (start < end) { //0 , 7
            int temp = basicArray[start]; //0
            basicArray[start] = basicArray[end]; //7
            basicArray[end] = temp; //0
            start++;
            end--;
        }

//        for (int num : basicArray) {
//            System.out.print(num + " ");
//        }
        System.out.println("Reversed using swapping: " + Arrays.toString(basicArray));
    }

//Using for loop and new array

    public static void reverseInputArray() {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] reverse = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length - 1 - i];

        }
        System.out.println("Reversed using new array: " + Arrays.toString(reverse));
    }

//Using streams and Collectors method

    public static void reverseArrayUsingStreams(List<Integer> numArray) {


        List<Integer> reverseStream = numArray.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Reversed using streams: " + reverseStream);

        //or

        List<Integer> revArray = numArray.stream()
                .collect(Collectors.toCollection(LinkedList::new));
        Collections.reverse(revArray);
        System.out.println("Reversed using streams: " + reverseStream);
    }

//Using List and Collections method

    public static void reverseArrayUsingList(List<Integer> numArray) {
        List<Integer> revArr = new LinkedList<>(numArray);
        Collections.reverse(revArr);
        System.out.println("Reversed using streams: " + revArr);
    }
}
