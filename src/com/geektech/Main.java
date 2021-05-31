package com.geektech;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
	// write your code here
        double[] array = new double[] {1.1, 2.1, 3.1, -4.1, 5.1, 6.1, 7.1, 8.1, 9.1, -10.1, 11.1, 12.1, 13.1, -14.1, 15.1};
        double sum = 0;
        for (int j = 0; j < array.length; j++) {
            sum += array[j];
        }
        System.out.println(sum/array.length);


        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = (int) array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                    printArray(array);
                }

            }
        }


    }

    private static void printArray(double[] array) {
        System.out.println(Arrays.toString(array));
    }
}
