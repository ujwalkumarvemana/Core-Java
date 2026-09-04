package Java.CollectionFramework.ArrayListExample.Example2;

public class StudentDetails {
  private String studentName;
  private String studentBranch;
  private int studentMarks;
  private int studentClass;

  // ctrl + . to create a constructor shortcut
  public StudentDetails(String studentName, String studentBranch, int studentMarks, int studentClass) {
    this.studentName = studentName;
    this.studentBranch = studentBranch;
    this.studentMarks = studentMarks;
    this.studentClass = studentClass;
  }

  @Override
  public String toString() {
    return studentName + "-->" +
        studentMarks;
  }

}
