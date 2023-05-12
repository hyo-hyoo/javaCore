package u4;

import java.time.LocalDate;

public class Employee {
    private static int nextId = 1;

    private int id;
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public Employee(String n, double s){
        this.name = n;
        this.salary = s;
        this.id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public boolean equals(Employee other){
        return name.equals(other.name);
    }

    public static int getNextId(){
        return nextId;
    }

/*
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
*/

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee e  = new Employee("Harry", 50000);
        System.out.println(e.getName() + ":" + e.getSalary());
    }
}
