package dateFormatConversion23;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class UserMainCode {
	
	public static String convertDateFormat(String inputDate) {
		final String inputDateFormat = "dd/MM/yyyy" ;
		final String outputDateFormat = "dd-MM-yy" ;
		LocalDate inputLocalDate = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern(inputDateFormat));
		String outputDate = inputLocalDate.format(DateTimeFormatter.ofPattern(outputDateFormat));
		return outputDate ;
	}
}
	