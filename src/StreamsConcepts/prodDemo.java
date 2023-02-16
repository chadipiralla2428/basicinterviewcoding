package StreamsConcepts;

import java.util.*;
import java.util.stream.Collectors;

public class prodDemo {
	public static void main(String[] args) {
		List<Products> prod=Arrays.asList(new Products(1,"java","books",250),
				                          new Products(3,"python","books",210),
				                          new Products(2,"html","books",180),
				                          new Products(5,"css","books",150),
				                          new Products(4,"php","books",280),
				                          new Products(8,"apple","mobile",2000),
				                          new Products(7,"swift","books",180),
				                          new Products(9,"swift","mobiLe",1800),
                                          new Products(6,"samsung","mobile",2560));
		//prod.stream().filter(e->e.getProd().equalsIgnoreCase("bOoKs")&&e.getPrice()>200).forEach(System.out::println);
	Optional<Products> leastcost=	prod.stream().filter(e->e.getProd().equalsIgnoreCase("mobile")).sorted((s1,s2)->s1.getPrice()-s2.getPrice()).findFirst();
	//Optional<Products> leastcostUsingComparator=	prod.stream().filter(e->e.getProd().equalsIgnoreCase("mobile")).sorted(Comparator.comparing(Products::getPrice).reversed()).findFirst();
	Products leastcostUsingComparator1=	prod.stream().filter(e->e.getProd().equalsIgnoreCase("mobile")).min(Comparator.comparing(Products::getPrice)).get();


	System.out.println(leastcost);
System.out.println("using Comparator1:"+leastcostUsingComparator1);
		
		
//		int[] arr= {1,5,8,9,10,3,6,4};
//	Arrays.sort(arr);
//	int secondLargeNum=arr[arr.length-2];
//	System.out.println(secondLargeNum);
		
	}

	

}
