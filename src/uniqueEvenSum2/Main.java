package uniqueEvenSum2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UserMainCode {
	
	public static int uniqueEvenSum(int[] array) {
		Set<Integer> uniqueEvens = new HashSet<>() ;
		int result = -1;
		for(int arrayElement : array) {
			if(arrayElement % 2 == 0 && ! uniqueEvens.contains(arrayElement)) {
				result += arrayElement ;
				uniqueEvens.add(arrayElement);
			}
		}
		if(result != -1) 
			result += 1;
		return result;
	}
	
}

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int totalElementsCount = sc.nextInt() ;
		int[] array = new int[totalElementsCount];
		for(int i=0;i<totalElementsCount;i++) {
			array[i] = sc.nextInt() ;
		}
		int evenSum = UserMainCode.uniqueEvenSum(array);
		if(evenSum == -1)
			System.out.println("no even numbers");
		else {
			System.out.println(evenSum);
		}
	}

}
