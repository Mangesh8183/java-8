package com.test;

import java.util.function.Predicate;

public class test19 {

    public static   void main(String[] args) {


       Thread t1=new Thread(()->{

           System.out.println("hello");
       }) ;

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));
        Predicate<String> isWordStartingWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWithT = x -> x.toLowerCase().endsWith("t");
        Predicate<String> and = isWordStartingWithA.and(isWordEndingWithT);
        System.out.println(and.test("Akshay"));


    }
}
