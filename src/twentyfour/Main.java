package twentyfour;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class UserMainCode {
	
	public static boolean isLeapYear(int year) {
		if(year % 4 == 0 && ((year % 100 !=0) || (year % 400 == 0))) {
			return true ;
		}
		return false ;
	}
	
	public static int getLastDayOfMonth(String dateInput) {
		
		final String inputDateFormat = "dd-MM-yyyy" ;
		LocalDate inputLocalDate = LocalDate.parse(dateInput, DateTimeFormatter.ofPattern(inputDateFormat));
		int monthDays = inputLocalDate.getMonth().length(UserMainCode.isLeapYear(inputLocalDate.getYear())) ;
		return monthDays ;
	}
	
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		String inputDate = sc.next() ;
		System.out.println(UserMainCode.getLastDayOfMonth(inputDate));
		sc.close();
	}
	
}
