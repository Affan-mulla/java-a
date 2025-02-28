
package employee;

public class Emp {
    // Employee details
    private String name;
    private int empid;
    private String category;
    private double bpay, hra, da, npay, pf, grosspay, incometax, allowance;

    // Constructor
    public Emp(String name, int empid, String category, double bpay) {
        this.name = name;
        this.empid = empid;
        this.category = category;
        this.bpay = bpay;
        calculatePayroll(); // Call method to calculate salary components
    }

    // Method to calculate salary components
    private void calculatePayroll() {
        hra = 0.20 * bpay; // HRA is 20% of basic pay
        da = 0.10 * bpay; // DA is 10% of basic pay
        allowance = 0.05 * bpay; // Additional allowance 5% of basic pay
        grosspay = bpay + hra + da + allowance; // Total Gross Pay
        pf = 0.12 * bpay; // Provident Fund is 12% of basic pay
        incometax = 0.10 * grosspay; // Income Tax is 10% of Gross Pay
        npay = grosspay - (pf + incometax); // Net Pay after deductions
    }

    // Method to display employee payroll details
    public void displayPayroll() {
        System.out.println("--------------------------------------------------");
        System.out.println("Employee ID   : " + empid);
        System.out.println("Employee Name : " + name);
        System.out.println("Category      : " + category);
        System.out.println("Basic Pay     : " + bpay);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Allowance     : " + allowance);
        System.out.println("Gross Pay     : " + grosspay);
        System.out.println("Provident Fund: " + pf);
        System.out.println("Income Tax    : " + incometax);
        System.out.println("Net Pay       : " + npay);
        System.out.println("--------------------------------------------------");
    }
}
