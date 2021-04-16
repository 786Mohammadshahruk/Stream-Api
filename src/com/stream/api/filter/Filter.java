package com.stream.api.filter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Filter {
    public static void main(String[] args) {
            List<String> list = Arrays.asList("Mac", "Dell", "Hp", "Ubuntu", "MecOs", "Windows");
            list.stream().filter(i-> i.startsWith("M")).forEach(s-> System.out.println(s));

            Map<Integer, String> map = new HashMap<>();
            map.put(1, "A");
            map.put(2, "B");
            map.put(3, "C");
            map.put(4, "D");
            map.put(5, "E");
            map.entrySet().stream().filter(i-> i.getKey()%2==0).forEach(obj -> System.out.println(obj));
    }
}
