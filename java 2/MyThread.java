/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mythread;

/**
 *
 * @author Technical
 */
public class MyThread extends Thread implements Runnable{

    /**
     * @param args the command line arguments
     */
      public void start(){
          
      }  
     public void run(){  
        for(int i=1;i<5;i++){  
          try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
          System.out.println(i);  
        }  
     }
     
     public static void main(String args[]){  
        MyThread t1=new MyThread();  
        MyThread t2=new MyThread();  

        t1.start();  
        t2.start();  
  
        /*RunnableClass rc = new RunnableClass();
        Thread t = new Thread(rc);
        t.start();*/
 }  
    
}