package Java.OOPS.Encapsulation.Example1;

public class PersonalAccountBalanceA {
  private String accountNumber;
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  private double balance;

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  void deposit(double amount) {
    balance = balance + amount;
  }

}
