package A1;

public class Employee {
    int YOJ;
    String name;
    String Address;
    Employee(String name, int YOJ, String Address) {
        this.name = name;
        this.YOJ = YOJ;
        this.Address = Address;
    }

    void printEmpDetails() {
        System.out.println(name+"\t"+YOJ+"\t"+Address);
    }

    public static void main(String[] args) {
        System.out.println("Name\tYear of Joining\tAddress"); 
        Employee E1 = new Employee("Robert", 1994, "64C WallsStreat");
        Employee E2 = new Employee("Sam", 2000, "68D WallsStreat");
        Employee E3 = new Employee("Robert", 1999, "26B WallsStreat");

        E1.printEmpDetails();
        E2.printEmpDetails();
        E3.printEmpDetails();
    }
}