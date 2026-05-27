package com.test;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class test13 {

    public static void main(String[] args) {


        String s = "good morning";


   Optional<String> max= Stream.of(s.split(" "))
                .max(Comparator.comparingInt(String::length));
        System.out.println(max);

    }


}
