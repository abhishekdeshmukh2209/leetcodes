package com.abhishek.dsa.dailyprac.day2;

public class SetMatrixZeros {


    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 2, 0},
                {3, 4, 0, 2},
                {1, 3, 1, 5}
        };

        int col0 = 1;

        System.out.println("Input");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==0){

                    matrix[i][0] = 0;

                    if(j==0){
                        col0 = 0;
                    }else{
                        matrix[0][j] = 0;
                    }
                }
            }
        }


        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if(matrix[i][0]==0|| matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(col0==0){
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

        if(matrix[0][0]==0){
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }

        System.out.println("Output");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
