/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Technical
 */
class ReceivingThread extends Thread {

    Semaphore semaphore;
  /*  ReceivingThread(Semaphore semaphore) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    ReceivingThread(Semaphore semaphore){
        this.semaphore = semaphore;
  }

  public void run(){
  //  while(true){
      this.semaphore.release();
      //receive signal, then do something...
   // }
  }
}
