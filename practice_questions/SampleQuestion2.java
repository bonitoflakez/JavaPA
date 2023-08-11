public class SampleQuestion2 {
  public abstract class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
      this.accountNumber = accountNumber;
      this.balance = balance;
    }

    public void deposit(double amount) {
      balance += amount;
    }

    public void withdraw(double amount) {
      balance -= amount;
    }

    public double getBalance() {
      return balance;
    }

    public void printAccountInfo() {
      System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
  }

  public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
      super(accountNumber, balance);
      this.interestRate = interestRate;
    }

    public void applyInterest() {
      double interestAmount = getBalance() * interestRate;
      deposit(interestAmount);
    }
  }

  public class CheckingAccount extends BankAccount {
    private double transactionFee;

    public CheckingAccount(int accountNumber, double balance, double transactionFee) {
      super(accountNumber, balance);
      this.transactionFee = transactionFee;
    }

    public double deductTransactionFee() {
      double transactionAmount = getBalance() - transactionFee;
      return transactionAmount;
    }
  }

  public static void main(String[] args) {
    SavingsAccount savingsAccount = new SampleQuestion2().new SavingsAccount(101, 1000.0, 0.05);
    CheckingAccount checkingAccount = new SampleQuestion2().new CheckingAccount(201, 2000.0, 10.0);

    savingsAccount.applyInterest();
    checkingAccount.deductTransactionFee();

    savingsAccount.printAccountInfo();
    checkingAccount.printAccountInfo();
  }
}