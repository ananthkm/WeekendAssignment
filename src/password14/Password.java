package password14;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag1 =0, flag2=0, flag3=0;
		Scanner sc = new Scanner(System.in);
		String pass = sc.nextLine();
		char[] a = pass.toCharArray();
		if(pass.length() >= 8)
		{
		for(char d : a){
			if(Character.isLowerCase(d) || Character.isUpperCase(d)) {
				flag1 = 1;
			}
			else if(Character.isDigit(d))
				flag2 = 1;
			else if(d>=33&&d<=46||d==64)
				flag3 = 1;
				
			
		}
		if( flag1 == 1 && flag2 ==1 && flag3 ==1)
		{
			System.out.println("Valid Password");
		}
		else
		{
			System.out.println("Invalid Password");
		}
		}
		else
			System.out.println("Invalid password");
	}

}
