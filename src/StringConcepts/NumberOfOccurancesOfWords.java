package StringConcepts;

public class NumberOfOccurancesOfWords {
	public static void main(String[] args) {
		String str="hello java welcome this is java channel for java learnersonce again welcome ";
		String[]s=str.split(" ");
        String word="welcome";
		int count=0;
		for(int i=0;i<=s.length-1;i++) {
			if(s[i].equals(word)) {
				count++;
			}
		}
		System.out.println(word+":"+count);
	}

}
