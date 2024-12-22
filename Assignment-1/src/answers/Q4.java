package answers;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No :");
        int no = sc.nextInt();
        int ch = 0;
        String[] split = String.valueOf(no).split("");

        for (int i = 0; i < split.length; i++) {
            ch += Math.pow(Integer.valueOf(split[i]), split.length);
            System.out.println(ch);
        }

        if (ch == no) {
            System.out.println(ch + " is a Armstrong Number");
        } else {
            System.out.println(ch + " is not a Armstrong Number");
        }

    }
}