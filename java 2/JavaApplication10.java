/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.ArrayList;

/**
 *
 * @author Technical
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     /*   Match m = new Match ();
        m.setCourt("CC2");
        m.eventPlace();
        */
          ArrayList<String> obj = new ArrayList<String>();

	  /*This is how elements should be added to the array list*/
	  obj.add("Dina");
	  obj.add("Maha");
	  obj.add("Harry");
	  obj.add("Ag");
	  obj.add("Mai");
          
          obj.add(2,"abx");
          System.out.println("Current array list is:"+obj);
          obj.set(2, "xyz");
          
          System.out.println("Current array list is:"+obj);
          
          
          obj.remove(3);
          obj.remove("Ag");
           System.out.println("Current array list is:"+obj);
          
           System.out.println("Current array list is:"+obj.get(3));
           
           
           System.out.println("Current array list is:"+obj.contains("Ag"));
           
           System.out.println("Current array list is:"+obj.indexOf("xyz"));
           
           System.out.println("Current array list is:"+obj.size());
                   
          obj.clear();
          
           System.out.println("Current array list is:"+obj);

                    ArrayList<Integer> obj2 = new ArrayList<Integer>();
                    
            obj2.add(4);
    }
    
}
