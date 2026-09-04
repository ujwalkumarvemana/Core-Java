package Java.CollectionFramework.ArrayListExample.Example2;

import java.util.ArrayList;

public class ClassB {
  ArrayList<StudentDetails> meth1(ArrayList<String> al1, boolean arr[], ArrayList<Integer> al2) {
    System.out.println("---------------TASK1-------------");
    for (int i = al1.size() - 1; i >= 0; i--) {
      System.out.println("reverse direction " + al1.get(i) + " ");
    }
    System.out.println("---------------TASK2-------------");
    for (boolean data : arr) {
      System.out.println(data);
    }
    System.out.println("---------------TASK3-------------");
    ArrayList<Integer> al3 = new ArrayList<Integer>();
    for (int i = al2.size() - 1; i >= 0; i--) {
      al3.add(al2.get(i));
    }
    System.out.println("al3" + al3);

    ArrayList<StudentDetails> studentDetail = new ArrayList<StudentDetails>();
    studentDetail.add(new StudentDetails("RAM", "CSE", 100, 10));
    studentDetail.add(new StudentDetails("Seetha", "SE", 90, 10));
    studentDetail.add(new StudentDetails("HANUMAN", "CE", 80, 10));
    studentDetail.add(new StudentDetails("LAKSHMANA", "CSE", 85, 10));
    return studentDetail;
  }

  public static void main(String[] args) {
    ClassB bobj = new ClassB();
    ArrayList<String> al1 = new ArrayList<String>();
    al1.add(" RAM");
    al1.add(" Seetha");
    al1.add(" HANUMAN");
    al1.add(" LAKSHMANA");
    System.out.println(al1);
    ArrayList<Integer> al2 = new ArrayList<Integer>();
    al2.add(100);
    al2.add(101);
    al2.add(103);
    al2.add(104);

    boolean arr[] = { false, true, true };

    ArrayList<StudentDetails> stuDetail = bobj.meth1(al1, arr, al2);
    System.out.println("---------------TASK4------------------");
    System.out.println(stuDetail);

  }
}
