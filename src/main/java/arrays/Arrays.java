package arrays;

import java.util.Scanner;

/*
    SearchLeaner Algorithm
 */
public class Arrays {
    public static void main(String[] args) {
        int[] num = {10, 2, 5, 7, 4, 9};

        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("Input the number: ");
            int number = input.nextInt();

            // Search array
            for (int i = 0; i < num.length; i++) {
                if (number == num[i]) {
                    System.out.println("Found " + num[i] + " at index: " + i);
                }
            }
        }
    }
}
