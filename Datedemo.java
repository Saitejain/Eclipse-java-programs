package programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

	 static public void  main(String[] args) {
		// TODO Auto-generated method stub
       Date d = new Date();
       SimpleDateFormat df = new SimpleDateFormat("M/d/yyyy");
       System.out.println(d.toString());
       System.out.println(df.format(d));
	}

}
