package maxScorer11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class UserMainCode {
	
	public static int getMark(String entry) {
		String[] splits = entry.split("-");
		int markTotal = Integer.valueOf(splits[1]) +
						Integer.valueOf(splits[2]) +
						Integer.valueOf(splits[3]) ;
		
		return markTotal ;
	}
	
	public static String highestScorer(List<String> entries) {
		return entries.stream()
					.max((entry1, entry2) -> UserMainCode.getMark(entry1) - UserMainCode.getMark(entry2)) 
					.map(entry -> entry.split("-")[0])
					.get();
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		int numberOfEntries = sc.nextInt() ;
		List<String> entry = new ArrayList<String>();
		for(int i=0; i<numberOfEntries; i++) {
			entry.add(sc.next());
		}
		String highestScorer = UserMainCode.highestScorer(entry);
		System.out.println(highestScorer);
		
		
	}
	
}
