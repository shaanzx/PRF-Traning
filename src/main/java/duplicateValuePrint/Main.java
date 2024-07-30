package duplicateValuePrint;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {2, 5, 4, 6, 2, 4, 9, 8, 1, 8, 3, 5};

        while(true) {
            System.out.println("Input a value: ");
            int value = input.nextInt();

            String index = "";
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    index = index + i + " ,";
                    count++;
                    if (count > 1) {
                        System.out.println(value + " is duplicated and its index is: " + index + "\b");
                    }
                }
            }

            if (count == 1) {
                System.out.println(value + " not duplicate and at index: " + index +"\b\b");
            } else if (count == 0) {
                System.out.println(value + " not found in the array.");
            }
        }
    }
}
