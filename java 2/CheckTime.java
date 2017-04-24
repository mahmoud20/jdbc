/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checktime;

import java.util.*;


// Need this to format the dates
import java.text.DateFormat;


/**
 *
 * @author Technical
 */
public class CheckTime extends Thread {

    /**
     * @param args the command line arguments
     */
    
    // All of the code that the thread executes must be 
	// in the run method, or be in a method called for
	// from inside of the run method
	public void run(){
		
		// Creating fields that will contain date info
		Date rightNow;
		Locale currentLocale;
		DateFormat timeFormatter;
		DateFormat dateFormatter;
		String timeOutput;
		String dateOutput;
		
		// Output the current date and time 20 times
		for(int i = 1; i <= 20; i++){
		
			// A Date object contains date and time data
			rightNow = new Date();
			
			// Locale defines time formats depending on location
			currentLocale = new Locale("en", "US");
			
			
			timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
			
			// getDateInstance only outputs time information
			dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);
			
			// Convert the time and date into Strings
			timeOutput = timeFormatter.format(rightNow);
			dateOutput = dateFormatter.format(rightNow);
			
			System.out.println(timeOutput);
			System.out.println(dateOutput);
			System.out.println();
		
			// You must wrap the sleep method in error handling
			// code to catch the InterruptedException exception
			// sleep pauses thread execution for 2 seconds below
			
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
                        System.out.println("InterruptedException for CheckTime caught");
                        }
		}
		
	}
	
    public static void main(String[] args) {
        // TODO code application logic here
		
		Thread getTime = new CheckTime();
		
		// Create a new Thread created using the Runnable interface
		// Execute the code in run after 10 seconds
		
		Runnable getTime2 = new CheckTimeRun(10);
		
		Runnable getTime2Again = new CheckTimeRun(20);
		
		// Call for the code in the method run to execute
		
		getTime.start();
		
                Thread getTime2TH = new Thread(getTime2);                
                Thread getTime2AgainTH = new Thread(getTime2);
                getTime2TH.start();
                getTime2AgainTH.start();
                
//		new Thread(getTime2).start();
//		new Thread(getTime2Again).start();
    }
    
}
