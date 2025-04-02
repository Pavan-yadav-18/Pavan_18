package edubridge;
import java.util.Scanner;

public class SimpleBankingApplication {
	

	 private double balance;

	public SimpleBankingApplication(double initialBalance) {
	    this.balance = initialBalance;
	}

	public void checkBalance() {
	    System.out.println("Current balance: $" + balance);
	}

	public void deposit(double amount) {
	    if (amount > 0) {
	        balance += amount;
	        System.out.println("Deposited: $" + amount);
	    } else {
	        System.out.println("Invalid deposit amount.");
	    }
	}

	public void withdraw(double amount) {
	    if (amount > 0 && amount <= balance) {
	        balance -= amount;
	        System.out.println("Withdrawn: $" + amount);
	    } else {
	        System.out.println("Invalid withdrawal amount or insufficient balance.");
	    }
	}

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    SimpleBankingApplication account = new SimpleBankingApplication(1000.00);
	    int choice;

	    do {
	        System.out.println("\nSimple Banking System");
	        System.out.println("1. Check Balance");
	        System.out.println("2. Deposit");
	        System.out.println("3. Withdraw");
	        System.out.println("4. Exit");
	        System.out.print("Enter your choice: ");
	        choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                account.checkBalance();
	                break;
	            case 2:
	                System.out.print("Enter deposit amount: ");
	                double depositAmount = scanner.nextDouble();
	                account.deposit(depositAmount);
	                break;
	            case 3:
	                System.out.print("Enter withdrawal amount: ");
	                double withdrawAmount = scanner.nextDouble();
	                account.withdraw(withdrawAmount);
	                break;
	            case 4:
	                System.out.println("Exiting... Thank you!");
	                break;
	            default:
	                System.out.println("Invalid choice! Please try again.");
	        }
	    } while (choice != 4);

	    scanner.close();
	}

	}

