package com.test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test8 {


    public static void main(String[] args) {

        String str = "hello word hello";

  Map<String,Long>  collec=  Stream.of(str.split(" "))
                .collect(
                        Collectors.groupingBy(
                        Function.identity(),Collectors.counting()
                        )
                );

System.out.println(collec);


    }
}
