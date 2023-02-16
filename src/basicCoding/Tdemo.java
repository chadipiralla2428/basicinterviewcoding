package basicCoding;

public class Tdemo {
public static void main(String[] args) throws InterruptedException {
	ThreadsDemo demo = new ThreadsDemo();
	demo.setDaemon(true);
	ThreadsDemo demo1 = new ThreadsDemo();
	
	System.out.println("default Name:"+demo.getName());
	demo.setName("demo Thread");
	System.out.println("after changing name:"+demo.getName());
	System.out.println("before changing priority:"+demo.getPriority());
	demo.setPriority(8);
	System.out.println("after changing priority:"+demo.getPriority());
	System.out.println(demo.isAlive());
	demo1.start();
	
	System.out.println(demo.isAlive());
	demo1.join();
	demo.start();
	
	
}
}
