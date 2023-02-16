package StringConcepts;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringsCountDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("AA", "AA", "BD", "AA", "BD", "CA");
		Map<String, Long> wordsCount = list.stream().filter(words -> Collections.frequency(list, words) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(wordsCount);

	}

}
