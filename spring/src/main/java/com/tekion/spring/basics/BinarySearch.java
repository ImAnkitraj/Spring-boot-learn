package com.tekion.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

    @Autowired
    SortAlgorithm quickSort;



    public void sort() {
        quickSort.sort();
        System.out.println(quickSort.getClass().getSimpleName());
    }

//    @PostConstruct
//    public void postConstruct() {
//        System.out.println("From post construct");
//    }
//
//    @PreDestroy
//    public void preDestroy() {
//        System.out.println("Pre destroy");
//    }
}
