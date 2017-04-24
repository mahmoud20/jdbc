/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaex;

/**
 *
 * @author Technical
 */
public class LambdaEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         LambdaEx tester = new LambdaEx();
		
      //with type declaration
      MathOperation addition = (int a, int b) -> a + b;
		
      //with out type declaration
      MathOperation subtraction = (a, b) -> a - b;
		
      //with return statement along with curly braces
      MathOperation multiplication = (int a, int b) -> { return a * b; };
		
      //without return statement and without curly braces
      MathOperation division = (int a, int b) -> a / b;
		
      /*System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
        */
      System.out.println("div "+division.operation(60, 3));
      
      //with parenthesis
      Greeting greetService1 = message ->
      System.out.println("Hello " + message);
		
      //without parenthesis
      Greeting greetService2 = (message) ->
      System.out.println("Hello " + message);
		
      greetService1.sayMessage("Maha");
      greetService2.sayMessage("Dina");
   }
	
   interface MathOperation {
      int operation(int a, int b);
   }
	
   interface Greeting {
      void sayMessage(String message);
   }
	
   private int operate(int a, int b, MathOperation mathOperation){
      return mathOperation.operation(a, b);
    }
    
}
