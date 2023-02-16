package StringConcepts;

public class LengthOfLastWord {
	public static int lengthOfLastWord(String str) {
		String[] splitWords=str.split(" ");
		int length = 0;
		/**for(int i=0;i<=splitWords.length-1;i++) {
			if(i==splitWords.length-1) {
				 length = splitWords[i].length();
			}
		}*/
		for(int i=splitWords.length-1;i>=0;i--) {
			length=splitWords[i].length();
			break;
		}
		return length;
	}
	public static void main(String[] args) {
		String str="Welcome to my world java";
		System.out.println(LengthOfLastWord.lengthOfLastWord(str));
		
	}

}
