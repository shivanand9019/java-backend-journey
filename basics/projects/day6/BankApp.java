import java.util.*;

class BankAccount{
    private String user;
    private double balance;
    private List<String> history = new ArrayList<>();

    
    public BankAccount(String user, double balance) {
        this.user = user;
        this.balance = balance;
    }


    public void deposite(double amount){

        balance +=amount;
        history.add("Deposited: " + amount);
    }

    public void withdraw(double amount){
        if(balance>=amount){
            balance -= amount;
            history.add("Withdrawn: " + amount);
            
        }else{
            history.add("Failed Withdrawal Attempt: " + amount+ " (Insufficient Balance)");
        }


    }
    public void checkBalance(){
        System.out.println("Available Balance is :" + balance);

    }
    public void showHistory(){
        System.out.println("Transaction History:");
        for(String record : history){
            System.out.println(record);
        }
    }


    
}
public class BankApp {
    public static void main(String[] args) {
            BankAccount account = new BankAccount("Shiva",10000);

            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Welcome to the Online *BankApp* ");
                while (true) { 
                    System.out.println("\n1.Deposite\n2.Withdraw\n3.CheckBalance\n4.showHistory\n5.Exit");
                    System.out.println("Enter Your choice:");
                    int choice = sc.nextInt();

                    switch(choice){
                        
                        case 1 -> {
                            System.out.println("Enter the Amount :");
                            account.deposite(sc.nextDouble());
                            break;
                        }


                        case 2 -> {
                            System.out.println("Enter the Amount :");
                            account.withdraw(sc.nextDouble());
                            break;
                        }
                        
                        case 3 -> {
                            account.checkBalance();
                            break;
                        }
                        case 4 ->{
                            account.showHistory();
                            break;
                        }
                        case 5 -> {
                            System.out.println("Exiting.....");
                            return;
                        }

                    }
                }
            } 
    }
}