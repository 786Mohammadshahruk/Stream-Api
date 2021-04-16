package com.stream.api.example;

import java.util.List;
import java.util.stream.Collectors;

public class TexService {

    public static List<Employee> evaluateTaxUser(String tax) {
        return (tax.equalsIgnoreCase("tax")) ?
                DataBase.getEmployee().stream().filter(emp -> emp.getSalary() > 700000).collect(Collectors.toList()) :
                DataBase.getEmployee().stream().filter(emp -> emp.getSalary() < 700000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUser("tax"));
    }
}
