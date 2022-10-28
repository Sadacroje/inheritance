import java.util.Scanner;


public class Student extends Person{
private String program;
private int yearLevel;

  
public Student()
{
  
Scanner sc = new Scanner(System.in);
System.out.print("Enter Enrolled Program name: ");
String program = sc.next();
sc.nextLine();
System.out.print("Enter Year Level: ");
int year_level = sc.nextInt();
setYearLevel(year_level);
setProgram(program);
}
public String getProgram() {
return program;
}

public void setProgram(String program) {
this.program = program;
}

public int getYearLevel() {
return yearLevel;
}

public void setYearLevel(int yearLevel) {
this.yearLevel = yearLevel;
}

@Override
public String toString() {
return "Name: " + getName() + "\tContact Number:" + getContactNum() + "\tProgram:" + getProgram()+ "\tYear Level:" + getYearLevel();
}
  
  
}