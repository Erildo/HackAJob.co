import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
public class Solution {
	
	public static String run(String birthday_date) {
	String myArray[] = birthday_date.split("-");
			String newString = myArray[1]  +"-"+ myArray[0];
			String future_dates="";
			int year = 2016;
			for(int i=year;i<2066;i++) {
				String strI = Integer.toString(i);
                String data=strI+"-"+newString;
              
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date = LocalDate.parse(data, formatter); // LocalDate = 2010-02-23
			DayOfWeek dow = date.getDayOfWeek();// Extracts a `DayOfWeek` enum object.
			int y =date.getYear();
			String output = dow.getDisplayName(TextStyle.SHORT, Locale.US);
			if(dow ==dow.SUNDAY || dow ==dow.SATURDAY || dow== dow.FRIDAY ) {
			future_dates =future_dates+" "+ output+"-"+y;

			}
			}
			return future_dates;

}
	
}
