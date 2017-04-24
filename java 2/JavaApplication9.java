/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author Technical
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /*   
        PlayingCard pc = new PlayingCard(10, 5, "Hearts", 7);
          System.out.println(pc.toString()+"\n");
          
          Card c = new Card(9,5);
          System.out.println(c.toString()+"\n");
          
          BankCard bc = new BankCard(11, 5, "372831379127", "Mr.X");
          System.out.println(bc.toString()+"\n");
          
          Card c2 = (Card)pc;
          Card c3 = bc;
          
          System.out.println(c2.toString()+"\n");
          System.out.println(c3.toString()+"\n");
          
          */
          //Case
          
          /*BankCard bc = new BankCard(11, 5, "372831379127", "Mr.X");
          Card c3 = (Card)bc;
          
          //System.out.println(c3.getBankCode()+"\n"); //will receive a syntax error, have to type cast
          
          System.out.println(((BankCard)c3).getBankCode()+"\n");
          */
          //case
          
            Card c = new Card(10, 5); 
          BankCard bc = (BankCard)c;
 
     //     System.out.println(bc.getBankCode()+"\n");*/
          //Exception in thread "main" java.lang.ClassCastException: Card cannot be cast to BankCardat Main.main(Main.java:7)
            //Java Result: 1
            
            
            //case
    }
    
}
