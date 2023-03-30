package com.tekion.spring.basics;

import org.springframework.stereotype.Component;

@Component
public class QuickSort implements SortAlgorithm{

    @Override
    public Integer[] sort() {
        Integer[] a = new Integer[10];
        System.out.println("From quick sort");
        return new Integer[0];
    }
}
