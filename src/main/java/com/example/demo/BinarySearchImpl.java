package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    //this is dependency of BinarySearch
    @Autowired
    private SortAlgorithm sortAlgorithm;

    /*
    //constructor injection
    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }
     */

    // setter injection
//    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }

    public int binarySearch(int[] numbers, int numberToSearchFor){

        // (1) sorting logic here :
        /*
        some time we will use BUBBLE SORT, sometime we will use QUICK SORT,
        so, question is how to achieve LOOSELY COUPLING ??
         */
        sortAlgorithm.sort(numbers);

        // (2) Search the array :

        return 3;
    }
}
