package com.om;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test {


    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<String> res = names.stream()
                .filter( name -> name.startsWith("A"))
                .toList();
        System.out.println(res);

        ArrayDeque<String> collect = new ArrayDeque<>(names);

        System.out.println(collect);

         String concatString = names.stream().map(String::toUpperCase).collect(Collectors.joining( ));
         System.out.println(concatString);
    }
}
