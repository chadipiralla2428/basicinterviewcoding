package basicCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Parent {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,3,2,4,7,9,8,10);
	Integer max=list.stream().max(Comparator.reverseOrder()).get();
	System.out.println(max);
	}
	

}
