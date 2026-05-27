package com.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test12 {

    public static void main(String[] args) {

        String str = "programming";
 LinkedHashMap<Character,Long> collect  =     str.chars().mapToObj(c -> (char)c).
        collect(
                Collectors.groupingBy(
                    Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )
        );
     Character c =    collect.entrySet().stream().
                 filter(e -> e.getValue() > 1)
                 .map(Map.Entry::getKey).findFirst().get();

System.out.println(c);

    }

}
