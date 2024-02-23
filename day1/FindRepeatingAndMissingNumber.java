package com.abhishek.dsa.dailyprac.day1;

import java.util.*;
import java.math.BigInteger;
class FindRepeatingAndMissingNumber
{
    static Vector<Integer> repeatedNumber(int[] a)
    {
        int n = a.length;
        int totalSumCurrent = 0;
        int totalSumofSqaures = 0;
        for (int el: a) {
            totalSumCurrent = totalSumCurrent + el;
            totalSumofSqaures = totalSumofSqaures + (el * el);
        }
        int totalSumIdeal = 0;
        int totalSumofSqauresIdeal = 0;
        for (int i = 1; i <= n; i++) {
            totalSumIdeal = totalSumIdeal + i;
            totalSumofSqauresIdeal = totalSumofSqauresIdeal + (i * i);
        }
        int subtraction = totalSumIdeal - totalSumCurrent;
        int add = (totalSumofSqauresIdeal - totalSumofSqaures) / subtraction;
        Integer b = (add + subtraction)/2;
        Integer A = (add - b);
        Vector v = new Vector<Integer>();
        v.add(b);
        v.add(A);
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

