package com.test;

import java.util.Arrays;

public class test16 {

    public static void main(String[] args) {

        int[] arr = {1,0,1,2,1,3,4,5};
        int p =0;

        for(int i=0;i<arr.length;i++){
             if (arr[i] !=1){
                 arr[p] = arr[i];
                 p++;
             }
        }
while (p <arr.length){
    arr[p] = 1;
    p++;
}

System.out.println(Arrays.toString(arr));
    }
}
