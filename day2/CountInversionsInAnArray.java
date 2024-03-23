package com.abhishek.dsa.dailyprac.day2;

public class CountInversionsInAnArray {

    public static int count = 0;
    public static void main(String[] args) {
        int array[] = {1, 20, 6, 4, 5 };


        int low = 0;
        int high = array.length - 1;
        int mid = (low + high) / 2;

        if (low == high) {
            return;
        }

        divide(array);
        System.out.println("Inversion counts "+count);
    }

    private static void divide(int[] array) {

        int inputLength = array.length;

        if(inputLength < 2){
            return;
        }

        int mid = array.length/2;
        int leftArray[] = new int[mid];
        int rightArray[] = new int[inputLength-mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }

        for (int i = mid; i < inputLength; i++) {
            rightArray[i - mid] = array[i];
        }

        divide(leftArray);
        divide(rightArray);
        merge(array, leftArray, rightArray);


    }

    private static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(" # "+array[i]);
        }

    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int i=0, j=0, k=0;

        while (i < leftArray.length && j < rightArray.length){
            if(leftArray[i] < rightArray[j]){
                array[k] = leftArray[i];
                i++;

            }else{
                array[k] = rightArray[j];
                j++;
                count++;
            }
            k++;
        }

        while(i < leftArray.length){
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < rightArray.length){
            array[k] = rightArray[j];
            j++;
            k++;
        }

    }



}
