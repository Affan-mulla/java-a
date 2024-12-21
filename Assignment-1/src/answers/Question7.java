package answers;

import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        int fact = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The no :");
        int no = sc.nextInt();

        for (int i = 1; i <= no; i++) {
            fact *= i;
        }
        System.out.println("Factorial :" + fact);
    }
}