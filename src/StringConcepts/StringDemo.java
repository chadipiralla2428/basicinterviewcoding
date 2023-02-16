package StringConcepts;

public class StringDemo {
	public static void main(String[] args) {
		String str="HelLo JavA Hello JaVa";
		String lowerCase="";
		String upperCase="";
		int mid=str.length()/2;
		for(int i=0;i<=str.length()-1;i++) {
			if(i<mid) {
			lowerCase=lowerCase+Character.toLowerCase(str.charAt(i));
				
			}
			else
				upperCase=upperCase+Character.toUpperCase(str.charAt(i));
			
		}
		System.out.println(lowerCase+":"+upperCase);
	}

}
