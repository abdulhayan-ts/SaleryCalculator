package com.company.calculator;

public class Employee {
    String name;
    String province;
    int hoursWorked;
    int baseSalery;

    public Employee(String name, String province, int hrsWorked, int baseSalery){
        this.name = name;
        this.hoursWorked = hrsWorked;
        this.baseSalery = baseSalery;
        this.province = province;
    }
}
