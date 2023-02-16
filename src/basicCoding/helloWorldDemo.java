package basicCoding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class helloWorldDemo {
	public static void main(String[] args) {
		//System.out.println("HelloWorld");
		List<Integer> list = Arrays.asList(10,15,20,22,45,50,11,12);
		//list.stream().map(s -> s + " ").filter(s-> s.startsWith("1")).forEach(System.out::println);
		int num= 25;
		int rev = 0;
		for(int i=0;i<=num;i++) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		//System.out.println(rev);
		
		String str="rohit";
		String revString="";
		for(int i=str.length()-1;i>=0;i--) {
			revString= revString+str.charAt(i);
		}
		//System.out.println(revString);
		
		List<Patient> patient = Arrays.asList(
				new Patient("kiran",20,"fever",20000),
				new Patient("vikram",21,"carona",18000),
				new Patient("karthik",18,"headache",2000),
				new Patient("kumar",24,"carona",8000),
				new Patient("raina",28,"carona",12000)
				
				);
	 //	patient.stream().filter(s-> s.getDeseaseName().equals("carona")&& s.getAge()<25).forEach(System.out::println);
	 	//patient.stream().filter(s->s.getAge()<25).forEach(System.out::println);
	Double avgBill  = patient.stream().filter(s-> s.getDeseaseName().equals("carona")).collect(Collectors.averagingDouble(Patient::getBill));
	//	System.out.println(avgBill);
	
	List<Employee>  emp = Arrays.asList(
			new Employee(25,"virat",25000.009),
			new Employee(20,"viru",20000.005),
			new Employee(28,"kiran",22000.004),
			new Employee(30,"rahul",30000.008),
			new Employee(24,"pant",24000.009)
			
			
			);
/**List<Employee> salinc = emp.stream().filter(s->s.getAge()>25).map(s->{
	if(s.getAge()>25) {
		s.setSal(s.getSal()+500);
	} return s;
}).collect(Collectors.toList());
//System.out.println(salinc);*/

List<Employee> sal = emp.stream().filter(s->s.getAge()>25).map(s->{
	s.setSal(s.getSal()+500);
	return s;
             }).collect(Collectors.toList());
System.out.println(sal);
	}

}
