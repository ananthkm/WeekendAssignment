package DayOfTheWeek21;

import java.util.Scanner;

public class UserMainCode {

	static int dayofweek(int d, int m, int y) 
	{ 
		int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; 
		y -= (m < 3) ? 1 : 0; 
		return ( y + y/4 - y/100 + y/400 + t[m-1] + d) % 7; 
	} 
  
	// Driver Program to test above function 
	public static void main(String arg[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] c = s.split("-");
		int day = dayofweek(Integer.parseInt(c[0]), Integer.parseInt(c[1]), Integer.parseInt(c[2])); 
		System.out.print(day); 
	} 
} 