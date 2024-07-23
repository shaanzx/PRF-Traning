package insertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Number: ");
        int number = input.nextInt();

        int[] arr = { 5,9,10,7,1,6,4,3,2,8};
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                int temp = arr[i];
                int j = i - 1;

                while (j >= 0 && temp < arr[j]) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = temp;
            System.out.println(Arrays.toString(arr));
            }
        }
    }
}
