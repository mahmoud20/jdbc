/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Technical
 */
public class JavaApplication28 {
  public static void main(String args[]) {
    Semaphore sem = new Semaphore(2);
    new Producer(sem, "A");
    new Consumer(sem, "B");
    new Consumer(sem, "C");
    new Consumer(sem, "D");
    
    System.out.println(sem.availablePermits());
    System.out.println(sem.hasQueuedThreads());
    
  }
}
class Shared {
  static int count = 0;
}
class Producer implements Runnable {
  String name;
  Semaphore sem;

  Producer(Semaphore s, String n) {
    sem = s;
    name = n;
    new Thread(this).start();
  }
  public void run() {
    try {
      sem.acquire();
      for (int i = 0; i < 5; i++) {
        System.out.println(name + ": " + Shared.count++);
        Thread.sleep(1000);
      }
    } catch (InterruptedException exc) {
      System.out.println(exc);
    }
    sem.release();
  }
}
class Consumer implements Runnable {
  String name;
  Semaphore sem;
  Consumer(Semaphore s, String n) {
    sem = s;
    name = n;
    new Thread(this).start();
  }
  public void run() {
    try {
      sem.acquire();
      for (int i = 0; i < 5; i++) {
        System.out.println(name + ": " + Shared.count--);
        Thread.sleep(1000);
      }
    } catch (InterruptedException exc) {
      System.out.println(exc);
    }
    sem.release();
  }
}