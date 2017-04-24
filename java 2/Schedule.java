/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;
import java.util.*;
import java.text.*;
/**
 *
 * @author Technical
 */
public class Schedule {
    Calendar cal;
    int duration;//number of lessons
    int frequency;
    String start;
    Date d;
    
    Schedule(String start) throws ParseException{
        this.start = start;
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-M-d");        
        d = sdf.parse(this.start);
        cal = new GregorianCalendar();
        cal.setTime(d);    
    }
    
    String[] organize(){
        String[] date = new String[this.duration];
        for(int i=0; i<=this.duration;i++)
        { 
            if(cal.get(Calendar.DAY_OF_WEEK)==6  ){
                cal.add(Calendar.DAY_OF_MONTH,1);
         //       continue;
            } else {
                cal.add(Calendar.DAY_OF_MONTH,2);              
            }
            d=cal.getTime();
            //DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
            
            // date[i] = dateString;
            

        }
        return date;
    }
    
}
