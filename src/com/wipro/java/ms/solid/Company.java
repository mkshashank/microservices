package com.wipro.java.ms.solid;

public class Company {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 50000);

        Payroll payroll = new Payroll();
        System.out.println("Bonus: Rs." + payroll.calculateBonus(emp));

        ReportGenerator reportGen = new ReportGenerator();
        reportGen.generateReport(emp);
    }
}

