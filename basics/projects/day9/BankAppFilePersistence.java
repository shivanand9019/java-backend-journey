import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class BankAccount{
    private String user;
    private double balance;
    private List<String> history = new ArrayList<>();

    
    // public BankAccount(String user, double balance) {
    //     this.user = user;
    //     this.balance = balance;
    // }
    public  BankAccount(String user,double  balance) {
        this.user = user;
        this.balance = balance;
        loadFromFile();
    }

    public void setbalance(double balance) {
        this.balance = balance;
    }
    public void deposite(double amount){

        balance +=amount;
        history.add("Deposited: " + amount);
        System.out.println("Amount deposited Successfully:"+amount);
        saveToFile();
    }

    public  void withdraw(double amount){
        if(balance>=amount){
            balance -= amount;
            history.add("Withdrawn: " + amount);
            System.out.println("Amount withdrawn Successful:"+ amount);
            
        } else {
            history.add("Failed Withdrawal Attempt: " + amount + " (Insufficient Balance)");
            System.out.println("Failed Withdrawal Attempt: "+ amount + " (Insufficient Balance)");
        }
        saveToFile();


    }

    public double getBalance() {
        return balance;
        

    }

    public void showHistory() {
        System.out.println("Transaction History:");
        for (String record : history) {
            System.out.println(record);
        }
    }

    private void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Account.txt"))) {
            bw.write("Account:" + user);
            bw.newLine();
            bw.write("Balance:" + balance);
            bw.newLine();
            bw.write("Transcations:" + String.join(",", history));
            bw.newLine();
            bw.write("-------");

        } catch (IOException ex) {
        }
    }

    private  void loadFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("Account.txt"))) {
            
        } catch (FileNotFoundException e) {
        
            e.printStackTrace();
        } catch (IOException e) {
            
            e.printStackTrace();
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


public class BankAppFilePersistence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount("shiva", 10009);

        while (true) {
            System.out.println("\n1.Deposite\n2.Withdraw\n3.check Balance\n4.History\n5.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter ammount:");
                    account.deposite(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter ammount:");
                    account.withdraw(sc.nextDouble());
                    break;

                case 3:
                System.out.println("Available Balance is:" + account.getBalance());
                    
                    break;

                case 4:
                    account.showHistory();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid Choice try again");
            }

        }

    }
}

