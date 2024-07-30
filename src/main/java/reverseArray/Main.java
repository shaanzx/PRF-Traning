package reverseArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = {3,5,7,9,2,13};

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
