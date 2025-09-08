import java.util.*;

class BankAccount{
    private String user;
    private double balance;

    
    public void setUser(String user){

        this.user = user;
        
    }

    public void setBalance(double balance){
        this.balance = balance;
       
    }


    public void deposite(double amount){

        balance +=amount;
        System.out.println("Amount Deposited Successful" + amount);
    }

    public void withdraw(double amount){
        if(balance>=amount){
            balance -= amount;
            System.out.println(" Amount withdrawn is:"+ amount);
        }else{
            System.out.println("Insufficent Balance"+ balance);

        }


    }
    public void checkBalance(){
        System.out.println("Available Balance is :" + balance);
    }

    public String getUser() {
        return user;
    }
    

    
}
public class BankApp {
    public static void main(String[] args) {
            BankAccount account = new BankAccount();

            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Welcome to the Online *BankApp* ");
                while (true) { 
                    System.out.println("\n1.AddUser\n2.AddInitialBalance\n3.Deposite\n4.Withdraw\n5.CheckBalance\n6.checkUser\n7.Exit");
                    System.out.println("Enter Your choice:");
                    int choice = sc.nextInt();

                    switch(choice){
                        case 1 -> {
                            System.out.println("Enter the UserName :");
                            account.setUser(sc.nextLine());
                            sc.nextLine();
                            System.out.println("User Added Successfully!");
                            break;
                        }
                        case 2-> {
                            System.out.println("Enter the Initial Amount :");
                            account.setBalance(sc.nextDouble());
                             System.out.println("Initial Balance Added Successfully");
                            break;
                        }
                        case 3 -> {
                            System.out.println("Enter the Amount :");
                            account.deposite(sc.nextDouble());
                            break;
                        }


                        case 4 -> {
                            System.out.println("Enter the Amount :");
                            account.withdraw(sc.nextDouble());
                            break;
                        }
                        
                        case 5 -> {
                            account.checkBalance();
                            break;
                        }
                        case 6 ->{
                            account.getUser();
                            break;
                        }
                        case 7 -> {
                            System.out.println("Exiting.....");
                            return;
                        }

                    }
                }
            } 
    }
}