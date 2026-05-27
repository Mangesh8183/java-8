package com.ram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class test1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10);

        List<Integer> filtered = numbers.stream()
                .filter(n -> n > 5)
                .toList();
        System.out.println("Filtered (>5): " + filtered);

List<Integer> mapped =  numbers.stream()
        .map(n -> n * n)
        .toList();
 System.out.println("Mapped (>5): " + mapped);


 List<Integer> sored = numbers.stream()
         .sorted()
         .toList();
 System.out.println("Sorted (asc): " + sored);

List<Integer> soredDesc = numbers.stream()
        .sorted(Comparator.reverseOrder())
        .toList();
System.out.println("Sorted (desc): " + soredDesc);


List<Integer> Dist = numbers.stream()
        .distinct()
        .toList();
System.out.println("Distinct: " + Dist);

List<Integer> complect = numbers.stream()
        .filter(n -> n> 5)
        .map(n -> n * n)
        .distinct()
        .sorted()
        .toList();
System.out.println("compect (opaction): " + complect);





    }

}
