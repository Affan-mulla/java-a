package A1;

public class Student {
    String STD_Name;

    Student() {
        this.STD_Name = "Unknown";
        System.out.println("Student Name :"+STD_Name);
    }

    Student(String STD_Name) {
        this.STD_Name = STD_Name;
        System.out.println("Student Name :"+STD_Name);
    }


    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student("Affan");
    }
}
