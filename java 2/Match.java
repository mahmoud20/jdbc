/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Date;

/**
 *
 * @author Technical
 */
public class Match extends Sports implements Event, Game{
 
    String court;
    Date start;
    Date end;
    
     public Date eventTiming(){
    // Date d = new Date();
        return this.start;
     }
     
     void setCourt(String court)
     {
         this.court = court;
     }
     public void eventPlace(){
       System.out.println(this.court);
      }
}
