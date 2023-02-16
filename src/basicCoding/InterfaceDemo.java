package basicCoding;

public interface InterfaceDemo {
   default void hi(int a,int b) {
	   System.out.println("default method:"+a*b);
	 
 }
   public static void demo1(int a,int b) {
	   System.out.println(a*b);
	   
   }
   public void demo2();

}
