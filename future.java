import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class future {

		public static void run (String date_of_birth) {
			
			String myArray[] = date_of_birth.split("-");
			String newString = myArray[1]  +"-"+ myArray[0];

			int year = Calendar.getInstance().get(Calendar.YEAR);
			for(int i=year;i<2051;i++) {
				String strI = Integer.toString(i);
                String data=strI+"-"+newString;
              
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date = LocalDate.parse(data, formatter); // LocalDate = 2010-02-23
			DayOfWeek dow = date.getDayOfWeek();// Extracts a `DayOfWeek` enum object.
			int y =date.getYear();
			String output = dow.getDisplayName(TextStyle.SHORT, Locale.US);
			if(dow ==dow.SUNDAY || dow ==dow.SATURDAY || dow== dow.FRIDAY ) {
			System.out.println(output+"-"+y);
			}
			}
		}
		public static void main(String[] args) {
			System.out.println("Vendosni ditelindjen:(format 06-01)");
			 Scanner sc=  new Scanner(System.in);
			 String s=sc.nextLine();
		run(s);
		}
	
}
