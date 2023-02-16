package StringConcepts;

public class PalindromeWordsInSentence {
	/**
	 * public static boolean isPalindrome(String input) { int i1 = 0; int i2
	 * =input.length() - 1; while (i2 > i1) { if (input.charAt(i2)
	 * !=input.charAt(i1)) { return false; } i2--; i1++;
	 * 
	 * } return true;
	 * 
	 * }
	 * 
	 * @return
	 */
	public static boolean isPalindrome(String input) {
		String rev = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);

		}
		if (rev.equals(input)) {
			return true;
		}
		else {
			return false;

		}
	}

	public static void main(String[] args) {
		String str = "My name is nitin and i can speek malayalam sys ";
		String[] s = str.split(" ");
		/**for (String word : s) {
			if (isPalindrome(word)) {
				System.out.println(word + " is palimdrome");
			}
		}*/
		for(int i=0;i<=s.length-1;i++) {
			if (isPalindrome(s[i])) {
				System.out.println(s[i] + " is palimdrome");
			}
		}

	}

}
