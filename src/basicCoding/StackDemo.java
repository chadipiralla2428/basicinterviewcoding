package basicCoding;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		s.push("virat");
		s.push("Kohli");
		System.out.println("After adding two elements:"+s);
		s.push("Rohit");
	    s.push("Sharma");
	    System.out.println("After adding four elements:"+s);
        s.pop();
	    System.out.println("After Removing one element:"+s);
	    System.out.println("top element:"+s.peek());

	    
	}

}
