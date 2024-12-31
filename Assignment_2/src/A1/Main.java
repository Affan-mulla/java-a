package A1;

public class Main {
    public static void main(String[] args) {
        EmployeeOfMember E1 = new EmployeeOfMember();
        E1.name = "Affan";
        E1.Address = "Bharuch";
        E1.age = 20;
        E1.phoneNumber = 1234567890;
        E1.salary = 40000;

        E1.printSalary();
        
        Manager M1 = new Manager();
        M1.name = "John";
        M1.Address = "New York";
        M1.age = 35;
        M1.phoneNumber = 987654321;
        M1.salary = 75000;

        M1.printSalary();

    }
}
