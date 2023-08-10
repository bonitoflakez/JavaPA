**Question: Java Inheritance and Polymorphism**

You are tasked with implementing a simple banking system to demonstrate your understanding of inheritance, polymorphism, and abstraction concepts in Java. The system involves different types of bank accounts and transactions.

Here's the scenario:

You need to create a banking system with the following classes:

1. **BankAccount** (Abstract Class):
   - Properties: accountNumber (int), balance (double)
   - Methods:
     - `deposit(double amount)` - Adds the given amount to the balance.
     - `withdraw(double amount)` - Subtracts the given amount from the balance.
     - `getBalance()` - Returns the current balance.
     - `toString()` - Returns a string representation of the account in the format: "Account Number: \<accountNumber\>, Balance: \<balance\>"

2. **SavingsAccount** (Subclass of BankAccount):
   - Additional Property: interestRate (double)
   - Constructor: `SavingsAccount(int accountNumber, double balance, double interestRate)`
   - Method:
     - `applyInterest()` - Adds the calculated interest to the balance.

3. **CheckingAccount** (Subclass of BankAccount):
   - Additional Property: transactionFee (double)
   - Constructor: `CheckingAccount(int accountNumber, double balance, double transactionFee)`
   - Method:
     - `deductTransactionFee()` - Deducts the transaction fee from the balance.

Write the above classes, ensuring appropriate inheritance, method overriding, and method implementations. Once you have implemented the classes, create an array of BankAccount references to demonstrate polymorphism by performing the following operations:

1. Create a SavingsAccount and a CheckingAccount object.
2. Deposit $1000 to each account.
3. Apply interest to the SavingsAccount.
4. Deduct transaction fee from the CheckingAccount.
5. Withdraw $500 from each account.
6. Print the account details (including balance) for both accounts.
