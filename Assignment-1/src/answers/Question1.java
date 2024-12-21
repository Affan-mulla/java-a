package answers;

import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. between 1 to 12 :");
		no = sc.nextInt();
		if (no > 12 || no < 0) {
			System.out.println("Invalid Month!");
		} else if (no == 2) {
			System.out.println("28 days");
		} else if (no == 8 || no == 12) {
			System.out.println("31 days");
		} else if ((no % 2) == 0) {
			System.out.println("30 days");
		} else if ((no % 2) != 0) {
			System.out.println("31 days");
		}
	}
}
