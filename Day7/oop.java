class BankAccount {
    int bankBalance;
    int accountNo;
    String name;

    BankAccount(int bankBalance, String name, int accountNo) {
        this.bankBalance = bankBalance;
        this.accountNo = accountNo;
        this.name = name;
    }

    public void deposit(int amount) {
        bankBalance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    public void withdraw(int amount) {
        if (amount > bankBalance) {
            System.out.println("Insufficient balance");
        } else {
            bankBalance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + bankBalance);
        
    }
}

public class oop {
    public static void main(String[] args) {
        BankAccount client1 = new BankAccount(10000, "Atharv", 101);
        client1.displayDetails();   // ✅ correct
    }
}
