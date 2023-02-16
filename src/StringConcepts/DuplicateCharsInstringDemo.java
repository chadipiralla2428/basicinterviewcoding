package StringConcepts;

import java.util.*;

public class DuplicateCharsInstringDemo {
	public static void main(String[] args) {
		String str = "helloel";

//		for (int i = 0; i <= str.length() - 1; i++) {
//			for (int j = i + 1; j <= str.length() - 1; j++) {
//				if (str.charAt(i) == str.charAt(j)) {
//					System.out.print(str.charAt(i) + " ");
//				}
//
//			}
//
//		}
		Set<Character> set = new HashSet<Character>();
		for (char c : str.toCharArray()) {
			if (set.contains(c)) {
				System.out.print(c + " ");
			} else
				set.add(c);

		}
	}

}
