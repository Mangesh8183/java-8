package com.test;

import java.util.EnumMap;
import java.util.Map;

public class test4 {

    public static void main(String[] args) {

        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY, "Gym");
        map.put(Day.MONDAY, "walk");
        String s = map.get(Day.TUESDAY);
        System.out.println(map);






    }



}
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}