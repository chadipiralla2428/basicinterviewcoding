package StreamsConcepts;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByDemo {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("virat", "delhi"),
				                            new Employee("rohit", "mumbai"),
				                            new Employee("pritvi", "delhi"),
				                            new Employee("bhumrah", "mumbai"));
		Map<String, List<Employee>> basedOnCity=list.stream().
				collect(Collectors.groupingBy(Employee::getCity));
		System.out.println(basedOnCity);
	}

}
