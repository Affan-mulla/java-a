package answers;
import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no :");
        int no = sc.nextInt();
        int ch = 0;
        for (int i = 1; i < no; i++) {
            if((no%i) == 0) {
                ch += i; 
            }
        }
        if(ch==no) {
            System.out.println("Yeah "+no+" is perfect number");
        }
        else {
            System.out.println("No "+no+" is not perfect number");
        }
    }
}