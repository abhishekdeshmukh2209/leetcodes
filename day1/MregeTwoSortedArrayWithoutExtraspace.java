package com.abhishek.dsa.dailyprac.day1;

import java.util.ArrayList;
import java.util.Arrays;

public class MregeTwoSortedArrayWithoutExtraspace  {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 7, 8};
        int[] arr2 = new int[]{5, 6, 9, 10,4};

        sortingWithoutMerging(arr1,arr2);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }

    private static void sortingWithoutMerging(int[] arr1, int[] arr2) {

        int left = arr1.length -1;
        int right = 0;

        while((arr1[left] > 0) || (arr2[right] <= arr2.length-1)) {
            if(arr1[left] > arr2[right]) {
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
            }else{
                break;
            }
            left--;
            right++;
        }

    }

}
