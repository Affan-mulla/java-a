package A1;

import java.util.Scanner;

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
        System.out.println(name + "\t" + YOJ + "\t" + Address);
    }

    static String takeName() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name:");
        String name = sc.next();

        return name;
    }

    static int takeYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age :");
        int year = sc.nextInt();

        return year;
    }

    static String takeAddress() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Address :");
        String Address = sc.next();

        return Address;
    }

    public static void main(String[] args) {

        Employee E1 = new Employee(takeName(), takeYear(), takeAddress());
        Employee E2 = new Employee(takeName(), takeYear(), takeAddress());
        Employee E3 = new Employee(takeName(), takeYear(), takeAddress());

        System.out.println("Name\tYear of Joining\tAddress");
        E1.printEmpDetails();
        E2.printEmpDetails();
        E3.printEmpDetails();
    }
}