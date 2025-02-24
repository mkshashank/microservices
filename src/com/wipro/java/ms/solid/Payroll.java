package com.wipro.java.ms.solid;

class Payroll {
    public double calculateBonus(Employee employee) {
        return employee.getSalary() * 0.1; // 10% bonus
    }
}
