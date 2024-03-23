package com.abhishek.dsa.dailyprac.day2;

public class BestTimeToBuyAndSellStocks {

    public static void main(String[] args) {
        int arr[] = {100,180,260,310,40,535,695};

        int min = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < arr.length; i++) {

            int cost = arr[i] - min;
            maxProfit = Integer.max(cost, maxProfit);
            min = Integer.min(min, arr[i]);

        }
        System.out.println(maxProfit);
    }

}
