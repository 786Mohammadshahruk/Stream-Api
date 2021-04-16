package com.stream.api.forEach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

    public static void main(String[] args) {
//        List<?> list = Arrays.asList("Mac", "Dell", "Hp", "Ubuntu", "MecOs", "Windows");
//        list.stream().forEach(i -> System.out.println(i));
//        list.forEach(i -> System.out.println(i));
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
//        map.forEach((key,value)-> System.out.println(key +":" +value));
        map.entrySet().stream().forEach(obj -> System.out.println(obj));
    }
}
