package Java.OOPS.Encapsulation.Example2;

public class EmployeeDetailsA {
  private String name;
  private double salary;

  public EmployeeDetailsA(double salary) {
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void increaseSalary(double percentage) {
    salary = salary + (salary * percentage);
  }
}
