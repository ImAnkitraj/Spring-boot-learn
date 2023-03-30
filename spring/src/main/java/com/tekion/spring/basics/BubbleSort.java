package com.tekion.spring.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortAlgorithm{

    private static Logger LOGGER = LoggerFactory.getLogger(BubbleSort.class);
    @Override
    public Integer[] sort() {
        Integer[] a = new Integer[3];
        System.out.println("From Bubble Sort");
        return new Integer[0];
    }

//    @PostConstruct
//    public void postConstruct() {
//        LOGGER.info("{}", "post - construct");
//    }
}
