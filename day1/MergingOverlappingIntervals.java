package com.abhishek.dsa.dailyprac.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergingOverlappingIntervals {

    public static void main(String[] args) {
        int arr[][] = {{1, 3},{15, 18},{8, 10},{2, 6}};
        List<Integer[]> newArr  = new ArrayList<>();
        mergeOverLappingIntervals(arr,newArr);
        printArray(newArr);
    }

    private static void mergeOverLappingIntervals(int[][] arr, List<Integer[]> newArr) {
        Arrays.sort(arr, Comparator.comparing(i -> i[0]));
        for (int i = 1; i < arr.length; i++) {
            if(newArr.isEmpty() || arr[i][0] > newArr.get(newArr.size() -1)[1]) {
                newArr.add(new Integer[]{arr[i][0],arr[i][1]});
            } else {
                newArr.get(newArr.size()-1)[1] = Math.max(newArr.get(newArr.size()-1)[1], arr[i][1]);
            }

        }
    }

    private static void printArray(List<Integer[]> newArr) {
        newArr.forEach(x ->{
            System.out.println(x[0]+" "+x[1]);
        });
    }

}
