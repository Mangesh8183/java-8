package com.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class test1 {

    public static void main(String[] args) {

      int[] numbers = {1,2,3,4,5,6};
        IntStream stream = Arrays.stream(numbers);

        System.out.println(IntStream.range(0,5).boxed().toList());
System.out.println(IntStream.rangeClosed(1,5).boxed().toList());


    }


}
