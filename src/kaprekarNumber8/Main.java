package kaprekarNumber8;

import java.util.Scanner;

class UserMainCode {
	
	public static int getDigit(int number) {
		return (int) Math.floor(Math.log10(number) + 1) ;
	}
	
	public static int getKaprekarNumber(int number) {
		int squareNumber = number * number ;
		int digitInNumber = UserMainCode.getDigit(squareNumber);
		int rightPart = (int) (squareNumber % Math.pow(10, digitInNumber / 2)) ;
		int leftPart = (int) (Math.floorDiv(squareNumber, (int) Math.pow(10, digitInNumber / 2))) ;
		if(leftPart + rightPart == number)
			return 1;
		return -1 ;
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt() ;
		int result = UserMainCode.getKaprekarNumber(number);
		if(result == 1)
			System.out.println("Kaprekar Number");
		else
			System.out.println("Not A Kaprekar Number");
		sc.close();
	}
	
}
