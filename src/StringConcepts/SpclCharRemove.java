package StringConcepts;

public class SpclCharRemove {
	public static void main(String[] args) {
		String str="He@3llo java2$7";
		int count = 0;
		String spclRemo="";
		for(int i=0;i<=str.length()-1;i++) {
			if(!Character.isDigit(str.charAt(i))&&!Character.isLetter(str.charAt(i))&&!Character.isWhitespace(str.charAt(i))) {
			 count++;
			}
			else {
				spclRemo=spclRemo+str.charAt(i);
			}
		}
		System.out.println("count of spcl char:"+count);
		System.out.println("string without spcl characters:"+spclRemo);
	}

}
