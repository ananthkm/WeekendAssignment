package thirtyone;

import java.util.Scanner;

class UserMainCode {
	
	public static float computeProfitPercentage(int x, int y, int z) {
		float costPrice = (float) (y / 12.0) ;
		float profit = z - costPrice ;
		float profitPercentage = profit / costPrice * 100 ;
		return profitPercentage ;
	}
	
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int x, y, z ;
		x = sc.nextInt() ;
		y = sc.nextInt() ;
		z = sc.nextInt() ;
		
		float profitPercentage = UserMainCode.computeProfitPercentage(x, y, z);
		System.out.println(String.format("%.2f", profitPercentage));
		sc.close();
	}
	
}
