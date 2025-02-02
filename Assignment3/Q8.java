package Assignment3;
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Q8 {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            System.out.println("Error Occurred: " + e.getMessage());
        }
    }
}