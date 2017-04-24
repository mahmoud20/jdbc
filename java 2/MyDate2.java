/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydate2;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Technical
 */
public class MyDate2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException  {
        // TODO code application logic here
        
                Date curDate = new Date();

		SimpleDateFormat format = new SimpleDateFormat();
		String DateToStr = format.format(curDate);
		System.out.println("Default pattern: " + DateToStr);

		format = new SimpleDateFormat("yyyy/MM/dd");
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);

		format = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);

		format = new SimpleDateFormat("dd MMMM yyyy zzzz", Locale.ENGLISH);
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);

		format = new SimpleDateFormat("MMMM dd HH:mm:ss zzzz yyyy",
				Locale.ITALIAN);
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);

		format = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);

			Date strToDate = format.parse(DateToStr);
			System.out.println(strToDate);
                        
                        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
                
                String dateInString = "31-08-1982 10:20:56";
                Date date = sdf.parse(dateInString);
                System.out.println(date); //Tue Aug 31
    }
    
}
