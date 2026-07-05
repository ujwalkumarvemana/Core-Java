package Java.OOPS.Encapsulation;
// ------------------------------------------------------------------------------------------

// Encapsulation is process of making the fields "private" and providing access to 
// those fields with "public" methods ie; through "getter" and "setter".

// ------------------------------------------------------------------------------------------

//  Ctrl + . for setter and getter to create

// ------------------------------------------------------------------------------------------

// Project: Print full student details using Encapsulation concept like name,roll no,branch,fee 
// and if fee is greater then 6000 discount is 30% else case 15% by using setter and getter(ClassA).
// getting all details from ClassB

// ------------------------------------------------------------------------------------------
public class ClassA {

  private String stuName;
  private int stuRollNumber;
  private String stuBranch;
  private int stuFee;

  public int finalFee(int stuFee) {
    if (stuFee >= 3000) {
      return stuFee -= stuFee * 15 / 100;
    }
    return stuFee -= stuFee * 30 / 100;
  }

  public int getStuFee() {
    return stuFee;
  }

  public void setStuFee(int stuFee) {
    this.stuFee = stuFee;
  }

  public String getStuName() {
    return stuName;
  }

  public void setStuName(String stuName) {
    this.stuName = stuName;
  }

  public int getStuRollNumber() {
    return stuRollNumber;
  }

  public void setStuRollNumber(int stuRollNumber) {
    this.stuRollNumber = stuRollNumber;
  }

  public String getStuBranch() {
    return stuBranch;
  }

  public void setStuBranch(String stuBranch) {
    this.stuBranch = stuBranch;
  }

  public static void main(String[] args) {
    System.out.println();
  }
}
