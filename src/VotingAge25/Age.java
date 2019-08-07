package VotingAge25;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Age {
 public static void main(String[] args) throws ParseException {
  LocalDate now = LocalDate.now();
  Scanner sc = new Scanner(System.in);
  String s = sc.nextLine();
  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  Date d = sdf.parse(s);
  Calendar c = Calendar.getInstance();
  c.setTime(d);
  int year = c.get(Calendar.YEAR);
  int month = c.get(Calendar.MONTH) + 1;
  int date = c.get(Calendar.DATE);
  LocalDate l1 = LocalDate.of(year, month, date);
  LocalDate now1 = LocalDate.now();
  Period diff1 = Period.between(l1, now1);
  if(diff1.getYears() > 18) {
	  System.out.println("Eligible");
  }
  else
  {
	  System.out.println("not Eligible");
  }
 }
} 