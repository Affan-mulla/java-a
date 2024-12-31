package A1;

import java.util.*;

public class Area {

	int l;
	int b;

	void setDim(int l, int b) {
		this.l = l;
		this.b = b;
	}

	void getArea() {
		int area = l * b;
		System.out.println("Area :" + area);
	}

	public static void main(String[] args) {
		Area a = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth: ");
		
		a.setDim(sc.nextInt(),sc.nextInt());
		a.getArea();
	}

}