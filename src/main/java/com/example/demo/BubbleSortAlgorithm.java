package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] arrays){

        System.out.println("This is Bubble sort...");
        // write bubble sort algo here

        return arrays;
    }
}
