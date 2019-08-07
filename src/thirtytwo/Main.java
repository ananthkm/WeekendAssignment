package thirtytwo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		Integer firstInt, secondInt ;
		firstInt = sc.nextInt() ;
		secondInt = sc.nextInt() ;
		System.out.println(String.format("Absolute value of %d is %d", firstInt.intValue(), Math.abs(firstInt.intValue())));
		System.out.println(String.format("Absolute value of %d is %d", secondInt.intValue(), Math.abs(secondInt.intValue())));
		if(firstInt.equals(secondInt)) {
			System.out.println(String.format("%d = %d", firstInt.intValue(), secondInt.intValue()));
		} else {
			System.out.println(String.format("%d != %d", firstInt.intValue(), secondInt.intValue()));
		}
		sc.close();
	}
	
}
