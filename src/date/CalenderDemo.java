package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat s= new SimpleDateFormat("dd/mm/yyyy");
		s.format(cal.getTime());
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		
		
		
	}

}
