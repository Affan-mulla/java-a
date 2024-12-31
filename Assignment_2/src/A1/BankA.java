package A1;

public class BankA extends Bank {
   
    @Override
    void getBalance(int balance) {
        System.out.println("Bank A :$"+balance);
    }

}