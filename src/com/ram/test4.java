package com.ram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test4 {

    public static void main(String[] args) {


        List<Emp> employees = Arrays.asList(
                new Emp("Alice", "IT", 75000),
                new Emp("Bob", "HR", 55000),
                new Emp("Charlie", "IT", 80000),
                new Emp("David", "Sales", 60000),
                new Emp("Eve", "HR", 58000),
                new Emp("Frank", "Sales", 62000)
        );


         Map<String ,List<Emp>> grouped  =employees.stream()
                 .collect(Collectors.groupingBy(Emp::getDepartment));

         grouped.forEach( (dept, emps) -> {
             System.out.println(dept + " : " + emps);
         });

        // Group by department with count
        Map<String, Long> deptCount = employees.stream()
                .collect(Collectors.groupingBy(Emp::getDepartment, Collectors.counting()));

        System.out.println("\nDepartment Count: " + deptCount);



    }





}
