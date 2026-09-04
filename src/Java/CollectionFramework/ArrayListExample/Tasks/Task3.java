package Java.CollectionFramework.ArrayListExample.Tasks;

import java.util.ArrayList;

public class Task3 {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(19);
    al.add(20);
    al.add(21);
    al.add(22);
    al.add(23);
    al.add(24);
    System.out.println("ArrayList al" + al);
    for (int i = 0; i <= al.size() - 1; i++) {
      if (al.get(i) % 2 == 0) {
        al.remove(i);
      }
    }
    System.out.println("final ArrayList al" + al);
  }
}
