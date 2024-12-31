package A1;

public class Rectangle {
    int l,b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    int Area() {
        return l*b;
    }

    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(4, 5);
        System.out.println("Area of Rectangle :"+ R1.Area());

        Rectangle R2 = new Rectangle(5, 8);
        System.out.println("Area of Rectangle :"+ R2.Area());
    }
}
