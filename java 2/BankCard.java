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
public class BankCard extends Card{
 
      String number;
      String holderName;
      
      public BankCard(int h, int w, String n, String hN ){
          super(h,w);
          number = n;
          holderName = hN;
      }
      
      public String toString(){
          return "BankCard :\nWidth = "+width+", Height = "+height+
                  "\nNumber = "+number+", Holder Name = "+holderName;
      }
      
      public String getBankCode(){
          return number.substring(5);
      }
      
  }