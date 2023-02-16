package StreamsConcepts;

import java.util.Arrays;
import java.util.*;

public class SecondLargestNumberDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 8, 6, 3, 10, 2, 5, 4);
		Collections.sort(list);

		int largeNum = list.stream().max(Comparator.naturalOrder()).get();
		int smallNum = list.stream().min(Comparator.naturalOrder()).get();
		System.out.println("largestNumber:" + largeNum);
		System.out.println("smallestNumber:" + smallNum);
		int secondLargeNum = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

		System.out.println("secondLargeNumber:" + secondLargeNum);
		
	

	}

}
