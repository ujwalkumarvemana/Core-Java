package Java.OOPS.Inheritance.Example2;

import javax.sound.midi.Soundbank;

public class ClassA {
  void meth1() {
    System.out.println("Meth1() called");
  }

  ClassA() {
    this(500);
    System.out.println("parent class default comstructor");
  }

  ClassA(int x) {
    System.out.println("parent class parameterized constructor " + x);
  }
}
