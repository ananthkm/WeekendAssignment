package transferFromHashMapToArrayList22;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numberOfEntries = sc.nextInt() ;
		Map<Integer, String> empList = new HashMap<Integer, String>() ;
		for(int i=0;i < numberOfEntries; i++) {
			int empId = sc.nextInt() ;
			String empName = sc.next() ;
			empList.put(empId, empName);
		}
		List<String> empNamesFiltered = UserMainCode.getName(empList);
		for(String name : empNamesFiltered) 
			System.out.println(name);
		sc.close();
	}

}
