package StreamsConcepts;

import java.util.*;
import java.util.stream.Collectors;

public class EvenNumersUsingStreams {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6) ;
//		list.add(1);
//		list.add(3);
//		list.add(2);
//		list.add(8);
//		list.add(5);
		
	 list.stream().filter(s->s%2==0).forEach(System.out::println);
	
		
	}

}
