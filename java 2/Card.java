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
    public class Card {
 
      int height;
      int width;
      
      public Card(int h, int w){
          
          height = h;
          width = w;
          
      }
      
      public int getSize(){
          return height*width;
      }
      
      public String toString(){
          return "Card :\nWidth = "+width+", Height = "+height;
      }
      
  
}
