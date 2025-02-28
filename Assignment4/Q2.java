package Assignment4;

class goodMorning extends Thread {
    public void run() {

        while (true) {
            System.out.println("Good Morning");
        }
    }
}

class welcome extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
                System.out.println("Welcome");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

public class Q2 {
    public static void main(String[] args) {
        welcome t2 = new welcome();
        t2.start();
    }
}
