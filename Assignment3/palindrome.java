package Assignment3;

public class palindrome {
    static boolean check(String str) {
        String[] arr = str.split("");

        int f = 0,l = arr.length - 1;

        while (f<l) {
            if (!arr[f].equals(arr[l])) {
                System.out.println("Not Palindrome.");
                return false;
            }
            f++;
            l--;
        }
        System.out.println("String is Palindrome.");
        return true;
    }
    public static void main(String[] args) {
        String str = "MOM MOM";
        check(str);
    }
}