package u4;

import java.util.Random;

public class Employee2 {
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    static{
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    {
        id = nextId;
        nextId++;
    }

    public Employee2(String n, double s){
        name = n;
        salary = s;
    }

    public Employee2(double s){
        this("Employee#" + nextId, s);
    }

    public Employee2(){

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
