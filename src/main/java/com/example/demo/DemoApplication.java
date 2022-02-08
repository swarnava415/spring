package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	/*
	We have to tell Spring :
	1) What is Beans ?
	2) What are the dependencies of beans ?
	3) Where to search for beans ?
	 */

	public static void main(String[] args) {

		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		int answer =
		binarySearch.binarySearch(new int[] {1,2}, 2);

		System.out.println(answer);

		SpringApplication.run(DemoApplication.class, args);
	}

}
