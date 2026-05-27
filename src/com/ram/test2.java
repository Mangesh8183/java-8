package com.ram;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class test2 {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 50000),
                new Employee("Bob", 75000),
                new Employee("Charlie", 60000),
                new Employee("David", 75000),
                new Employee("Eve", 55000)
        );

        double secondHighest = employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0.0);
        System.out.println(secondHighest);

        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "watermelon", "cat");
         String longest = strings.stream()
                 .max(Comparator.comparingInt(String::length))
                 .orElse("");
         System.out.println( "Longest String " +longest);



        // Find employee with 2nd highest salary
        Employee emp2ndHighest = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("Employee with 2nd Highest Salary: " + emp2ndHighest);
    }



    }


