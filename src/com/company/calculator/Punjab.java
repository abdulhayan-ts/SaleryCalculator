package com.company.calculator;

public class Punjab extends Province{
    final int HOURS_RATE = 800;
    final int OVER_TIME_THRESHOLD = 55;
    final int STANDARD_THRESHOLD = 20;
    public double calculateSalery(int hrs, String name){
        if (hrs <STANDARD_THRESHOLD || hrs > OVER_TIME_THRESHOLD){
            return 0.0;
        }else {
           return (hrs * HOURS_RATE);
        }
    }
}
