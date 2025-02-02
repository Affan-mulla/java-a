package Assignment3;

public class Q2 {

    static void countEverything(String str) {
        System.out.println("String :"+str);
        String[] arr = str.split("[a,e,i,o,u]");
        System.out.println("Vowels :"+(arr.length-1));

        str = "";
        for (int i = 0; i < arr.length; i++) {
            str+=arr[i];
        }
        consonants(str.toCharArray());
    }

    static void consonants(char[] arr) {
        int consonants = 0,digit = 0, WS = 0;
        
        for (char string : arr) {
            if((int)string > 65 && (int)string< 123 ) {
                consonants++;
            }else if((int)string > 47 && (int)string < 58 ) {
                digit++;
            } else if((int)string == 32) {
                WS++;
            }
        }
        System.out.println("Consonants : "+consonants);
        System.out.println("Digit : "+digit);
        System.out.println("WhiteSpace : "+WS);
        
    }
    public static void main(String[] args) {
        String str = "Hello World 123";
        countEverything(str);
    }
}
