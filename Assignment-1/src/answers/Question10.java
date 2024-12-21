package answers;

import java.util.*;

public class Question10 {

    static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    static void takeArr(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.println("Enter " + i + " x " + j + " :");
                arr[i - 1][j - 1] = sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] arr3 = new int[3][3];

        System.err.println("Enter 1st Matrix : ");
        takeArr(arr);

        System.err.println("Enter 2nd Matrix : ");

        takeArr(arr2);

        System.out.println(" first Matrix of 3x3 :");
        printArr(arr);

        System.out.println(" second Matrix of 3x3 :");
        printArr(arr2);

        System.err.println("Addition of this Matrices :");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr3[i][j] = arr[i][j] + arr2[i][j];
            }
        }

        printArr(arr3);

        System.err.println("Subtraction of this Matrices :");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr3[i][j] = arr[i][j] - arr2[i][j];
            }
        }

        printArr(arr3);

        System.out.println("Multiplication of Matrices :");

        for (int i = 0; i < arr3.length; i++) {
            int a = 0;
            for (int j = 0; j < arr3.length; j++) {
                a += arr[i][j] * arr2[j][i];
            }
            arr3[i][i] = a;
        }

        printArr(arr3);
    }
}