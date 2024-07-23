package searchArrayIndex;

import java.util.Scanner;

public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        Scanner input = new Scanner(System.in);
        System.out.print("Input value: ");
        int value = input.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                System.out.println(ANSI_BLUE + "Value index is " + i + ANSI_RESET);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(ANSI_RED + "Value is not found." + ANSI_RESET);
        }
    }
}
