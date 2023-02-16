package basicCoding;

public class InterfDemo implements InterfaceDemo {

	@Override
	public void demo2() {
		System.out.println("Hi");
		
	}
	@Override
	 public void hi(int a,int b) {
		   System.out.println("normal method:"+a*b);
		 
	 }
	
	public static void main(String[] args) {
		InterfDemo d=new InterfDemo();
		d.demo2();
		d.hi(10, 8);
		
		InterfaceDemo.demo1(5, 10);
		
	}

}
