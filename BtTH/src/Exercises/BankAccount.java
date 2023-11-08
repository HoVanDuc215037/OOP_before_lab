package Exercises;

public class BankAccount {
	    private String ownerName;
	    private String accountNumber;
	    private double balance;

	    public BankAccount(String ownerName, String accountNumber, double initialBalance) {
	        this.ownerName = ownerName;
	        this.accountNumber = accountNumber;
	        if (initialBalance < 50000) {
	            System.out.println("Initial balance must be at least VND 50,000.");
	            this.balance = 50000; // Set a minimum balance of VND 50,000
	        } else {
	            this.balance = initialBalance;
	        }
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: VND " + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0) {
	            if (balance - amount - 5000 >= 50000) {
	                balance -= (amount + 5000);
	                System.out.println("Withdrawn: VND " + amount + " (including VND 5,000 fee)");
	            } else {
	                System.out.println("Insufficient balance.");
	            }
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }

	    public void increaseBalance(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Increased balance by VND " + amount);
	        } else {
	            System.out.println("Invalid increase amount.");
	        }
	    }

	    public void decreaseBalance(double amount) {
	        if (amount > 0) {
	            if (balance - amount >= 50000) {
	                balance -= amount;
	                System.out.println("Decreased balance by VND " + amount);
	            } else {
	                System.out.println("Insufficient balance.");
	            }
	        } else {
	            System.out.println("Invalid decrease amount.");
	        }
	    }

	    public void displayBalance() {
	        System.out.println("Account Balance: VND " + balance);
	    }

	    public static void main(String[] args) {
	        BankAccount account = new BankAccount("John Doe", "123456", 100000);
	        account.displayBalance();
	        account.deposit(50000);
	        account.withdraw(30000);
	        account.increaseBalance(20000);
	        account.decreaseBalance(60000);
	        account.displayBalance();
	    }
}

