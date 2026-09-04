package Java.CollectionFramework.ArrayListExample.Example1;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassA {
  void meth1() {
    StudentDetails firstStudentDetails = new StudentDetails("UJWAL", "ECE", 123, 23);
    StudentDetails secondStudentDetails = new StudentDetails("SADWIKA", "CSE", 124, 21);
    StudentDetails thirdStudentDetails = new StudentDetails("KEERTHI", "MED", 125, 22);
    StudentDetails fouthStudentDetails = new StudentDetails("SRIKANTH", "EEE", 126, 25);

    ArrayList<StudentDetails> al = new ArrayList<StudentDetails>();
    al.add(firstStudentDetails);
    al.add(secondStudentDetails);
    al.add(thirdStudentDetails);
    al.add(fouthStudentDetails);
    System.out.println("al values" + al);

    System.out.println("\nthere are " + al.size() + " objects present in Arraylist");
    Iterator<StudentDetails> i = al.iterator();
    while (i.hasNext()) {
      System.out.print("Details " + i.next() + " \n");
    }
    System.out.println("\n=============================================");
    System.out.println("Displaying the students details whose age is 22 or above");
    Iterator<StudentDetails> i2 = al.iterator();
    while (i2.hasNext()) {
      StudentDetails stuDetails = i2.next();
      if (stuDetails.getStudentAge() >= 22) {
        System.out.println(stuDetails);
      }
    }
  }

  public static void main(String[] args) {
    ClassA aobj = new ClassA();
    aobj.meth1();
  }
}
