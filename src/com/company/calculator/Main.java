package com.company.calculator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee employee = null;  //array list
        Province province = null;
        double calculatedResult = 0.0;
        employee = new Employee("Abdul Rehman", "Punjab", 25, 750);
        employees.add(employee);
        employee = new Employee("Qasim", "Sindh",35, 870);
        employees.add(employee);
        employee = new Employee("yasir", "KPK",45, 950);
        employees.add(employee);
        employee = new Employee("Hamza", "Blochistan",50, 1000);
        employees.add(employee);

        for (Employee employe: employees){

            if(employe.province == "Punjab"){
                province = new Punjab();
                calculatedResult = province.calculateSalery(employe.hoursWorked, employe.name);
                System.out.println("Salery of " + employe.name + " is: " + calculatedResult );

            }else if(employe.province == "Sindh"){

                province = new Sindh();
                calculatedResult = province.calculateSalery(employe.hoursWorked, employe.name);
                System.out.println("Salery of " +employe.name + " is: " + calculatedResult );

            }else{
                province = new Others();
                calculatedResult = province.calculateSalery(employe.hoursWorked, employe.name,employe.baseSalery );
                System.out.println("Salery of " + employe.name + " is: " + calculatedResult );
            }
        }

    }
}
