
Video tutorial : 
`https://www.youtube.com/watch?v=edgZo2g-LTM&t=1191s`

- We use @Autowired to inject dependency
- @Autowired will automatically find an implementation Class of SortAlgorithm interface.
- The classes with @Component will consider by spring boot for auto-wiring, spring will create instance of class and inject into dependency object
- Spring can inject into dependency object via constructor injection or setter injection in the same class, if there are no setter or constructor, spring will automatically create setter injection at run time.
- It's recommended to use constructor injection for primary dependency, and setter injection for optional dependency.
- If there are more than one implementation of an interface, then spring will confuse. To solve this issue we can use @Primary with @Component.


***************************
APPLICATION FAILED TO START
***************************

Description:

Parameter 0 of constructor in com.example.demo.BinarySearchImpl required a single bean, but 2 were found:
	- bubbleSortAlgorithm: defined in file [/home/swarnava/Downloads/Del/demo/target/classes/com/example/demo/BubbleSortAlgorithm.class]
	- quickSortAlgorithm: defined in file [/home/swarnava/Downloads/Del/demo/target/classes/com/example/demo/QuickSortAlgorithm.class]

