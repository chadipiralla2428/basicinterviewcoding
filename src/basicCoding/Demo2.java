package basicCoding;

public class Demo2 {
	public static void string(String str,char c) {
		String finalStr="";
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)!=c) {
				finalStr=finalStr+str.charAt(i);
				
			}
		}
		System.out.println("final String is:"+finalStr);
	}
	

	public static void main(String[] args) {
		String str = "CloudTeCh";
		char c='u';
		//System.out.println(str.replaceAll("C", ""));
		string(str, c);

	}

}
