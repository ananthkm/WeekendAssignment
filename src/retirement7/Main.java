package retirement7;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors; 

class UserMainCode {
	public static List<String> retirementEmployeeList(Map<String, LocalDate> employeeList) {
		
		@SuppressWarnings("deprecation")
		LocalDate currentDate = LocalDate.parse("01/01/2014", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		return employeeList.entrySet()
											.stream()
											.filter(entry -> Period.between(entry.getValue(), currentDate).getYears() > 60)
											.map(entry -> entry.getKey())
											.sorted()
											.collect(Collectors.toList());
		
	}
}

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numberOfEmployee = sc.nextInt() ;
		Map<String, LocalDate> employeeList = new HashMap<String, LocalDate>() ;
		for(int i=0; i < numberOfEmployee; i++) {
			String empId = sc.next() ;
			String dateInput = sc.next() ;
			LocalDate employeeDob = LocalDate.parse(dateInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			employeeList.put(empId, employeeDob);
		}
		
		List<String> retriedEmpIds = UserMainCode.retirementEmployeeList(employeeList) ;
		for(String empId : retriedEmpIds)
			System.out.println(empId);
		
		sc.close();
		
	}
	
}
