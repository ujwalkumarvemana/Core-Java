package Java.OOPS.Encapsulation;

import java.util.Scanner;

public class ClassB {
  Scanner sc = new Scanner(System.in);
  ClassA aobj = new ClassA();

  void meth1() {
    System.out.println("Meth1 is called");
    System.out.println("Enter Student Name");
    aobj.setStuName(sc.nextLine());
    System.out.println("Enter Student Roll Number");
    aobj.setStuRollNumber(Integer.parseInt(sc.nextLine()));
    System.out.println("Enter Student Branch");
    aobj.setStuBranch(sc.nextLine());
    System.out.println("Enter Student Fee");
    aobj.setStuFee(Integer.parseInt(sc.nextLine()));

    System.out.println("Student Full details");
    System.out.println("Student Name " + aobj.getStuName());
    System.out.println("Student Roll Number " + aobj.getStuRollNumber());
    System.out.println("Student Branch " + aobj.getStuBranch());
    System.out.println("Student Actual Fee " + aobj.getStuFee());
    System.out.println("Student Fee after disconnect" + aobj.finalFee(aobj.getStuFee()));
  }

  public static void main(String[] args) {
    ClassB bobj = new ClassB();
    bobj.meth1();
  }
}
