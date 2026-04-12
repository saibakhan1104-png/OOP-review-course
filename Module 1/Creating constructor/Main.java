public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ali", 30, 10000);

        e1.displayEmployeeDetails();

        e1.giveRaise(10);

        System.out.println("\nAfter raise:");
        e1.displayEmployeeDetails();

        try {
            Employee e2 = (Employee) e1.clone();

            System.out.println("\nCloned Employee:");
            e2.displayEmployeeDetails();

        } catch (CloneNotSupportedException ex) {
            System.out.println("Cloning not supported");
        }
    }
}
