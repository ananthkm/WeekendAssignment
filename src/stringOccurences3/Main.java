package stringOccurences3;

import java.util.Scanner;
import java.util.regex.Pattern;

class UserMainCode {
	public static int countNoOfWords(String firstString, String secondString) {
		int countOfSecondString = 0;
		for(String word: firstString.split(" ")) {
			if(word.equals(secondString)) {
				countOfSecondString += 1;
			}
		}
		return countOfSecondString ;
	}
}

public class Main {

	public static String extractSecondWordInSentence(String sentence) {
		String spacePattern = Pattern.quote(" ");
		String words[] = sentence.split(spacePattern);
		return words[1];
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String firstString = sc.nextLine() ;
		String secondString = sc.nextLine() ;
		System.out.println(UserMainCode.countNoOfWords(firstString, extractSecondWordInSentence(secondString)));
		sc.close();
	}
	
}
