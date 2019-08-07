package Vowels9;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

class UserMainCode {
	
	public static boolean isCharacterVowel(char ch) {
		char upper = Character.toUpperCase(ch) ;
		return upper == 'A' ||
				upper == 'E' ||
				upper == 'I' ||
				upper == 'O' ||
				upper == 'U' ;
	}
	
	public static int countVowelsInWord(String word) {
		return (int) word
					.chars()
					.mapToObj(ch -> (char) ch)
					.filter(ch -> UserMainCode.isCharacterVowel(ch))
					.count() ;
	}
	
	public static String getWordWithMostVowel(String sentences) {
		
		return Arrays.stream(sentences.split(" "))
									.max((string1,string2)->UserMainCode.countVowelsInWord(string1) - UserMainCode.countVowelsInWord(string2))
									.get();
	
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine() ;
		String word = UserMainCode.getWordWithMostVowel(sentence);
		System.out.println(word);
		sc.close();
	}
	
}
