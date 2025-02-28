
package answers;

class T1 extends Thread {

    public void run() {
        System.out.println("Thread 1 is running.");
    }
    
}

class T2 extends Thread {

    public void run() {
        System.out.println("Thread 2 is running.");
    }
    
}

public class Q3 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();

        System.out.println("Default Priority of T1: " + t1.getPriority());
        System.out.println("Default Priority of T2: " + t2.getPriority());
        
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Updated Priority of T1: " + t1.getPriority());
        System.out.println("Updated Priority of T2: " + t2.getPriority());

        t1.start();
        t2.start();
    }
}
