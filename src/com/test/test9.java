package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test9 {

    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(1,2,3,4,5,6,7,8,9);

 Map<Boolean,List<Integer>>  collect = lst.stream().collect(
                     Collectors.partitioningBy(i -> i % 2 == 0)
             );

        List<Integer> evnyts = collect.get(true);
         List<Integer> odds = collect.get(false);
    System.out.println(evnyts);
    System.out.println(odds);


    }


}
