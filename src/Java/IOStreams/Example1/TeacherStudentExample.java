import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Scanner;

public class TeacherStudentExample {
  void enterStudentTeacher() throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("If you are Teacher press 1");
    System.out.println("if you are Student press 2");
    int value = Integer.parseInt(sc.nextLine());
    if (value == 1) {
      System.out.println("Welcome!!! enter your name");
      String name = sc.nextLine();
      System.out.println("Hello " + name + " give some questions to your students");
      String question = sc.nextLine();
      BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(
          "C:\\Users\\ujwal\\OneDrive\\Desktop\\JAVA CLASS NARESH IT\\New Text Document.txt", true));
      System.out.println("Thank you!!!");
      bos.write(question.getBytes());
      bos.close();
    } else {
      System.out.println("Welcome!!! enter your name");
      String name = sc.nextLine();
      System.out.println("Hello " + name + " give answers to for this questions");
      BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
          "C:\\Users\\ujwal\\OneDrive\\Desktop\\JAVA CLASS NARESH IT\\New Text Document.txt"));
      int i;
      while ((i = bis.read()) != -1) {
        System.out.print((char) i);
      }
      System.out.println("/n");
      String answer = sc.nextLine();
      BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(
          "C:\\Users\\ujwal\\OneDrive\\Desktop\\JAVA CLASS NARESH IT\\New Text Document.txt", true));
      System.out.println("Thank you!!!");
      bos.write(answer.getBytes());
      bis.close();
      bos.close();
    }
  }

  public static void main(String[] args) throws Exception {
    TeacherStudentExample aobj = new TeacherStudentExample();
    aobj.enterStudentTeacher();
  }
}
