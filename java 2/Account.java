/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Date;

/**
 *
 * @author Technical
 */
public class Account {
    
    String ID;
    String OwmerName;
    String AccountType;
    static double WithDrawLimit=5000;
    private double balance=15000;
    Date lastTransactionDate;
    
    Account () {
        
    }
    
    Account (String i,String type) {
        ID = i;
        AccountType = type;
    }
    
    double getbalance () {
        return balance;
    }
    
    void deposit (double v) {
        balance = balance + v;
        System.out.println("Successful deposit " + v + " and balance now is " + balance);
    }
    
    void WithDrawLimit (double v, Date withdrawDate) {
        
        //Date cur = new Date();
        if (v>WithDrawLimit) {
        //if (v>WithDrawLimit && !lastTransactionDate.equals(withdrawDate)) {
            System.out.println("Above limit");
            
        }
        else if (v>balance) {
            System.out.println("NO Sufficiant Balance");
        }
        else {
            if( withdrawDate.after(lastTransactionDate)){
            balance = balance - v;
            System.out.println("SuccessfulWithDraw " + v + " balance now is " + balance);
            lastTransactionDate = new Date();
            WithDrawLimit= WithDrawLimit - v;
            }else{
                System.out.println("Exceeded allowed limit per day, you may withdraw agian after 12 midnight");
            }
            

        }
    }
    
    void transfer (Account acc , double amount) {
        WithDrawLimit (amount, new Date());
        acc.deposit(amount);
    }
    
    
}

