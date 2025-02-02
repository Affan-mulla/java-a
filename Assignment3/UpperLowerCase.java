package Assignment3;

public class UpperLowerCase {

    static void lowerCase(String str) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if ((int)arr[i] > 65 && (int)arr[i] < 98) {
                arr[i] = (char)((int)arr[i] - 65 + 97);
            }
        }

        for (char c : arr) {
            System.out.print(c);
        }
    }
    static void upperCase(String str) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if ((int)arr[i] > 96 && (int)arr[i] < 123) {
                arr[i] = (char)((int)arr[i] - 97 + 65 );
            }
        }

        for (char c : arr) {
            System.out.print(c);
        }
    }
    public static void main(String[] args) {
        String str = "hello world";
        upperCase(str);
    }
}
