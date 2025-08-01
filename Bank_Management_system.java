import java.util.Scanner;
//25 july 2025

public class Bank_Management_system {
    static double currentBalance = 104567.78;
    static double loanAmount = 0;
    static double interestRate = 0.08; // 8%

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n---- Welcome to Simple Bank ----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Apply for Loan");
            System.out.println("5. View Loan Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                checkBalance();
            } else if (choice == 2) {
                depositMoney();
            } else if (choice == 3) {
                withdrawMoney();
            } else if (choice == 4) {
                applyForLoan();
            } else if (choice == 5) {
                viewLoanDetails();
            } else if (choice == 6) {
                System.out.println("Thank you for banking with us!");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }

    static void checkBalance() {
        System.out.println("Your current balance is: ₹" + currentBalance);
    }

    static void depositMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ₹");
        double amount = sc.nextDouble();

        if (amount > 0) {
            currentBalance += amount;
            System.out.println("₹" + amount + " deposited successfully. New balance: ₹" + currentBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    static void withdrawMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ₹");
        double amount = sc.nextDouble();

        if (amount > 0 && amount <= currentBalance) {
            currentBalance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully. New balance: ₹" + currentBalance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    static void applyForLoan() {
        Scanner sc = new Scanner(System.in);
        if (loanAmount > 0) {
            System.out.println("You already have an active loan.");
            return;
        }

        System.out.print("Enter loan amount: ₹");
        loanAmount = sc.nextDouble();

        if (loanAmount <= 0) {
            System.out.println("Invalid loan amount.");
            loanAmount = 0;
            return;
        }

        double interest = loanAmount * interestRate;
        double totalPayable = loanAmount + interest;

        System.out.println("Loan approved for ₹" + loanAmount + " at " + (interestRate * 100) + "% interest.");
        System.out.println("Total repayable amount: ₹" + totalPayable);
    }

    static void viewLoanDetails() {
        if (loanAmount == 0) {
            System.out.println("You have no active loans.");
        } else {
            double interest = loanAmount * interestRate;
            double totalPayable = loanAmount + interest;

            System.out.println("---- Loan Details ----");
            System.out.println("Loan Amount: ₹" + loanAmount);
            System.out.println("Interest Rate: " + (interestRate * 100) + "%");
            System.out.println("Total Amount to Repay: ₹" + totalPayable);
        }
    }
}
