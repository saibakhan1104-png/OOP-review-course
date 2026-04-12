
public class Employee implements Cloneable {

    private String name;
    private int age;
    private double salary;
    public Employee() {
        this.name = "Unknown";
        this.age = 18;
        this.salary = 0.0;
    }
    public Employee(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name! Keeping previous value.");
        }
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 65) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Must be between 18 and 65.");
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary! Must be >= 0.");
        }
    }

    public double calculateAnnualSalary() {
        return this.salary * 12;
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100);
        } else {
            System.out.println("Invalid percentage!");
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("----- Employee Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
