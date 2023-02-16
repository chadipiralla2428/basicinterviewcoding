package basicCoding;

import java.util.*;

public class EmpDemo {
	public static void main(String[] args) {
		List<Employee1> emp= new ArrayList<Employee1>();
		emp.add(new Employee1(1,24,"kohli",new Address("rajajiNagar",1234)));
		emp.add(new Employee1(4,25,"rohit",new Address("sivajiNagar",1235)));
		emp.add(new Employee1(3,28,"rahul",new Address("indhiraNagar",1238)));
		emp.add(new Employee1(5,30,"dhoni",new Address("gandhiNagar",1237)));
		emp.add(new Employee1(2,24,"sky",new Address("sky",1236)));
		
		//System.out.println(emp);
	//	emp.stream().sorted(Comparator.comparing(Address::getPinCode)).forEach(System.out::println);
		Collections.sort(emp,new AddressComparator());
	//	System.out.println(emp);
		String str="hello";
		String str1="hello";
		System.out.println(str==str1);
	}

}
