package com.test;

import java.util.stream.IntStream;

public class test7 {


    public static void main(String[] args) {

        String str= "madam";
//    boolean ispalidrome    =    IntStream.range(0, str.length()/2)
//                .allMatch(i -> str.charAt(i)==str.charAt(str.length()-i-1));

        boolean ispalidrome = IntStream.range(0,str.length()/2)
                        .allMatch(i -> str.charAt(i)==str.charAt(str.length()-i-1));


System.out.println(ispalidrome);

    }
}
