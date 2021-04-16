package com.stream.api.sortMapExample;


import com.stream.api.example.Employee;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapWithStream {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("ten", 10);
        map.put("two", 2);
        map.put("four", 4);
        //Converting map to list
        /**
         * Traditional approach
         */
//        List<Entry<String,Integer>> entries=new ArrayList<>(map.entrySet());
//        Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
//            @Override
//            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//                return o1.getKey().compareTo(o2.getKey());
//            }
//        });
//        for (Entry<String,Integer> entry:entries){
//            System.out.println(entry.getKey() +" = "+entry.getValue());
//        }
        /**
         * Using Lambda approach
         */
//        List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
//        Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
//        for (Entry<String, Integer> entry : entries) {
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }
        /**
         * Stream approach
         */
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        System.out.println("*************************************************************************");

        /**
         * Traditional approach
         */
//        Map<Employee, Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int) (o1.getSalary()-o2.getSalary());
//            }
//        });
//        employeeMap.put(new Employee(176, "Rohan", "IT", 700000), 60);
//        employeeMap.put(new Employee(177, "Rakesh", "Civil", 510000), 90);
//        employeeMap.put(new Employee(178, "Gaurav", "Mech", 320000), 50);
//        employeeMap.put(new Employee(179, "Shark", "Chemical", 903000), 40);
//        employeeMap.put(new Employee(180, "Rakesh2", "ECE", 904000), 120);
//        System.out.println(employeeMap);
        /**
         * Using Lambda approach
         */
//        Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
//        employeeMap.put(new Employee(176, "Rohan", "IT", 700000), 60);
//        employeeMap.put(new Employee(177, "Rakesh", "Civil", 510000), 90);
//        employeeMap.put(new Employee(178, "Gaurav", "Mech", 320000), 50);
//        employeeMap.put(new Employee(179, "Shark", "Chemical", 903000), 40);
//        employeeMap.put(new Employee(180, "Rakesh2", "ECE", 904000), 120);
//        System.out.println(employeeMap);

        System.out.println("****************************************************************************** Stream approach");
        /**
         * Stream approach
         */
        Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
        employeeMap.put(new Employee(176, "Rohan", "IT", 700000), 60);
        employeeMap.put(new Employee(177, "Rakesh", "Civil", 510000), 90);
        employeeMap.put(new Employee(178, "Gaurav", "Mech", 320000), 50);
        employeeMap.put(new Employee(179, "Shark", "Chemical", 903000), 40);
        employeeMap.put(new Employee(180, "Rakesh2", "ECE", 904000), 120);
        System.out.println("********************************************************* Ascending");
        //Based on salary short Ascending
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
        System.out.println("********************************************************* Reversed");
        //Based on salary short reversed
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);
        System.out.println("************************************************************** Dept");
        //Based on Dept
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept))).forEach(System.out::println);
        System.out.println("*********************************** Compare by value");
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }

}
