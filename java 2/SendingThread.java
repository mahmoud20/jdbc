/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Technical
 */
public class SendingThread extends Thread{
    
    Semaphore semaphore ;

  public SendingThread(Semaphore semaphore){
  //      this.semaphore = new Semaphore();
    this.semaphore = semaphore;
  }

  public void run(){
 
        try {
            //do something, then signal
            this.semaphore.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(SendingThread.class.getName()).log(Level.SEVERE, null, ex);
        }

    
  }
    
}
