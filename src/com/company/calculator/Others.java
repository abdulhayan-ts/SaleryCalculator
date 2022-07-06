package com.company.calculator;

public class Others extends Province {
    final int OVER_TIME_THRESHOLD = 55;
    final int STANDARD_THRESHOLD = 40;
    public double calculateSalery(int hrs, String name, int salery) {
        if (hrs > OVER_TIME_THRESHOLD) {
            return 0.0;
        } else if (hrs > STANDARD_THRESHOLD) {
            return ((hrs * salery) + (1.5 * salery * (hrs - STANDARD_THRESHOLD)));
        } else {
            return (hrs * salery);
        }
    }
}
