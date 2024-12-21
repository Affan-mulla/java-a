package answers;

import java.util.*;

public class Question3 {

    public static void main(String[] args) {

        System.out.println("Enter no between 1 to 10 :");
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();

        String numberInWords;
        switch (no) {
            case 1:
                numberInWords = "one";
                break;
            case 2:
                numberInWords = "two";
                break;
            case 3:
                numberInWords = "three";
                break;
            case 4:
                numberInWords = "four";
                break;
            case 5:
                numberInWords = "five";
                break;
            case 6:
                numberInWords = "six";
                break;
            case 7:
                numberInWords = "seven";
                break;
            case 8:
                numberInWords = "eight";
                break;
            case 9:
                numberInWords = "nine";
                break;
            case 10:
                numberInWords = "ten";
                break;
            default:
                numberInWords = "Invalid number";
        }
        System.out.println("The number " + no + " in words is: " + numberInWords);

    }

}
