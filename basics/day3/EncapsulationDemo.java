class Account {
    private String owner;
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getowner() {
        return owner;
    }

    public double getbalance() {
        return balance;
    }

    public void Setowner(String owner) {
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");

    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Account acc = new Account("Shivu", 10000);
        acc.deposit(120);
        acc.withdraw(230);
        System.out.println(acc.getowner() + "blanace:" + acc.getbalance());

    }

}
