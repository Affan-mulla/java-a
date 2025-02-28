package Assignment3;
import java.util.Scanner;

public class Q3 {

    static void sort(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = i+1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }

        str= "";
        for (char c : charArray) {
            str+= c;
        }

        System.out.println("Sorted string: " + str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to sort:");
        
        for (int i = 0; i < 10; i++) {
            String input = sc.nextLine();
            sort(input);
        }      
    }
}
