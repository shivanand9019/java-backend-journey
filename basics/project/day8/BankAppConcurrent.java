import java.util.*;

class BankAccount {
    private String user;
    private double balance;
    private List<String> history = new ArrayList<>();

    
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public BankAccount(String user) {
    
        this.user = user;
    }

    public synchronized void deposite(double amount){

        balance +=amount;
        history.add("Deposited: " + amount);
    }

    public synchronized void withdraw(double amount){
        if(balance>=amount){
            balance -= amount;
            history.add("Withdrawn: " + amount);
            
        }else{
            history.add("Failed Withdrawal Attempt: " + amount+ " (Insufficient Balance)");
        }


    }
    public double  getBalance(){
        return balance;

    }
    public void showHistory(){
        System.out.println("Transaction History:");
        for(String record : history){
            System.out.println(record);
        }
    }

    public List<String> getHistory() {
        return history;
    }

    public String getUser() {
        return user;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }


    
}

public class BankAppConcurrent {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(10000);

        Runnable t1 = ()-> {
          for(int i=0;i<5;i++)
            account.deposite(100);
        };

        Runnable t2 = ()-> {
          for(int i=0;i<5;i++)
            account.withdraw(1000);
        };

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();

        System.err.println("Final Balance: " + account.getBalance());
        account.showHistory();
    }
    
}
