package com.test;

import java.util.Arrays;
import java.util.List;

public class test11 {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4,1,3,2,5,7);
        list.parallelStream().sorted()
                .forEachOrdered(System.out::println);


    }
}
