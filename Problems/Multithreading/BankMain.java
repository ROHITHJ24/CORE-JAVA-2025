class BankAccount {
    int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw but insufficient balance!");
        }
    }
}

class Customer extends Thread {
    BankAccount account;

    Customer(BankAccount account, String name) {
        super(name);
        this.account = account;
    }

    public void run() {
        account.deposit(500);
        account.withdraw(300);
    }
}

public class BankMain {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        Customer c1 = new Customer(account, "JOHN");
        Customer c2 = new Customer(account, "ROHITH");

        c1.start();
        c2.start();

        c1.join();
        c2.join();

        System.out.println("Final Balance: " + account.balance);
    }
}
