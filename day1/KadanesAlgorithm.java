package com.abhishek.dsa.dailyprac.day1;

public class KadanesAlgorithm {

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        printLongestSubarray(arr);
    }
    private static void printLongestSubarray(int[] arr) {
        int sum = Integer.MIN_VALUE;
        int maximum = 0;
        int startOfArray = 0;
        int endOfArray = 0;

        for (int i = 0; i < arr.length; i++) {
            if(sum < 0){
                sum = 0;
            }
            if(sum == 0){
                startOfArray = i;
            }
            sum = sum + arr[i];
            if(arr[i] > maximum){
                endOfArray = i;
            }
            maximum = Integer.max(arr[i], maximum);
        }
        System.out.println("maximum "+maximum);
        System.out.println("sum "+sum);
        System.out.println("startOfArray "+startOfArray);
        System.out.println("endOfArray "+endOfArray);
    }
}
