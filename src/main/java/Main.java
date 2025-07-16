import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("How many employees?: ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Emplyee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Long id = sc.nextLong();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            Employee employee = new Employee(id, name, salary);
            list.add(employee);
        }

        System.out.println();
        System.out.println("Enter the employee that will have salary increase: ");
        int idIncrease = sc.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);

        if (emp != null) {
            System.out.println("Enter the porcentage:");
            double porcentage = sc.nextDouble();
            emp.increaseSalary(porcentage);
        }else {
            System.out.println("Employee not found");
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee employee : list) {
            System.out.println(employee);
        }

    }
}
