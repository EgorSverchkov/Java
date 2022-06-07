package dz7;

import java.util.Arrays;

public class DomZad {
    public int[] sortirovka(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = 0; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }

        }
        return array;
    }
}

class DomZadTest{
    public static void main(String[] args) {
        DomZad z = new DomZad();
        int[] arr = {1,-5,6,13,55,-35,67,12,-31,-14};
z.sortirovka(arr);
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}


