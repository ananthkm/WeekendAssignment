package masteringHashmap5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class UserMainCode {
	
	public static int getAverageOfOdd(Map<Integer, Integer> map) {
		int oddSum = 0, oddCount = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getKey().intValue() % 2 == 1) {
				oddSum += entry.getValue().intValue() ;
				oddCount+=1 ;
			}
		}
		return oddSum / oddCount ;
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numberOfEntries = sc.nextInt() ;
		Map<Integer, Integer> map = new HashMap<>() ;
		for(int i =0; i< numberOfEntries;i++) {
			int key = sc.nextInt() ;
			int value = sc.nextInt() ;
			map.put(Integer.valueOf(key), Integer.valueOf(value));
		}
		System.out.println(UserMainCode.getAverageOfOdd(map));
		
	}
	
}
