package arrayListManipulation4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class UserMainCode {
	
	public static List<Integer> generateOddEvenList(List<Integer> firstList, List<Integer> secodeList) {
		List<Integer> oddEvenList = new ArrayList<>();
		for(int i =0; i< firstList.size();i++) {
			if(i%2 == 0)
				oddEvenList.add(secodeList.get(i));
			else
				oddEvenList.add(firstList.get(i));
		}
		return oddEvenList ;
	} 
	
}

public class Main {

	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int numberOfIntegersInList = sc.nextInt() ;
		List<Integer> firstList = new ArrayList<>();
		List<Integer> secondList = new ArrayList<>();
		for(int i=0;i<numberOfIntegersInList;i++) {
			firstList.add(sc.nextInt());
		}
		
		for(int i=0;i<numberOfIntegersInList;i++) {
			secondList.add(sc.nextInt());
		}
		List<Integer> manipulatedList = UserMainCode.generateOddEvenList(firstList, secondList);
		for(Integer i : manipulatedList) 
			System.out.println(i.intValue());
		
	}
	
}
