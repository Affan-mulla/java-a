package answers;
class T extends Thread {
    public void run() 
    {
        System.out.println("Thread is running...");
        System.out.println(Thread.currentThread().getName());
    }
    
}
public class Q4 {
    public static void main(String[] args) {
        T t = new T();
        t.start();
    }
}
