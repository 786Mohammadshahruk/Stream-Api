package com.stream.api.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        //Predicate<Integer> predicate = i -> {
        //            if (i % 2 == 0) {
        //                return true;
        //            } else {
        //                return false;
        //            }
        //        };
        //        System.out.println(predicate.test(8));
        /*************************************************************/
//        Predicate<Integer> predicate = i -> i % 2 == 0;
//        System.out.println(predicate.test(5));
        /*************************************************************/
        List<Integer> list= Arrays.asList(4,5,3,6,7,8);
        list.stream().filter(t-> t%2==0).forEach(t-> System.out.println("Print Even "+t));
    }

}
