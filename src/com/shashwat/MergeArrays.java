package com.shashwat;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String args[]) {
        Integer a[] = {1, 7, 3, 4};
        Integer b[] = {5, 6, 7, 0};

        Integer c[] = new Integer[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int j = a.length, k = 0; j < a.length + b.length && k < b.length; j++, k++) {

            c[j] = b[k];
        }
        Arrays.sort(c);
        System.out.print(Arrays.toString(c));


    }
}
