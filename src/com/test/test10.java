package com.test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test10 {

    public static void main(String[] args) {

        String str = "programming";

        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)   // convert int → char
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)   // keep unique chars
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));

        System.out.println(result);



    }


}
