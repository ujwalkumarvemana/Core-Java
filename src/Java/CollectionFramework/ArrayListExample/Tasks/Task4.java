package Java.CollectionFramework.ArrayListExample.Tasks;

import java.util.ArrayList;

public class Task4 {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);
    al.add(5);
    ArrayList<Integer> al1 = new ArrayList<Integer>();
    al1.add(11);
    al1.add(21);
    al1.add(31);
    al1.add(41);
    al1.add(51);

    al.addAll(al1);
    System.out.println("Final output " + al);
  }
}
