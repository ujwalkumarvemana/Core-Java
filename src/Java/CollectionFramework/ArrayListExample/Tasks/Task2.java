package Java.CollectionFramework.ArrayListExample.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> al = new ArrayList<String>();
    System.out.println("Please enter first string value");
    al.add(sc.nextLine());
    System.out.println("Please enter Second string value");
    al.add(sc.nextLine());
    System.out.println("Please enter Third string value");
    al.add(sc.nextLine());
    System.out.println("Please enter fourth string value");
    al.add(sc.nextLine());
    System.out.println("Please enter fifth string value");
    al.add(sc.nextLine());
    System.out.println("Arraylist al");
    System.out.println(al);

  }
}
