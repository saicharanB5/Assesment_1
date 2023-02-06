package dxc;

import java.util.Scanner;

public class Eligible_loan_Amount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int accountNumber;
    double accountBalance, salary, loanAmountExpected, emisExpected;
    String loanType;

    System.out.print("Enter account number: ");
    accountNumber = sc.nextInt();
    if (accountNumber < 1000 || accountNumber > 9999) {
      System.out.println("Account number should be 4 digits and its first digit should be 1");
      return;
    }

    System.out.print("Enter account balance: ");
    accountBalance = sc.nextInt();
    if (accountBalance < 1000) {
      System.out.println("Customer should have a minimum balance of $1000 in the account");
      return;
    }

    System.out.print("Enter salary: ");
    salary = sc.nextInt();

    System.out.print("Enter loan type (Car, House, or Business): ");
    loanType = sc.next();

    System.out.print("Enter expected loan amount: ");
    loanAmountExpected = sc.nextInt();

    System.out.print("Enter expected number of EMIs: ");
    emisExpected = sc.nextInt();

    int eligibleLoanAmount = 0, eligibleEmis = 0;
    if (salary > 25000 && loanType.equals("Car")) {
      eligibleLoanAmount = 500000;
      eligibleEmis = 36;
    } else if (salary > 50000 && loanType.equals("House")) {
      eligibleLoanAmount = 6000000;
      eligibleEmis = 60;
    } else if (salary > 75000 && loanType.equals("Business")) {
      eligibleLoanAmount = 75000000;
      eligibleEmis = 120;
    } else {
      System.out.println("Loan not eligible");
      return;
    }

    if (loanAmountExpected > eligibleLoanAmount || emisExpected > eligibleEmis) {
      System.out.println("Loan not provided by the bank");
    } else {
      System.out.println("Account number: " + accountNumber);
      System.out.println("Eligible loan amount: " + eligibleLoanAmount);
      System.out.println("Requested loan amount: " + loanAmountExpected);
      System.out.println("Eligible EMIs: " + eligibleEmis);
      System.out.println("Eligible Loan Amount: " +eligibleLoanAmount );
    }
  }
}