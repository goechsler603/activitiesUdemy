

public class Employee {

    private Long id;
    private String name;
    private double salary;

    public Employee(Long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percent) {
        double aux = (percent * 0.01) * salary;
        salary += aux;
    }

    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }

}
