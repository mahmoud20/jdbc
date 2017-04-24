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
 public class PlayingCard extends Card{
      
      String suit;
      int rank;
      
      public PlayingCard(int h, int w, String s, int r){
          super(h,w);
          suit = s;
          rank = r;
          
      }
      
      public String toString(){
          return "Playing Card :\nWidth = "+width+", Height = "+height+
                  "\nSuit = "+suit+", Rank = "+rank;
      }
      
  }
