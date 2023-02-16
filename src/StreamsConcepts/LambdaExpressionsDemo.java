package StreamsConcepts;

public class LambdaExpressionsDemo  {

	public static void main(String[] args) {
//		Shape s = new Shape() {
//			
//			@Override
//			public void shape() {
//				System.out.println("hello this is a circle");
//				
//			}
//		};
//		s.shape();
		Shape s = (str)->{ return str.length();
		};
		System.out.println("length of theString is:"+s.shape("java"));
		
	}

	

}
