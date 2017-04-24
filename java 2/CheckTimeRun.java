/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checktime;

/**
 *
 * @author Technical
 */
public class CheckTimeRun implements Runnable {
    
    	// Stores the number of seconds before the code
	// will be executed
	private int startTime;
	
	// Constructor that sets the wait time for each 
	// new Thread
	public CheckTimeRun(int startTime){
		this.startTime = startTime;
	}
	
	// All of the code that the thread executes must be 
	// in the run method, or be in a method called for
	// from inside of the run method
	public void run(){
		
		try
		{
			// Don't execute until 10 seconds has passed if 
			// startTime equals 10
			Thread.sleep(startTime * 1000);
		}
		
		catch(InterruptedException e)
		{
                    System.out.println("InterruptedException for TimeRun caught");
                }
		System.out.println("Checking for Time");
	}
	
    
}
