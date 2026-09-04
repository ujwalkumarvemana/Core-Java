package Java.OOPS.Encapsulation.Example2;

public class EmployeeDetailsB {
  public static void main(String[] args) {
    EmployeeDetailsA aobj = new EmployeeDetailsA(50000);
    aobj.setName("John");
    System.out.println("NAME: " + aobj.getName());
    System.out.println("Initial Salary: " + aobj.getSalary());
    aobj.increaseSalary(0.10);
    System.out.println("Increase Salary by: 10%");
    System.out.println("Final Salary: " + aobj.getSalary());
  }
}