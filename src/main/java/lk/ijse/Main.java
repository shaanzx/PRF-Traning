package lk.ijse;

import java.util.Scanner;

//Switch expression
public class Main {
    public static void main(String[] args) {
        //Run time expression
        Scanner Input = new Scanner(System.in);
        System.out.println("Input num:  ");
        int x = Input.nextInt();

        //int x = 3;
        //Compile time expression
        System.out.println(switch (x) {
            case 1 -> "case 1";
            case 2 -> {
                String sr = "case 2";
                yield sr;
            }
            case 3 -> "case 3";
            default -> {
                String sr = "case 4";
                yield sr;
            }
        });
    }
}
