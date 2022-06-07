package Collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 1, 7, 8, 9, 0};
        int b = 7;
        int[] result = haveClone(arr1,b);
        for(int a: result){
            System.out.println(a);


        }

    }

    public static int[] haveClone(int[] arr, int b) {
        for (int i = 0; i < arr.length; i++) {
            for (int a = 0; a < arr.length; a++) {
                if ((arr[i] + arr[arr.length - (1 + a)]) == b) {
                    return new int[]{arr[i], arr[arr.length - (1 + a)]};
                }
            }
        }
        return null;
    }
}

