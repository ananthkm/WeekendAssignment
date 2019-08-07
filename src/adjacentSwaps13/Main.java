package adjacentSwaps13;

import java.util.Scanner;

class UserMainCode {

	public static String adjacentSwapString(String input) {
		int maxIter = input.length() / 2;
		String result = "" ;
		for (int i = 0; i < maxIter; i++) {
			result+=input.charAt(2*i+1) ;
			result+=input.charAt(2*i) ;
		}
		
		if(input.length()%2 ==1)
			result += input.charAt(input.length() - 1) ;
		
		return result ;

	}

}

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine() ;
		String result = UserMainCode.adjacentSwapString(input);
		System.out.println(result);
		sc.close();
		
	}

}
