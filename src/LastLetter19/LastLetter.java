package LastLetter19;

import java.util.Scanner;

public class LastLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] str = s.split(" ");
		for(int i =0 ; i<str.length;i++)
		{
			char e =str[i].charAt(str[i].length()-1);
			if(i!=str.length-1)
				System.out.print(Character.toUpperCase(e)+""+"$");
			else
				System.out.print(Character.toUpperCase(e));
				
		}
	}

}
