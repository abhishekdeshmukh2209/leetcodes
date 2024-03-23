package com.abhishek.dsa.dailyprac.day2;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int array[] = {2,1,5,4,3,0,0};
        int breakPoint = -1;

        for (int i = array.length-2; i >=0; i--) {
            if(array[i] < array[i+1]){
                breakPoint = i;
                break;
            }
        }
        for (int i = array.length-1; i >= breakPoint ; i--) {
            if(array[breakPoint] <  array[i]){
                swap(array, breakPoint, i);
                break;
            }
        }
        Arrays.sort(array, breakPoint+1, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]);
        }
    }

    private static void swap(int[] array, int breakPoint, int i) {
        int temp = array[breakPoint];
        array[breakPoint] = array[i];
        array[i] = temp;
    }
}
