package PanCard18;

import java.util.Scanner;

public class Pancard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		if(s.length() == 8)
		{
		for(int i=0;i<8;i++)
		{
			if(i>=0 && i<=2)
			{
				if(!Character.isAlphabetic(c[i])) {
					flag = 1;
				}
			}
			else if(i>=3 && i<=6) {
				if(!Character.isDigit(c[i]))
					flag = 1;
			}
		}
		if(flag == 1)
			System.out.println("Invalid");
		else
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		
	}

}
