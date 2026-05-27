package com.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class test {


    public static void main(String[] args) {



        List<Integer> list = Stream.iterate(1, n -> n + 1)
                .limit(20)
                .collect(Collectors.toList());

        list.parallelStream()
                .forEach(n -> {
                    System.out.println(Thread.currentThread().getName() + " -> " + n);
                });


    }




}
