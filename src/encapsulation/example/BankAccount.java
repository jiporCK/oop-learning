package encapsulation.example;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Amount must be greater than 0");
        } else {
            balance += amount; // balance = balance + amount
        }
    }

    public void withDraw(double amount) {
        if (amount > balance) {
            System.out.println("You don't have enough money!");
        } else {
            balance -= amount; // balance = balance - amount
        }
    }

    public double getBalance() {
        return balance;
    }

}
