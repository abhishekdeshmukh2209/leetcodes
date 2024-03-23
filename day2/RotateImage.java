package com.abhishek.dsa.dailyprac.day2;

import java.util.ArrayList;

public class RotateImage {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        arrayLists.add(new ArrayList<Integer>(){
            {
                add(1);
                add(2);
                add(3);
                add(4);
            }
        });
        arrayLists.add(new ArrayList<Integer>(){
            {
                add(5);
                add(6);
                add(7);
                add(8);
            }
        });
        arrayLists.add(new ArrayList<Integer>(){
            {
                add(9);
                add(10);
                add(11);
                add(12);
            }
        });
        arrayLists.add(new ArrayList<Integer>(){
            {
                add(13);
                add(14);
                add(15);
                add(16);
            }
        });



        ArrayList<ArrayList<Integer>> transposed = new ArrayList<>();

        for (int i = 0; i < arrayLists.get(0).size() ; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < arrayLists.size() ; j++) {
                 row.add(arrayLists.get(j).get(i));
            }
            transposed.add(row);
        }

        printMatrix(transposed);
        ArrayList<ArrayList<Integer>> rotatedImage = new ArrayList<>();

        for (int i = 0; i < transposed.get(0).size() ; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = transposed.size()-1; j >=0 ; j--) {
                row.add(transposed.get(i).get(j));
            }
            rotatedImage.add(row);
        }
        printMatrix(rotatedImage);

    }


    public static void printMatrix(ArrayList<ArrayList<Integer>> arrayLists){
        arrayLists.forEach(
                x->{
                    x.forEach(y->{
                        System.out.print(" "+y);
                    });
                    System.out.println();
                }
        );
    }
    }
