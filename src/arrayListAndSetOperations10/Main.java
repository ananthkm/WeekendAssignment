package arrayListAndSetOperations10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class UserMainCode {
	
	public static <T> List<T> performSetOperation(List<T> set1, List<T> set2, char operator) {
		
		List<T> resultList = new ArrayList<T>();
		
		if(operator == '+') {
			resultList.addAll(set1);
			for(T t: set2) 
				if(!resultList.contains(t))
					resultList.add(t);
		} else if(operator == '*') {
			resultList.addAll(set1);
			resultList.retainAll(set2);
		} else if (operator == '-') {
			resultList.addAll(set1);
			resultList.removeAll(set2);
		}
		
		return resultList ;
		
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numberOfElementsInList = sc.nextInt() ;
		List<Integer> firstList = new ArrayList<>() ;
		List<Integer> secondList = new ArrayList<>() ;
		for(int i=0; i < numberOfElementsInList ; i++) {
			firstList.add(Integer.valueOf(sc.nextInt()));
		}
		for(int i=0; i < numberOfElementsInList ; i++) {
			secondList.add(Integer.valueOf(sc.nextInt()));
		}
		char operator = sc.next().charAt(0);
		List<Integer> resultList = UserMainCode.performSetOperation(firstList, secondList, operator);
		for(Integer integer : resultList)
			System.out.println(integer.intValue());
		
		sc.close();
	}
	
}
