package Assignment3;
import java.util.Scanner;

public class Q3 {

    static void sort(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = 0; j < charArray.length - 1 - i; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
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
