//Fazer um programa para ler dados de um funcionario. em seguida, mostrar os dados do funcionario.
//Em seguida, aumentar o salario do funcionario com base em uma % dada e mostrar o salario novamente.

package application;

import entity.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Enter Employee Name:");
        employee.name =  sc.nextLine();
        System.out.println("Enter Employee Gross Salary:");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Enter Employee Tax:");
        employee.tax =  sc.nextDouble();

        System.out.println(employee.toString());
        System.out.println("Enter Employee Salary Increment Based In Percentage: ");
        double percentage = sc.nextDouble();
        employee.incriseSalary(percentage);
        System.out.println(employee.toString());

    }
}
