package Assignment3;

import java.util.Scanner;

public class Q6 {
    static int balance = 0;

    static void deposit(int amount) {
        balance += amount;
        System.out.println("Balance :" + balance);
    }

    static void withdraw(int amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Remaining Balance :" + balance);
        }
    }

    static int display(Scanner sc) {
        System.out.println("Enter following Number according to transaction :");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Quit");
        int no = sc.nextInt();

        return no;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int con;
        do {
            con = display(sc);
            switch (con) {
                case 1:
                    System.out.println("Enter amount :");
                    deposit(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter amount :");

                    try {
                        withdraw(sc.nextInt());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Thank You.");
                    break;

                default:
                    System.out.println("Invalid Input.");
                    break;
            }
        } while (con != 3);
    }
}
