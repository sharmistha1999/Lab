package Lab3;
import java.time.LocalDate;
import java.time.Period;

public class Lab3Exercise9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.of(2020, 12, 04);
	      LocalDate date2 = LocalDate.of(2021, 7, 31);
	      System.out.println("Date 1 = "+date1);
	      System.out.println("Date 2 = "+date2);
	      Period p = Period.between(date1, date2);
	      System.out.println("span = "+p);
	      System.out.println("Years = "+p.getYears());
	      System.out.println("Month = "+p.getMonths());
	      System.out.println("Days = "+p.getDays());
	}
}
