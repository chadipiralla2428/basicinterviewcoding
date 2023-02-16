package StreamsConcepts;

import java.util.Arrays;
import java.util.*;

public class IntermediateAndTerminalDemo {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,5,3,10,2,4,8);
		//list.stream().map(a->a*2).filter(a->a>2).forEach(System.out::println);
		//list.stream().sorted().forEach(System.out::println);
		//System.out.println("-------------------------");
		//list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		Integer minNum=	list.stream().min((a1,a2)->a1-a2).get();
		System.out.println("minNum:"+minNum);
	Integer maxNum=	list.stream().max((a1,a2)->a1-a2).get();
	System.out.println("maxNum:"+maxNum);
	
	





	}

}
