package u4;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Tom", 75000, 1987, 12, 15);
        staff[1] = new Employee("Mary", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tim", 40000, 1990, 3, 15);


        for (Employee e : staff) {
            e.setId();
            System.out.println(e.toString());
//            e.raiseSalary(5);
        }

        int n = Employee.getNextId();
        System.out.println("Next available id=" + n);

/*
        for (Employee e : staff) {
            System.out.println(e.toString());
        }
*/
    }
}