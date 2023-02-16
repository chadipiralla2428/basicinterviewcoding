package basicCoding;

import java.util.*;

public class InterfDemoc implements Interf1,Interf2{

	@Override
	public void print() {
		
		Interf2.super.print();
		//System.out.println("normal  method");
	}
	public static void main(String[] args) {
		InterfDemoc d=new InterfDemoc();
	//	d.print();
		String s= new String("sk");
		String s1="sk";
	//	System.out.println(s.equals(s1));
	//	System.out.println("***********");
	//	System.out.println(s==s1);
		List<Integer> list=Arrays.asList(1,2,5,9,10,15,20,6,25,28);
	//	list.stream().filter(l ->l>=20).forEach(System.out::println);
		
//		Map<String,List<String>> map=new HashMap<>();
//		List<String> l1=Arrays.asList("virat","kohli");
//		map.put("key1", l1);
//		System.out.println(map);
		
		
	}

}
