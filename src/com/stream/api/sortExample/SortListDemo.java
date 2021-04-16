package com.stream.api.sortExample;

import com.stream.api.example.DataBase;
import com.stream.api.example.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8, 3, 12, 4);
        //Normal approach
        Collections.sort(list); //ASCENDING
        Collections.reverse(list); //DESCENDING
        System.out.println(list);

        //Stream approach for traditional sorting
        list.stream().sorted().forEach(i -> System.out.println(i)); //ASCENDING
        list.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i)); //DESCENDING

        // approach for custom sorting based on some field without Stream
        List<Employee> employees = DataBase.getEmployee();
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//            //    return (int) (o1.getSalary() - o2.getSalary()); //ascending
//                return (int) (o2.getSalary() - o1.getSalary()); //DESCENDING
//            }
//        });
        //Using Lamda
        Collections.sort(employees, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
        System.out.println(employees + " Using Lambda");
        //Using Stream
        employees.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).forEach(System.out::println);
        //OR
        employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);
        //OR based on Name
        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
        //Based on Dept
        employees.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);
    }
}

