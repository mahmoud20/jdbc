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

// class SendingThread extends Thread{
//  Semaphore semaphore = null;
//
//  public SendingThread(Semaphore semaphore){
//    this.semaphore = semaphore;
//  }
//
//  public void run(){
//    while(true){
//      //do something, then signal
//      this.semaphore.take();
//
//    }
//  }
//}

public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Semaphore semaphore = null ;
        
        //semaphore.

        SendingThread sender = new SendingThread(semaphore);

        ReceivingThread receiver = new ReceivingThread(semaphore);

        receiver.start();
        sender.start();
    }
    
}
