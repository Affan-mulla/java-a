package employee;

import java.util.Scanner;

public class Emppay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int empid = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Category: ");
        String category = sc.nextLine();
        System.out.print("Enter Basic Pay: ");
        double bpay = sc.nextDouble();

        // Creating object of Emp class
        Emp e = new Emp(name, empid, category, bpay);

        // Display payroll details
        e.displayPayroll();

        sc.close();
    }
}
