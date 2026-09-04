package Java.OOPS.Encapsulation.Example1;

public class PersonalAccountBalanceB extends PersonalAccountBalanceA {

  public static void main(String[] args) {
    PersonalAccountBalanceA aobj = new PersonalAccountBalanceB();
    aobj.setAccountNumber("ACC1001");
    aobj.deposit(5000);
    aobj.deposit(2500);
    System.out.println("AccountNumber :" + aobj.getAccountNumber());
    System.out.println("balance :" + aobj.getBalance());
  }
}
