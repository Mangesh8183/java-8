package com.om;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class test3 {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(3,4,5,6,7);

                    List<Integer> list = Stream.concat(list1.stream(),list2.stream()).distinct().toList();
                    System.out.println(list);


               List<Integer> list3 =      list1.stream().filter(
                            list2::contains
                    ).toList();
                    System.out.println(list3);


    }

}
