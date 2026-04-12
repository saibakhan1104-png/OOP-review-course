public class StudentRegistry {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.setStudentId("IT24001");
        s1.setName("Saiba Khan");
        s1.setGrade(92);
        s1.setIsActive(true);

        s2.setStudentId("IT24002");
        s2.setName("Nilima Khan");
        s2.setGrade(85);
        s2.setIsActive(true);

        System.out.println("Student 1:");
        s1.displayDetails();

        System.out.println("\nStudent 2:");
        s2.displayDetails();

        Student topStudent = compareGrades(s1, s2);
        System.out.println("\nHigher Grade Student: " + topStudent.getName());

        System.out.println("\nLetter Grades:");
        System.out.println(s1.getName() + ": " + s1.getLetterGrade());
        System.out.println(s2.getName() + ": " + s2.getLetterGrade());

        System.out.println("\nPassing Status:");
        System.out.println(s1.getName() + ": " + s1.isPassing());
        System.out.println(s2.getName() + ": " + s2.isPassing());
        s1.setIsActive(false);
        System.out.println("\nUpdated Student 1 Info:");
        s1.displayDetails();
    }

    public static Student compareGrades(Student s1, Student s2) {
        if (s1.getGrade() > s2.getGrade()) {
            return s1;
        } else {
            return s2;
        }
    }
}
