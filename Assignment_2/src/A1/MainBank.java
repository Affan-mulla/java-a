package A1;

public class MainBank {
    public static void main(String[] args) {
        BankA A = new BankA();
        A.getBalance(100);
        BankB B = new BankB();
        B.getBalance(200);
        BankC C = new BankC();
        C.getBalance(300);
    }    
}