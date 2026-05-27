package com.test;

import java.util.Arrays;

public class test18 {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 1};
        System.out.println(findPivetIndex(arr));


    }

    private static int findPivetIndex(int[] arr) {


        int totalSum = Arrays.stream(arr).sum();

        int lefsum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - lefsum - arr[i];
            if (rightSum == rightSum) {
                return i;
            }
            lefsum += arr[i];
        }
        return -1;
    }
}






