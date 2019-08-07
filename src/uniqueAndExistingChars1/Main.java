package uniqueAndExistingChars1;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set; 

class UserMainCode {
	
	public static String replacePlus(String first, String second) {
		Set<Character> secondCharacterSet = new HashSet<>();
		for(char ch: second.toCharArray()) {
			secondCharacterSet.add(Character.toLowerCase(ch));
			secondCharacterSet.add(Character.toUpperCase(ch));
		}
		StringBuilder result = new StringBuilder();
		for(char ch:first.toCharArray()) {
			if(secondCharacterSet.contains(ch)) {
				result.append(ch);
			} else {
				result.append("+");
			}
		}
		
		return result.toString();
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String first = sc.next() ;
		String second = sc.next() ;
		
		System.out.println(UserMainCode.replacePlus(first, second));
		
		sc.close();
	}

}
