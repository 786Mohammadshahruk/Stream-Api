package com.stream.api.supplier;

import java.util.Arrays;
import java.util.List;

public class Supplier {

    public static void main(String[] args) {
        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(() -> "Hello Shahruk"));
    }
}
