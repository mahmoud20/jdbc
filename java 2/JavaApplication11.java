/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author Technical
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1=10;
	int num2=0;

        try{
	int res=num1/num2;
	System.out.println(res);
        }catch (ArithmeticException exp){
            System.out.println("Invalid calculation"); 
            System.out.println (exp.getMessage());
        }
       
        /************************************/
        
        
        try{
            
            
         int a[]=new int[7];
         a[9]=30/10;
         System.out.println("First print statement in try block");
     
       
        }
     catch(ArithmeticException e){
        System.out.println("Warning: ArithmeticException");
     }
     catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Warning: ArrayIndexOutOfBoundsException");
     }
     catch(Exception e){
        System.out.println("Warning: Some Other exception");
     }finally{
        System.out.println("Out of try-catch block...");
     }
   
    
        
       /* */
       
     System.out.println("Welcome to the Registration process!!");
    
     try{
     checkEligibilty(10,50 ); 
     System.out.println("Passed registration"); 
     }catch(ArithmeticException e){
         System.out.println(e.getMessage());
     }

            
    }
    
     static void checkEligibilty(int stuage, int sturesult){ 
      if(stuage<12 || sturesult<40) {
         throw new ArithmeticException("Student is not eligible for registration"); 
      }
      else {
         System.out.println("Entries Valid!!"); 
      }
   } 
    
}
