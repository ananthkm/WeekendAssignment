package dateFormatConversion23;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String inputDate = sc.next() ;
		String outputDate = UserMainCode.convertDateFormat(inputDate);
		System.out.println(outputDate);
		
	}
	
}