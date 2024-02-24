package com.abhishek.dsa.dailyprac.day1;

import java.util.Vector;

class FindRepeatingAndMissingNumberUsingExor
{
    static Vector<Integer> repeatedNumber(int[] a)
    {
        int n = a.length;
        int xr = 0;
        for (int i = 0; i < n; i++) {
            xr = xr ^ a[i];
            xr = xr ^ i+1;
        }

        int bitNo = 0;

        while(true){
            if((xr &  (1 << bitNo)) != 0){
                break;
            }
            bitNo++;
        }

        int zero = 0;
        int one = 0;

        for (int i = 0; i < n; i++) {
            int temp = 1 << bitNo;
            if((a[i] & temp) != 0){
                one = one ^ a[i];
            } else {
                zero = zero ^ a[i];
            }
        }

        for (int i = 1; i <= n; i++) {
            int temp = 1 << bitNo;
            if((i & temp) != 0){
                one = one ^ i;
            } else {
                zero = zero ^ i;
            }
        }

        Vector v = new Vector<Integer>();
        v.add(one);
        v.add(zero);
        return v;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] v = { 4, 3, 6, 2, 1, 6, 7 };
        Vector<Integer> res = repeatedNumber(v);
        for (int x : res)
        {
            System.out.print(x + " ");
        }
    }
}

// This code is contributed by Rajput-Ji

