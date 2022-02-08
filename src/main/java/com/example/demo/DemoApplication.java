package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	/*
	**** We have to tell Spring through annotation : ****

	Q) What is Beans ?
	BinarySearchImpl and BubbleSortAlgorithm is Bean
	We use @Component to tell Spring

	Q) What are the dependencies of beans ?
	sortAlgorithm object is the dependency in BinarySearchImpl Bean
	We use @Autowired

	Q) Where to search for beans ?
	No need to do this, because the class DemoApplication with @SpringBootApplication will automatically scan the same package and sub-packages.

	 */

	public static void main(String[] args) {

		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int answer =
		binarySearch.binarySearch(new int[] {1,2}, 2);

		System.out.println(answer);

		//SpringApplication.run(DemoApplication.class, args);
	}

}
