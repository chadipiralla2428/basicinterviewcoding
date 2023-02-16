package StringConcepts;

public class RotationOfString {
	public static void isRotation(String str1,String str2) {
		if(str1.length()==str2.length()&&(str1+str1).indexOf(str2)!=-1) {
			System.out.println(str1+" is rotation of "+str2);
		}
		else
			System.out.println(str1+" is not rotation of "+str2);
	}
	public static void main(String[] args) {
		String str1="cloudtech";
		String str2="techcloud";
		RotationOfString.isRotation(str1, str2);
		
	}

}
