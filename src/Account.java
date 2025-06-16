public class Account {
    private static int nextId = 1;
    private int id;
    private String name;
    private double balance;

    public Account(String name, double initialBalance) {
        this.id = nextId++;
        this.name = name;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
        }
    }

    public void printAccount() {
        System.out.printf("Account ID: %d | Name: %s | Balance: %.2f%n", id, name, balance);
    }

    public static void main(String[] args) {
        Account acc1 = new Account("John", 1000);
        Account acc2 = new Account("Emily", 500);

        acc1.deposit(200);
        acc2.withdraw(100);

        acc1.printAccount();
        acc2.printAccount();
    }
}

