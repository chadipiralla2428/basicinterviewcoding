package StringConcepts;

public class ReversewordDemo {
	public static String reverseDemo(String str) {
		String[] rev=str.split(" ");
		String revWord="";
		for(int i=rev.length-1;i>0;i--) {
			if(i==0) {
				revWord=revWord+rev[i];
			}
			else
				revWord=revWord+rev[i]+" ";
				
			
		}
		return revWord;
		
	}
	public static void main(String[] args) {
		String str=" Welcome to Java world";
		System.out.println("original word:"+str);
		System.out.println("reverse word:"+ReversewordDemo.reverseDemo(str));
		
	}

}
