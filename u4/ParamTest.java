package u4;

public class ParamTest {
    public static void main(String[] args) {
        //Test1
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before:" + percent);
        tripleValue(percent);
        System.out.println("After:" + percent);

        //Test2
        System.out.println("\nTesting tripleSalary:");
        Employee harry = new Employee("harry", 50000);
        System.out.println("Before:" + harry);
        tripleSalary(harry);
        System.out.println("After:" + harry);

        //Test3
        System.out.println("\nTesting swap:");
        Employee a = new Employee("marry", 70000);
        Employee b = new Employee("bob", 60000);
        System.out.println("Before:a=" + a.getName() + "," + "b=" + b.getName());
        swap(a, b);
        System.out.println("After:a=" + a.getName() + "," + "b=" + b.getName());
    }

    private static void swap(Employee x, Employee y) {
        Employee tmp = x;
        x = y;
        y = tmp;
        System.out.println("End of the method:x=" + x.getName() + "," + y.getName());
    }

    private static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("End of the method:" + x);
    }

    private static void tripleValue(double x) {
        x = x * 3;
        System.out.println("End of the method:" + x);
    }
}
