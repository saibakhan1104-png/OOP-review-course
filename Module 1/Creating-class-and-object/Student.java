
public class Student {

    private String studentId;
    private String name;
    private double grade;
    private boolean isActive;

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade!");
        }
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void displayDetails() {
        String status = isActive ? "Active" : "Inactive";
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);
    }

    public String getLetterGrade() {
        if (grade >= 80) return "A+";
        else if (grade >= 75) return "A";
        else if (grade >= 70) return "B";
        else if (grade >= 60) return "D";
        else return "F";
    }

    public boolean isPassing() {
        return grade >= 40;
    }
}
