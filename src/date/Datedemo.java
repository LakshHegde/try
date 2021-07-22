package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Date d = new Date();
	System.out.println(d.toString());
	SimpleDateFormat s= new SimpleDateFormat("dd/MM/yyyy");
	System.out.println(s.format(d));
	
	}

}
