package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * https://docs.oracle.com/javase/10/docs/api/java/util/Date.html
 * https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html
 * 
 * Alisson Youssf - Revis�o emm 03/09/2018. 
 */
public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("03/09/2018"); 
		Date y2 = sdf2.parse("03/09/2018 17:20:07");
		
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf1.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
	}
}
