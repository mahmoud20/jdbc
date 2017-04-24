/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsync;

/**
 *
 * @author Technical
 */

 class SyncThr {
    public static void printSync(String s) {
        System.out.println(s+"\n");
    }
}

class TestThread extends Thread {
    String name;
    TheDemo theDemo;
    public TestThread(String name,TheDemo theDemo) {
        this.theDemo = theDemo;
        this.name = name;
        start();
    }
    @Override
    public void run() {
        theDemo.test(name);
    }
}
class TheDemo {
    public synchronized void test(String name) {
        for(int i=0;i<10;i++) {
            SyncThr.printSync(name + " :: "+i);
            try{
                Thread.sleep(500);
            } catch (Exception e) {
                SyncThr.printSync(e.getMessage());
            }
        }
    }
}
    
public class TestSync {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TheDemo theDemo = new TheDemo();
        new TestThread("THREAD 1",theDemo);
        new TestThread("THREAD 2",theDemo);
        new TestThread("THREAD 3",theDemo);
        
    }
    
}
