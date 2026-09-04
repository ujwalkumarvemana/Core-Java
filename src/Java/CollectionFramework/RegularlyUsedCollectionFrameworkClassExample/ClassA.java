package Java.CollectionFramework.RegularlyUsedCollectionFrameworkClassExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassA {
  void meth1() {
    System.out.println("Implementing ArrayList and How to add objects to arrayList");
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(10); // Insertion order is maintained
    al.add(20); // heterogeous data is allowed
    al.add(null); // null value is allowed
    al.add(30); // Duplicate values are allowed
    al.add(40); // it is available from java v 1.2
    al.add(70); // Its default caapacity value is 10
    al.add(50); // its size increase by half((current capacity*3/2)+1)
    al.add(60); // it is Not synchronized

    System.out.println(al);
    System.out.println("Size() :" + al.size());
    System.out.println("get() :" + al.get(0));
    System.out.println("get() last value of list :" + al.get(al.size() - 1));
    System.out.println("Reteriving data in forward direction using forloop");
    for (int i = 0; i <= al.size() - 1; i++) {
      System.out.print(al.get(i) + " ");
    }
    System.out.println("\nReteriving data in reverse direction using for loop");
    for (int i = al.size() - 1; i >= 0; i--) {
      System.out.print(al.get(i) + " ");
    }
    System.out.println("\nReteriving data using for each");
    for (Integer data : al) {
      System.out.print(data + " ");
    }

    System.out.println("\nReterving data using iterator interface");
    Iterator<Integer> i = al.iterator();
    while (i.hasNext()) {
      System.out.print(i.next() + " ");
    }
    System.out.println("\n\n ---------------------Methods---------------------");
    System.out.println("isEmpty() :" + al.isEmpty());
    // al.clear(); // removes all the elements in our arraylist
    // System.out.println("isEmpty() :" + al.isEmpty());
    System.out.println("contains() :" + al.contains(20));
    ArrayList<Integer> al2 = new ArrayList<Integer>();
    al2.add(50);
    al2.add(10);
    System.out.println("containsAll()" + al.containsAll(al2));
    System.out.print("Before al" + al);
    al.addAll(al2);
    System.out.print("\nAfter values al" + al);
    al.set(0, 100);
    System.out.print("\nAfter values al" + al);
    al.add(al.size(), 200);
    System.out.print("\nAfter values al" + al);
    al.remove((Object) 10);
    System.out.print("\nAfter values al" + al);
    // al.removeAll(al2);
    al.retainAll(al2);
    System.out.print("\nAfter values al" + al);
  }

  public static void main(String[] args) {
    ClassA aobj = new ClassA();
    aobj.meth1();
  }
}
