package com.stream.api.example;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<Employee> getEmployee() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(176, "Rohan", "IT", 700000));
        list.add(new Employee(177, "Rakesh", "Civil", 510000));
        list.add(new Employee(178, "Gaurav", "Mech", 320000));
        list.add(new Employee(179, "Shark", "Chemical", 903000));
        list.add(new Employee(180, "Rakesh2", "ECE", 904000));
        return list;
    }
}
