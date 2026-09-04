package Java.CollectionFramework.ArrayListExample.Example1;

public class StudentDetails {
  private String studentName;
  private String studentBranch;
  private int studentRollNumber;
  private int studentAge;

  // ctrl + . to create a constructor shortcut
  public StudentDetails(String studentName, String studentBranch, int studentRollNumber, int studentAge) {
    this.studentName = studentName;
    this.studentBranch = studentBranch;
    this.studentRollNumber = studentRollNumber;
    this.studentAge = studentAge;
  }

  @Override
  public String toString() {
    return studentName + "-->" + studentBranch + "-->" +
        studentRollNumber + "-->" + studentAge;
  }


  public int getStudentAge() {
    return studentAge;
  }

}
