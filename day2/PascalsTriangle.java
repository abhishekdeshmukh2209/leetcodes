package com.abhishek.dsa.dailyprac.day2;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        int triangle = 6;
        List<List<Integer>> listOfRows = getPascalTriangle(triangle);
    }

    private static List<List<Integer>> getPascalTriangle(int triangle) {
        for (int i = 1; i <= triangle; i++) {
            getRowOfPascalTriangle(i);
            System.out.println();
        }
        return null;
    }

    private static List<Integer> getRowOfPascalTriangle(int row) {
        int ans = 1;
        List<Integer> pascalRow = new ArrayList<>();
        pascalRow.add(1);
        for (int i = 1; i < row; i++) {
            ans = ans * (row - i);
            ans = ans / i;
            pascalRow.add(ans);
        }
        System.out.print(pascalRow);
        return pascalRow;
    }

}
