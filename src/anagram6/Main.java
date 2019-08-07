package anagram6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; ;


class UserMainCode {
	
	public static int getAnagrams(String firstString, String secondString) {
		
		Map<Character, Integer> mapOfCharAndCount = new HashMap<Character, Integer>();
		for(char ch: firstString.toCharArray()) {
			mapOfCharAndCount.put(ch, mapOfCharAndCount.getOrDefault(ch, 0) + 1) ;
		}
		
		for(char ch: secondString.toCharArray()) {
			if(mapOfCharAndCount.containsKey(ch)) {
				mapOfCharAndCount.replace(ch, mapOfCharAndCount.get(ch) - 1);
			} else {
				return -1 ;
			}
		}
		
		int countOfMapValues = (int) mapOfCharAndCount.entrySet()
												.stream()
												.filter(entry -> entry.getValue()!=0)
												.count() ;
		
		if(countOfMapValues == 0)
			return 1;
		
		return -1 ;
		
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		String firstString = sc.nextLine() ;
		String secondString = sc.nextLine() ;
		int anagram = UserMainCode.getAnagrams(firstString, secondString);
		if(anagram == 1)
			System.out.println("Anagram");
		else {
			System.out.println("Not Anagram.");
		}
		
	}
	
}
