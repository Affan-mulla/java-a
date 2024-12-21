package answers;

import java.util.*;

public class Question2 {

    static void reverseTheNo(int no) {
        String[] revTo = String.valueOf(no).split("");
        System.out.print("Reverse No :");
        for (int i = revTo.length-1; i >= 0; i--) {
            System.out.print(revTo[i]);
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no :");
        int no = sc.nextInt();
        reverseTheNo(no);
    }
}
