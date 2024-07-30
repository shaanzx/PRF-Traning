package addInsertion;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] temp = new int[arr.length + 1];

        System.out.println("Input Value: ");
        int value = input.nextInt();

        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] >= value) {
                break;
            }
        }

        for (int j = 0; j < i; j++) {
            temp[j] = arr[j];
        }

        temp[i] = value;

        for (int j = i; j < arr.length; j++) {
            temp[j + 1] = arr[j];
        }
        System.out.println(Arrays.toString(temp));
    }
}
