package org.example;

import java.util.Arrays;

public class TddArray {

    public int[] imparesArray(int number){
        int size = (number+1)/2;
        int[] array = new int[size];
        int index= 0;
        for (int i = 1; i <= number; i++) {
            if (!(i%2==0)) {
                array[index] = i;
                index++;
            }
        }
       return array;
    }
}
