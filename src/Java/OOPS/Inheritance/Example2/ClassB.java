package Java.OOPS.Inheritance.Example2;

public class ClassB extends ClassA {
  void meth2() {
    System.out.println("Meth2() called");
  }

  ClassB() {
    super.meth1();
    new ClassB("java");
    System.out.println("child classes default constructor");
  }

  ClassB(String s) {
    super();
    this.meth2();
    super.meth1();
    System.out.println("child class parameterized constructor " + s);
  }

  public static void main(String[] args) {
    new ClassB();
  }
}
