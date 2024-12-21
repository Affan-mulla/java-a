import java.util.Scanner;

public class input{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("What is your name ?");
        String name  = s.nextLine();

        System.out.println("Hello "+name);

        System.out.println("How old are u ?");
        int age  = s.nextInt();
        System.out.println("You are "+age+" years old");

    }
}