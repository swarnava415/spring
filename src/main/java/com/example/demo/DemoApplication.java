package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

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

		ApplicationContext applicationContext =
		SpringApplication.run(DemoApplication.class, args);

		BinarySearchImpl binarySearchBean = applicationContext.getBean(BinarySearchImpl.class);
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		int answer = binarySearchBean.binarySearch(new int[] {1,2}, 2);

		System.out.println(answer);


	}

}
