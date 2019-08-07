package DateFormat16;

import java.util.StringTokenizer;

class UserMainCode{
	public static String  findOldDate (String date1, String date2) {
		StringTokenizer st1 = new StringTokenizer(date1,"-");
		StringTokenizer st2 = new StringTokenizer(date2,"-");
		int day1 = Integer.parseInt(st1.nextToken()) ;
		int month1 = Integer.parseInt(st1.nextToken()) ;
		int year1 = Integer.parseInt(st1.nextToken()) ;
		int day2 = Integer.parseInt(st2.nextToken()) ;
		int month2 = Integer.parseInt(st2.nextToken()) ;
		int year2 = Integer.parseInt(st2.nextToken()) ;
		boolean flag=false;
		if(year1<year2) flag=true;
		else if (year1==year2 && month1<month2) flag=true;
		else if (year1==year2 && month1==month2 && day1<day2) flag=true;
		if(flag) return day1+"/"+month1+"/"+year1;
		else return day2+"/"+month2+"/"+year2;
	}
	
}