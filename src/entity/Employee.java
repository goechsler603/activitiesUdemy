package entity;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;



    public double netSalary() {
        return grossSalary - tax;
    }

    public void incriseSalary (double percentage){
         grossSalary += grossSalary * percentage / 100.00;
    }

    public String toString() {
        return "Employee name: " + name + ", $ " + netSalary();
    }
}
