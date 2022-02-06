package com.shashwat;

import java.util.Arrays;

public class Twosumpointer {
    public static boolean hasSum(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        boolean hasSum = false;
        while(left<right) {
            if(arr[left]+arr[right]<target) left++;
            else if(arr[left]+arr[right]>target) right--;
            else {
                hasSum = true;
                break;
            }
        }
        return hasSum;
    }

    public static void main(String[] args) {
        int[] arr =  {1,2,3,6,9};
        int target = 15;
        Arrays.sort(arr); // array needs to be sorted
        boolean status = hasSum(arr,target);
        System.out.println("The array has the given sum: "+status);
    }
}
