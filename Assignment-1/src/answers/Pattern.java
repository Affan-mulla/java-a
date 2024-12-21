package answers;

public class Pattern {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				if(j==5) {
					System.out.println("");
					for (int j2 = 5; j2 > 0; j2--) {
						for (int k = 1; k < j2; k++) {
							System.out.print(k);
						}
						System.out.println("");
					}
				}
			}
			System.out.println("");
		}
	}
}